package main

import (
	"encoding/json"
	"io/ioutil"
	"net/http"
	"strconv"

	"github.com/gin-contrib/cors"
	"github.com/gin-gonic/gin"
)

// Modelos y comentarios equivalentes a Python
// Local representa un local
// TIPOS_MAP simula el mapeo de tipos como en Java

type Tipo string

const (
	ALOJAMIENTO             Tipo = "ALOJAMIENTO"
	RESTAURANTE             Tipo = "RESTAURANTE"
	TIENDA                  Tipo = "TIENDA"
	RESTAURANTE_ALOJAMIENTO Tipo = "RESTAURANTE_ALOJAMIENTO"
	ACTIVIDAD               Tipo = "ACTIVIDAD"
)

// Mapeo de tipos con valor asociado
var TipoValores = map[string]string{
	"ALOJAMIENTO":             "Alojamiento",
	"RESTAURANTE":             "Restaurante",
	"RESTAURANTE_ALOJAMIENTO": "Alojamiento/Restaurante",
	"TIENDA":                  "Tienda",
	"ACTIVIDAD":               "Actividad",
}

var TIPOS_MAP = map[int]string{
	0: "ALOJAMIENTO",
	1: "RESTAURANTE",
	2: "TIENDA",
	3: "RESTAURANTE_ALOJAMIENTO",
	4: "ACTIVIDAD",
}

// Modelo Local alineado con Java
type Local struct {
	ID          int     `json:"id"`
	Type        string  `json:"type"`
	Nombre      string  `json:"nombre"`
	Direccion   string  `json:"direccion"`
	Telefono    string  `json:"telefono"`
	Latitud     float64 `json:"latitud"`
	Longitud    float64 `json:"longitud"`
	Web         string  `json:"web"`
	Imagen      string  `json:"imagen"`
	Comentario  string  `json:"comentario"`
	IsContestant bool   `json:"isContestant"`
	InProgress   bool   `json:"inProgress"`
}

// getLocales carga los locales desde un archivo JSON y ajusta el type a valor descriptivo
func getLocales() []Local {
	data, err := ioutil.ReadFile("locales.json")
	if err != nil {
		return []Local{}
	}
	var rawLocales []map[string]interface{}
	json.Unmarshal(data, &rawLocales)
	var locales []Local
	for _, rl := range rawLocales {
		tipoStr, _ := rl["type"].(string)
		local := Local{
			ID: int(rl["id"].(float64)),
			Type: tipoStr,
			Nombre: rl["nombre"].(string),
			Direccion: rl["direccion"].(string),
			Telefono: rl["telefono"].(string),
			Latitud: rl["latitud"].(float64),
			Longitud: rl["longitud"].(float64),
			Web: rl["web"].(string),
			Imagen: rl["imagen"].(string),
			Comentario: rl["comentario"].(string),
			IsContestant: false,
			InProgress: false,
		}
		if v, ok := rl["isContestant"]; ok {
			if v != nil {
				local.IsContestant = v.(bool)
			}
		}
		if v, ok := rl["inProgress"]; ok {
			if v != nil {
				local.InProgress = v.(bool)
			}
		}
		locales = append(locales, local)
	}
	return locales
}

func main() {
	r := gin.Default()

	// Configuración CORS para https://cangassingluten.com
	config := cors.Config{
		AllowOrigins:     []string{"https://cangassingluten.com"},
		AllowMethods:     []string{"GET", "POST", "PUT", "DELETE", "OPTIONS"},
		AllowHeaders:     []string{"Origin", "Content-Type", "Accept", "Authorization"},
		ExposeHeaders:    []string{"Content-Length"},
		AllowCredentials: true,
	}
	r.Use(cors.New(config))

	// GET /cangas-api/locales/
	r.GET("/cangas-api/locales/", func(c *gin.Context) {
		c.JSON(http.StatusOK, getLocales())
	})

	// GET /cangas-api/tipo/:tipo/
	r.GET("/cangas-api/tipo/:tipo/", func(c *gin.Context) {
		tipoParam := c.Param("tipo")
		tipoInt, err := strconv.Atoi(tipoParam)
		if err != nil {
			c.JSON(http.StatusBadRequest, gin.H{"error": "Tipo debe ser un número"})
			return
		}
		locales := getLocales()
		if tipoInt == -1 {
			c.JSON(http.StatusOK, locales)
			return
		}
		_, ok := TIPOS_MAP[tipoInt]
		if !ok {
			c.JSON(http.StatusOK, []Local{})
			return
		}
		var result []Local
		tipoClave := TIPOS_MAP[tipoInt]
		tipoDesc := TipoValores[tipoClave]
		if tipoInt == 0 || tipoInt == 1 {
			for _, l := range locales {
				if l.Type == tipoDesc || l.Type == TipoValores["RESTAURANTE_ALOJAMIENTO"] {
					result = append(result, l)
				}
			}
		} else {
			for _, l := range locales {
				if l.Type == tipoDesc {
					result = append(result, l)
				}
			}
		}
		c.JSON(http.StatusOK, result)
	})

	// GET /cangas-api/id/:id/
	r.GET("/cangas-api/id/:id/", func(c *gin.Context) {
		idParam := c.Param("id")
		idInt, err := strconv.Atoi(idParam)
		if err != nil {
			c.JSON(http.StatusBadRequest, gin.H{"error": "ID debe ser un número"})
			return
		}
		locales := getLocales()
		for _, l := range locales {
			if l.ID == idInt {
				c.JSON(http.StatusOK, l)
				return
			}
		}
		c.JSON(http.StatusNotFound, gin.H{"detail": "Local not found"})
	})

	// GET /cangas-api/:id/ (compatibilidad con rutas antiguas)
	r.GET("/cangas-api/:id/", func(c *gin.Context) {
		idParam := c.Param("id")
		idInt, err := strconv.Atoi(idParam)
		if err != nil {
			c.JSON(http.StatusBadRequest, gin.H{"error": "ID debe ser un número"})
			return
		}
		locales := getLocales()
		for _, l := range locales {
			if l.ID == idInt {
				c.JSON(http.StatusOK, l)
				return
			}
		}
		c.JSON(http.StatusNotFound, gin.H{"detail": "Local not found"})
	})

	// GET /cangas-api/jornadas/
	r.GET("/cangas-api/jornadas/", func(c *gin.Context) {
		locales := getLocales()
		var result []Local
		for _, l := range locales {
			if l.IsContestant {
				result = append(result, l)
			}
		}
		c.JSON(http.StatusOK, result)
	})

	// Endpoint para devolver el mapeo de tipos con valores asociados
	// GET /cangas-api/tipos/
	r.GET("/cangas-api/tipos/", func(c *gin.Context) {
		tiposResp := make(map[int]string)
		for k, v := range TIPOS_MAP {
			tiposResp[k] = TipoValores[v]
		}
		c.JSON(http.StatusOK, tiposResp)
	})

	// HTTPS con certificados propios (producción: fullchain.pem y privkey.pem de Let's Encrypt)
	r.RunTLS(":8443", "certs/fullchain.pem", "certs/privkey.pem")
}

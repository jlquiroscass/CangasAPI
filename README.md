# CangasAPI

CangasAPI es una API desarrollada en Go para la gestión y consulta de locales en Cangas del Narcea. El proyecto expone endpoints REST para acceder a información de alojamientos, restaurantes, tiendas y actividades, con soporte para HTTPS y despliegue en Docker.

## Estructura del proyecto

- `main.go`: Código principal de la API y definición de endpoints.
- `locales.json`: Base de datos de locales en formato JSON.
- `data/locales_comentados.txt`: Comentarios y descripciones extendidas de locales.
- `certs/`: Certificados SSL para HTTPS (`fullchain.pem`, `privkey.pem`).
- `docker-compose.yml` y `Dockerfile`: Archivos para contenerización y despliegue.
- `go.mod` y `go.sum`: Gestión de dependencias Go.

## Endpoints principales

- `GET /cangas-api/locales/`: Lista todos los locales.
- `GET /cangas-api/tipo/:tipo/`: Filtra locales por tipo (0=Alojamiento, 1=Restaurante, 2=Tienda, 3=Alojamiento/Restaurante, 4=Actividad).
- `GET /cangas-api/id/:id/` y `GET /cangas-api/:id/`: Obtiene un local por ID.
- `GET /cangas-api/jornadas/`: Lista locales participantes en jornadas (isContestant).
- `GET /cangas-api/tipos/`: Devuelve el mapeo de tipos disponibles.

## Ejemplo de datos

El archivo `locales.json` contiene información como:
```json
{
  "id": 45,
  "type": "Tienda",
  "nombre": "Embutidos Santulaya",
  "direccion": "Santa Eulalia de Cueras, 16, 33800",
  "telefono": "985 812 660",
  "latitud": 43.1417737,
  "longitud": -6.591144,
  "web": "www.santulaya.com",
  "imagen": "images/locales/santulaya.jpg",
  "comentario": "",
  "isContestant": null,
  "inProgress": false
}
```

## Cómo ejecutar

1. Instala dependencias:
   ```bash
   go mod tidy
   ```
2. Ejecuta la API:
   ```bash
   go run main.go
   ```
3. Despliegue con Docker:
   ```bash
   docker-compose up --build
   ```

La API se expone por defecto en el puerto 8443 con HTTPS.

## Seguridad

Incluye certificados para HTTPS. En producción, usa los certificados de Let's Encrypt (`fullchain.pem`, `privkey.pem`).

## Licencia

MIT

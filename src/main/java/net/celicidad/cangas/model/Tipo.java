package net.celicidad.cangas.model;

import java.util.HashMap;

public class Tipo {
    public static String ALOJAMIENTO = "Alojamiento";
    public static String RESTAURANTE = "Restaurante";
    public static String RESTAURANTE_ALOJAMIENTO = "Alojamiento/Restaurante";
    public static String TIENDA = "Tienda";
    public static String ACTIVIDAD = "Actividad";

    private static HashMap<Long, String> tipos = new HashMap<Long, String>(){{
        put(0L, ALOJAMIENTO);
        put(1L, RESTAURANTE);
        put(2L, TIENDA);
        put(3L, RESTAURANTE);
        put(4L, ACTIVIDAD);
    }} ;

    public static HashMap<Long, String> getTipos() {
        return tipos;
    }
}

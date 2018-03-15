package net.celicidad.cangas.model;

import java.util.HashMap;

public class Tipo {
    public static String ALOJAMIENTO = "Alojamiento";
    public static String RESTAURANTE = "Restaurante";

    private static HashMap<Long, String> tipos = new HashMap<Long, String>(){{
        put(0L, ALOJAMIENTO);
        put(1L, RESTAURANTE);
    }} ;

    public static HashMap<Long, String> getTipos() {
        return tipos;
    }
}

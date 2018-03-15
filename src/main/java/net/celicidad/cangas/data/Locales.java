package net.celicidad.cangas.data;

import net.celicidad.cangas.model.Local;
import net.celicidad.cangas.model.Tipo;

import java.util.ArrayList;
import java.util.List;

public class Locales {

    public static List<Local> listaLocales() {
        List<Local> locales = new ArrayList<Local>() {{
            add(new Local(1, Tipo.ALOJAMIENTO, "Casa María Cecilia" , "Vega de Rengos, 19, 33813. Vega de Rengos" , "9858911132" , 0D, 0D, "https://116isa.wixsite.com/casamariacecilia"));
            add(new Local(2, Tipo.ALOJAMIENTO, "Hotel Rural El Mirador de Fuentes del Narcea" , "" , "985911104/676703379" , 0D, 0D, "http://www.elmiradordefuentesdelnarcea.com/"));
            add(new Local(3, Tipo.ALOJAMIENTO, "Apartamentos Rurales Ardaliz" , "" , "617066289/ 985811155" , 0D, 0D, "http://ardaliz.com/"));
            add(new Local(4, Tipo.ALOJAMIENTO, "Casa Xoaquín " , "Moal, 35" , "985 911 140 / 646 66 89 32" , 0D, 0D, ""));
            add(new Local(5, Tipo.ALOJAMIENTO, "La Pumarada de Limés" , "Limés, 38, " , " (34) 985 811 407 /676237481   " , 0D, 0D, "http://lapumaradadelimes.es/"));
            add(new Local(6, Tipo.ALOJAMIENTO, "Casa Mario " , "Posada de Rengos, 33811" , "985 911 198 / 637 86 75 66" , 0D, 0D, "http://www.casamario.net/"));
            add(new Local(7, Tipo.ALOJAMIENTO, "Casa de Aldea La Pescal" , "" , "686560857" , 0D, 0D, ""));
            add(new Local(8, Tipo.ALOJAMIENTO, "Hotel Ana Obanca" , "C/ Obanca, nº15, Carretera De Besullo km-0,6, 33800 CdelN" , "985 811 716" , 0D, 0D, "http://www.hotelana-asturias.com/es-es/"));
            add(new Local(9, Tipo.ALOJAMIENTO, "La Cabana'l Cachican " , "Barzanielles, 2" , "985811695/637510693" , 0D, 0D, "https://cachican.es/"));
            add(new Local(10, Tipo.ALOJAMIENTO, "El Balcón de Muniellos" , "Oballo, 22, 33811" , "985911453" , 0D, 0D, "http://balcondemuniellos.es/"));
            add(new Local(11, Tipo.ALOJAMIENTO, "Apartamentos Camín de Muniellos" , "Penlés, 4, 33814" , "669 000 947" , 0D, 0D, "http://www.camindemuniellos.com/fotos.html"));
            add(new Local(12, Tipo.RESTAURANTE, "Apartamentos Camín de Muniellos" , "Penlés, 4, 33814" , "669 000 947" , 0D, 0D, "http://www.camindemuniellos.com/fotos.html"));
        }};
        return locales;
    }
}

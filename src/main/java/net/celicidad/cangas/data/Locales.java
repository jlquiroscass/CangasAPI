package net.celicidad.cangas.data;

import net.celicidad.cangas.model.Local;
import net.celicidad.cangas.model.Tipo;

import java.util.ArrayList;
import java.util.List;

public class Locales {

    public static List<Local> listaLocales() {
        List<Local> locales = new ArrayList<Local>() {{
            add(new Local(true, 44, Tipo.TIENDA, "Isacel ", "Avenida del Acebo, 8, 33800", "647 019 474", 43.1772812, -6.54821349999997, "", "images/locales/isacel2.jpg", "Obrador 100% Sin Gluten. Casi todo sin lactosa. Especializados en panes y productos tradiciones asturianos."));
            add(new Local(45, Tipo.TIENDA, "Embutidos Santulaya", "Santa Eulalia de Cueras, 16, 33800", "985 812 660", 43.1417736999999, -6.59114399999998, "www.santulaya.com", "images/locales/santulaya.jpg", ""));
            //add(new Local(1, Tipo.ALOJAMIENTO, "Casa María Cecilia", "Vega de Rengos, 19, 33813. Vega de Rengos", "9858911132", 43.0457869, -6.6867923, "https://116isa.wixsite.com/casamariacecilia", "images/locales/mariacecilia.jpg", "En la localidad de Vega de Rengos, a unos kilómetros de Cangas del Narcea, se ubica este alojamiento con opción de desayuno sin gluten. "));
            //add(new Local(2, Tipo.ALOJAMIENTO, "Hotel Rural El Mirador de Fuentes del Narcea", "Moncó, 20, 33813", "985911104", 43.0300018, -6.6313023, "http://www.elmiradordefuentesdelnarcea.com/", "images/locales/miradorfuentesdelnarcea.jpg", "A unos kilómetros de la villa, en la localidad de Moncó, se ubica este hotel rural con opciones sin gluten para desayunar. "));
            add(new Local(true, 18, Tipo.RESTAURANTE, "Sidrería Suiss", "Avda. del Acebo, 5, 33800  ", "", 43.1773134725055, -6.54861330986022, "", "images/locales/suissarticulo.jpg", "Sidrería y parrilla para disfrutar de opciones sin gluten de lo más diversas y de la mejor calidad, desde croquetas, las mejores carnes, calamares, cachopos, hasta postres. "));
            add(new Local(true, 13, Tipo.RESTAURANTE, "Café Madrid", "Mayor, 17, 33800", "985 81 04 05 - 649 16 64 42", 43.1769961, -6.55019249999998, "", "images/locales/cafemadridarticulo.jpg", "Adaptan prácticamente toda la carta. Una de sus especialidades son los cachopos sin gluten, también tienen otro tipo de rebozados. "));
            add(new Local(true, 14, Tipo.RESTAURANTE, "Blanco", "Mayor, 11, 33800", "985 810 316", 43.1765417, -6.54991919999997, "http://www.barblancorestaurante.com", "images/locales/blancoarticulo1.jpg", "Adaptan casi toda su carta, es uno de los restaurantes más premiados del Norte. "));
            add(new Local(true, 15, Tipo.RESTAURANTE, "Tierras Gallegas", "Uría, 26, 33800", "686 895 967", 43.1769809561761, -6.5490585565567, "", "images/locales/tierrasarticulo.jpeg", "Pulpería en la que a excepción de un plato, todo lo demás es sin gluten. En el corazón de la villa. "));
            add(new Local(true, 16, Tipo.RESTAURANTE, "Sidrería Narcea", "Dos Amigos, 12, 33800 ", "985 810 038", 43.1781427994605, -6.55147790908813, "", "images/locales/narceaarticulo.jpg", "La Sidrería Narcea ofrece una enorme cantidad de opciones sin gluten que varían desde los platos con las verduras frescas de la zona, hasta croquetas, calamares, cachopos, escalopines…"));
            add(new Local(true, 17, Tipo.RESTAURANTE, "La Ruta", "Mayor, 16, 33800", "985 810 998", 43.1768516, -6.55005299999993, "", "images/locales/rutaarticulo.jpg", "Especialidad en arroces. Casi toda su carta es apta y ofrecen desde chipirones hasta cachopo, postres, etc. "));
            add(new Local(true, 19, Tipo.RESTAURANTE, "Suiss ", "Avda. del Acebo, 5, 33800  ", "985810033", 43.1773760636121, -6.54851406812667, "", "images/locales/cachoposuiss.jpg", "Restaurante de comida tradicional y casera. Llevan años adaptando su menú diario a las exigencias de la dieta sin gluten. Desde cachopos hasta los postres. "));
            add(new Local(true, 21, Tipo.RESTAURANTE_ALOJAMIENTO, "Parador Corias", "Monasterio de Corias s/n 33816 Corias", "985 070 000", 43.1948338, -6.54345680000005, "www.paradores.es", "images/locales/paradorcorias.jpg", "A escasos kilómetros de la villa se ubica el Parador de Corias, un lugar mágico para descansar, conocer todo el concejo y comer de maravilla sin gluten. "));
            add(new Local(12, Tipo.RESTAURANTE_ALOJAMIENTO, "L'Anceo", "Cibuyo, 33813 ", "985 918 824 ", 43.12339, -6.57951199999999, "http://lanceo.net/", "images/locales/lanceoarticulo.jpg", "L'Anceo cuenta con alojamiento, con desayunos sin gluten y con un restaurante totalmente adaptado a las exigencias de la dieta sin gluten.  "));
            add(new Local(22, Tipo.RESTAURANTE, "Forno de Manolo", "Uría, 29, 33800", "985 810 706", 43.177118, -6.54935199999999, "", "images/locales/manoloarticulo2.jpg", "Pizzas, bocadillos, baguettes, opciones para el desayuno y también disponen de servicio a domicilio. "));
            add(new Local(23, Tipo.RESTAURANTE_ALOJAMIENTO, "Rte. María Luisa", "Las Mestas, 10, 33817", "985811143", 43.1264989999999, -6.52511400000003, "", "images/locales/marialuisatruchas.jpg", "Comida tradicional canguesa. Adaptan casi toda la carta. Se encuentran en la localidad de las Mestas, muy cerca de la villa. "));
            //add(new Local(24, Tipo.RESTAURANTE, "L'Ablugo", "Alcalde Díaz Penedela, 33800", "985810454", 43.1779529999999, -6.55042000000003, "", "images/locales/piccangas.jpg", "Pizzas, bocadillos, patatas, etc. Tienen servicio a domicilio. "));
            //add(new Local(25, Tipo.RESTAURANTE_ALOJAMIENTO, "Funsiquín", "Gedrez, s/n, 33811", "985 91 13 30 – 680 621 505", 43.0131604073824, -6.6084024310112, "https://funsiquin.wordpress.com/", "images/locales/funsiquin.jpg", "Desde el pueblo de Xedré y con unas vistas espectaculares, Funsiquín ofrece una carta sin gluten basada en productos de temporada y de la zona. "));
            add(new Local(27, Tipo.RESTAURANTE, "Bar Serrano", "Joaquín Rodríguez, 2,4, 33800 ", "", 43.1763213, -6.5492848, "", "images/locales/serrano.png", "Un lugar perfecto para la primera cerveza de la noche. "));
            add(new Local(28, Tipo.RESTAURANTE, "Rte. Fordaliz", "Oballo, 21, 33811", "670 490 068", 43.0585465, -6.6452855, "http://www.fordaliz.com/", "images/locales/fordaliz.png", "Espectaculares vistas desde el comedor de Fordaliz, especializado en comida tradicional de la zona. Adaptan casi toda la carta. "));
            add(new Local(47, Tipo.RESTAURANTE_ALOJAMIENTO, "Restaurante Marroncín", "Las Mestas, 8 33800", "985 811 051", 43.1276431, -6.525912099999999, "http://restaurantemarroncin.com-asturias.com/", "images/locales/piccangas.jpg", ""));
            add(new Local(48, Tipo.RESTAURANTE_ALOJAMIENTO, "Restaurante Santuario del Acebo", "Av. del Acebo, 33800", "984 111 974", 43.15883064243931,-6.498928070068359, "", "images/locales/piccangas.jpg", ""));
            add(new Local(55, Tipo.RESTAURANTE, "Moreno", "Plaza Conde Toreno, 2, 33800", "985 810 074", 43.1763204, -6.5491836, "https://www.facebook.com/barmorenotiendadelastorgano/?rf=202515019797986", "images/locales/piccangas.jpg", ""));
            add(new Local(49, Tipo.RESTAURANTE, "La Pulpería", "Calle Alcalde Díaz Penedela, 33800", "985 810 981", 43.1780582, -6.5504476, "https://website-1907862922218455578203-restaurant.negocio.site/", "images/locales/piccangas.jpg", "Pulpo, marisco, carnes"));
            add(new Local(54, Tipo.RESTAURANTE, "La Perla", "Plaza Mayor, 6, 33800", "985 811 703", 43.1775426, -6.551896500000001, "", "images/locales/piccangas.jpg", "Comida tradicional"));
            add(new Local(50, Tipo.RESTAURANTE_ALOJAMIENTO, "La Artesana", "Calle Posada de Rengos, 38 y 39, 33811", "680 643 398", 43.053214, -6.611961, "http://www.laartesana.org/", "images/locales/piccangas.jpg", "Comida tradicional"));
            add(new Local(51, Tipo.RESTAURANTE, "El Sotero", "Calle de los Puentes, 1, 33800", "609 330 151", 43.1756477, -6.5504278, "", "images/locales/piccangas.jpg", "Cervecería"));
            add(new Local(52, Tipo.RESTAURANTE_ALOJAMIENTO, "El Molinón", "Calle Uría, 40, 33800", "985 812 952", 43.1777385, -6.5498251, "http://www.hotelmolinon.com/", "images/locales/piccangas.jpg", "Hotel y comida tradicional"));
            add(new Local(53, Tipo.RESTAURANTE, "La Cantina", "C/ Mayor, 5, 33800 ", "", 43.1762071, -6.5500959, "", "images/locales/piccangas.jpg", "Cervecería"));
            add(new Local(true, 29, Tipo.RESTAURANTE, "El Mercao", "Recinto Ferial La Himera, 33817", "985 810 381", 43.1570231, -6.54098139999996, "", "images/locales/mercao.png", "Podéis disfrutar con algunas de sus especialidades sin gluten: patatas rellenas de pulpo, deliciosos cachopines de pollo, callos o cordero. Todo un lujo para cualquier paladar celiaco"));
            add(new Local(3, Tipo.ALOJAMIENTO, "Apartamentos Rurales Ardaliz", "Limés, 72, 33817", "617066289", 43.147469, -6.5381707, "http://ardaliz.com/", "images/locales/ardaliz.jpg", "Muy cerca de la villa, se ubican estos apartamentos que ofrecen también la opción de desayunar sin gluten. "));
            add(new Local(4, Tipo.ALOJAMIENTO, "Casa Xuaquin", "Moal, 35, 33811", "985 911 140 / 646 66 89 32", 43.046985, -6.6426907, "http://casaxuaquin.com", "images/locales/casaxoaquin.jpg", "A las puertas de Muniellos, en el pueblo de Moal, está Casa Xuaquín, también con la opción de desayunar sin gluten "));
            add(new Local(5, Tipo.ALOJAMIENTO, "La Pumarada de Limés", "Limés, 38, 33817", " (34) 985 811 407 /676237481   ", 43.15077, -6.5393887, "http://lapumaradadelimes.es/", "images/locales/pumarada.jpg", "En la vecina localidad de Limés, muy cerca de la villa, se encuentra este alojamiento que ofrece la opción de desayunar sin gluten. "));
            add(new Local(6, Tipo.ALOJAMIENTO, "Casa Mario ", "Posada de Rengos, 33811", "985 911 198 / 637 86 75 66", 43.0543357, -6.6147802, "http://www.casamario.net/", "images/locales/casamario.JPG", "Encontramos este alojamiento rural en la localidad de Posada de Rengos, a unos kilómetros de la villa. También ofrecen desayuno sin gluten "));
            add(new Local(7, Tipo.ALOJAMIENTO, "Casa de Aldea La Pescal", "La Pescal, 33813", "686560857", 43.087887, -6.6086757, "", "images/locales/lapescal.jpg", "En la localidad de la Pescal, a unos kilómetros de la villa, se ubica esta casa rural que ofrece desayunos sin gluten. "));
            add(new Local(8, Tipo.ALOJAMIENTO, "Hotel Ana Obanca", "C/ Obanca, nº15, Carretera De Besullo km-0,6, 33800 CdelN", "985 811 716", 43.1825284, -6.5541198, "http://www.hotelana-asturias.com/es-es/", "images/locales/hotelana.jpg", "A las afueras de Cangas del Narcea, en la localidad de Obanca, está este hotel que ofrece desayunos aptos. "));
            add(new Local(9, Tipo.ALOJAMIENTO, "La Cabana'l Cachican", "Barzanielles, 2, 33817", "985811695/637510693", 43.158329, -6.5461557, "https://cachican.es/", "images/locales/cachican.jpg", "Saliendo de Cangas del Narcea, a un kilómetro de la villa, se ubican estos alojamientos rurales con desayunos sin gluten. "));
            add(new Local(10, Tipo.ALOJAMIENTO, "El Balcón de Muniellos", "Oballo, 22, 33811", "985911453", 43.0585344, -6.6472026, "http://balcondemuniellos.es/", "images/locales/balconmuniellos.jpg", "En plena naturaleza, en Oballo, se ubica este alojamiento que tiene la opción de desayunos sin gluten. "));
            add(new Local(11, Tipo.ALOJAMIENTO, "Apartamentos Camín de Muniellos", "Penlés, 4, 33814", "669 000 947", 43.150244, -6.5771347, "http://www.camindemuniellos.com/fotos.html", "images/locales/camin.jpg", ""));
            //add(new Local(true, 33, Tipo.RESTAURANTE, "Casintra", "C/ Mayor, 8, 33800 ", "985 810 052", 43.1764819, -6.54962980000004, "", "images/locales/piccangas.jpg", ""));
            //add(new Local(35, Tipo.TIENDA, "Kiosko de Juan ", "Plaza de Mario Gómez", "985 811 952", 43.1767476, -6.55018369999993, "", "images/locales/kioskojuan.jpeg", "Todas sus chuches son sin gluten y ofrecen candy bar y eventos sin gluten para los más pequeños. Están en el centro de la villa. "));
            add(new Local(61, Tipo.TIENDA, "Narceagourmet", "C/Mayor 22", "985 810 600", 43.17702019885969, -6.550152263171867, "", "images/locales/dieteticanarcea.jpg", ""));
            add(new Local(36, Tipo.TIENDA, "Carnicería Ecológica Narcea", "C/ Uría, 12, 33800 ", "985811803 / 630721904", 43.1759526, -6.54735779999998, "http://carniceriaecologicanarcea.com/", "images/locales/carniecologica.jpg", "Carne ecológica de la zona y conocimientos para evitar la contaminación cruzada. En el centro de la villa.  "));
            add(new Local(37, Tipo.TIENDA, "Carnicería La Fuente", "C/ La Fuente, 33800 ", "985 810 995", 43.1766912999999, -6.55046070000003, "", "images/locales/carnicerialafuente.png", "En la Carnicería La Fuente ofrecen producto de la mejor calidad y saben evitar la contaminación cruzada. "));
            add(new Local(38, Tipo.TIENDA, "El DÍA", "C/ Uría, 55, 33800", "912 170 453", 43.1789781, -6.55087419999995, "", "images/locales/diacangas.jpg", "Tienen una sección de productos específicos para celiacos. "));
            //add(new Local(39, Tipo.TIENDA, "Farmacia Pereda", "C/ Mayor, 37, 33800", "985 810 875", 43.177997, -6.55093590000001, "http://farmaciapereda.com/", "images/locales/farmaciapereda.png", "Información actualizada sobre la enfermedad celiaca. "));
            //add(new Local(40, Tipo.TIENDA, "Farmacia Marcos", "C/ Mayor, 28, 33800", "985 810 113", 43.1774907, -6.55048190000002, "", "images/locales/piccangas.jpg", "Información actualizada sobre la enfermedad celiaca. "));
            add(new Local(41, Tipo.TIENDA, "Frutería Sabores", "", "", 43.1771789, -6.55035150000003, "", "images/locales/piccangas.jpg", ""));
            add(new Local(42, Tipo.TIENDA, "Prestaté", "C/ Mayor, 24, 33800", "662 082 898", 43.1772487, -6.55031499999995, "", "images/locales/prestate.jpg", "Tienda especializada en infusiones que también ofrece chocolates, otros productos de alimentación y regalos. Tienen información actualizada sobre celiaquía. "));
            add(new Local(43, Tipo.TIENDA, "Dietética Narcea", "C/Uría, 31, Parque Reguerala, 33800", "985 811 603", 43.1772231, -6.5494807, "", "images/locales/dieteticanarcea.jpg", ""));
            // add(new Local(46, Tipo.TIENDA, "Ganadería Ecológica Casa El Cuarto ", "Mieldes, 33816", "985921568 / 680 147 909", 43.2171209, -6.40013380000004, "https://www.casaelcuarto.com/", "images/locales/piccangas.jpg", ""));
            add(new Local(57, Tipo.ALOJAMIENTO, "Clarens Guest House", "C/Uría, 23 B", "684 611 579", 43.1797041, -6.5506832, "", "images/locales/piccangas.jpg", ""));
            add(new Local(58, Tipo.ALOJAMIENTO, "Casa Azul de Villaconejo", "Vega de Pope, 12", "985 812 478", 43.134097328220754, -6.579417813924124, "villaconejo.com", "images/locales/piccangas.jpg", ""));
            add(new Local(59, Tipo.ALOJAMIENTO, "La Posada del Chano", "Posada de Besullo, 7", "610 346 595", 43.18717860369996, -6.615840196609497, "laposadadelchano.es", "images/locales/piccangas.jpg", ""));
            add(new Local(59, Tipo.ALOJAMIENTO, "Aptos. Casa La Fonte", "Oballo, 25", "663 987 335", 43.05984231924607, -6.644572019577026, "apartamentoslafonte.es", "images/locales/piccangas.jpg", ""));
            add(new Local(60, Tipo.ALOJAMIENTO, "Montañas de Pumar", "Pumar de las Montañas", "984 249 598", 43.171273128899394, -6.657092571258545, "hotelruralpumar.com", "images/locales/piccangas.jpg", ""));
            add(new Local(61, Tipo.TIENDA, "Kiosko Chocofresh", "C/Mayor 3-5", "686 760 379", 43.176229099837215, -6.549613093080552, "", "images/locales/piccangas.jpg", ""));
        }};
        return locales;
    }
}

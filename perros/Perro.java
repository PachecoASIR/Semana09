package perros;

public class Perro {

        private String pelo = "Liso";
        private String color = "Marron";
        private int chip = 777;

        public String tipo_pelo(){
            return "El pelo es "+ pelo;
        }
        public String color_pelo(){
            return "El color del pelo es "+ color;
        }
        public String numero_chip(){
            return "El numero del chip es "+ chip;
        }
    }
package perros;

public class Perro {

        private String pelo = "Liso";
        private String color = "Marron";
        private int chip = 777;

        public String getpelo(){
            return pelo;
        }
        public String getcolor(){
            return color;
        }
        public int getchip(){
            return chip;
        }
        public void setpelo(String pelo) {
            this.pelo = pelo;
            }
        public void setcolor(String color) {
            this.color = color;
        }
        public void setchip(int chip) {
            this.chip = chip;
            }           
    }
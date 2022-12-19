package perros;

public class Perro {

        private String pelo = "Liso";
        private String color = "Marron";
        private int chip = 777;
        private int peso;
        private int altura;

        public String getpelo(){
            return pelo;
        }
        public String getcolor(){
            return color;
        }
        public int getchip(){
            return chip;
        }
        public int getpeso(){
            return peso;
        }
        public int getaltura(){
            return altura;
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
        public void setpeso(int peso) {
            this.peso = peso;
            }  
        public void setaltura(int altura) {
            this.altura = altura;
            }

        public String ladrar(int n1, int n2){
            
            String ladrido = "";
            peso = n1;
            altura = n2;
        
            if (peso>10 && altura>25) {
                ladrido ="Ladrido 1";
            } else if (peso<=10 && altura<=25) {
                ladrido ="Ladrido 2";
            }
            return ladrido;
        }            
    }
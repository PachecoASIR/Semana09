package perros;

public class Perro {

        private String raza;
        private String pelo;
        private String color;
        private int chip;
        private int peso;
        private int altura;
         
        public Perro(String newraza,String newpelo,String newcolor,int newchip,int newpeso,int newaltura){
            raza=newraza;
            pelo=newpelo;
            color=newcolor;
            chip=newchip;
            peso=newpeso;
            altura=newaltura;
        }
        public String toString(){
            return "Raza: " +raza+"\nCaracterísticas: "+"\nPelo:"+pelo+"  Color:"+color+"  Chip:"+chip+"  Peso:"+peso+"kg"+"  Altura:"+altura+"cm"+"\n";
        }
    }
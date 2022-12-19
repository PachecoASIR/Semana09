package perros;

public class Main {
    public static void main(String[] args) {
      
        Perro Pastor = new Perro();

        Pastor.setpelo("Rizo");
        Pastor.setcolor("Blanco");
        Pastor.setchip(7777);
        Pastor.setpeso(24);
        Pastor.setaltura(55);

        System.out.println("El Pastor presenta las siguiente características: \nPelo: " + Pastor.getpelo() + "\nColor: " + Pastor.getcolor() + "\nChip: " + Pastor.getchip() + "\nPeso: " + Pastor.getpeso() + "kg" + "\nAltura: " + Pastor.getaltura() + "cm");
    }
//Si cambiamos los atributos a private, main deja de detectarlos y por ende el código no funciona correctamente
}
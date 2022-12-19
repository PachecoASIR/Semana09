package perros;

public class Main {
    public static void main(String[] args) {
      
        Perro Pastor = new Perro();

        Pastor.setpelo("Rizo");
        Pastor.setcolor("Blanco");
        Pastor.setchip(7777);

        System.out.println("El Pastor presenta las siguiente características: \nPelo: " + Pastor.getpelo() + "\nColor: " + Pastor.getcolor() + "\nChip: " + Pastor.getchip());
    }
//Si cambiamos los atributos a private, main deja de detectarlos y por ende el código no funciona correctamente
}
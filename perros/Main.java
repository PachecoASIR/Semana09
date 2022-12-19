package perros;

public class Main {
    public static void main(String[] args) {
      
        Perro Pastor = new Perro();

        Pastor.setpelo("Rizo");
        Pastor.setcolor("Blanco");
        Pastor.setchip(7777);
        Pastor.setpeso(24);
        Pastor.setaltura(55);

        Perro Husky = new Perro();

        Husky.setpelo("Liso");
        Husky.setcolor("Negro");
        Husky.setchip(7778);
        Husky.setpeso(11);
        Husky.setaltura(25);

        Perro Shiba = new Perro();

        Shiba.setpelo("Liso");
        Shiba.setcolor("Beige");
        Shiba.setchip(7779);
        Shiba.setpeso(9);
        Shiba.setaltura(24);

        System.out.println("El Pastor presenta las siguiente características: \nPelo:" + Pastor.getpelo() + "  Color:" + Pastor.getcolor() + "  Chip:" + Pastor.getchip() + "  Peso:" + Pastor.getpeso() + "kg" + "  Altura:" + Pastor.getaltura() + "cm" + "  Ladrido:" + Pastor.ladrar(Pastor.getpeso(),Pastor.getaltura()) + "\n");
        System.out.println("El Husky presenta las siguiente características: \nPelo:" + Husky.getpelo() + "  Color:" + Husky.getcolor() + "  Chip:" + Husky.getchip() + "  Peso:" + Husky.getpeso() + "kg" + "  Altura:" + Husky.getaltura() + "cm" + "  Ladrido:" + Husky.ladrar(Husky.getpeso(),Husky.getaltura()) + "\n");
        System.out.println("El Shiba presenta las siguiente características: \nPelo:" + Shiba.getpelo() + "  Color:" + Shiba.getcolor() + "  Chip:" + Shiba.getchip() + "  Peso:" + Shiba.getpeso() + "kg" + "  Altura:" + Shiba.getaltura() + "cm" + "  Ladrido:" + Shiba.ladrar(Shiba.getpeso(),Shiba.getaltura()) + "\n");
    }
//Si cambiamos los atributos a private, main deja de detectarlos y por ende el código no funciona correctamente
}
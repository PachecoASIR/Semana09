package perros;

public class Main {
    public static void main(String[] args) {
      
        Perro Pastor = new Perro();

        System.out.println("El Pastor presenta las siguiente características: " + Pastor.tipo_pelo() + " " + Pastor.color_pelo() + " " + Pastor.numero_chip());
    }
//Si cambiamos los atributos a private, main deja de detectarlos y por ende el código no funciona correctamente
}
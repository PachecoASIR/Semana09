package perros;

public class Main {
    public static void main(String[] args) {

        Perro arr[] = {new Perro("Pastor","Rizo","Blanco",7777,24,55), new Perro("Husky","Liso","Negro",7778,11,25), new Perro("Shiba","Liso","Beige",7779,9,24)};

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Declaramos las variables
        String nombre, aux;
        int id;
        double precio;
        boolean envio;

        // Impotamos la clase scanner
        final Scanner input = new Scanner(System.in);

        // Le pedimos al usuario que ingrese los datos solicitados
        System.out.println("Ingrese el nombre del libro");
        nombre = input.nextLine();

        System.out.println("Ingrese el ID del libro");
        id = Integer.parseInt(input.nextLine());

        System.out.println("Ingrese el precio del libro");
        precio = Double.parseDouble(input.nextLine());

        System.out.println("Ingrese si el envio es gratis si/no");
        aux = input.nextLine();
        if (aux.equalsIgnoreCase("si")) {
            envio = true;
        } else {
            envio = false;
        }

        // Mostramos los datos ingresados por pantalla
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: #" + id);
        System.out.println("Precio: $" + precio);
        if (envio) {
            System.out.println("Envio: gratuito");
        } else {
            System.out.println("Envio: con cargo");
        }
    }
}

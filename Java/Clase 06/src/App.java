import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Impotamos la clase scanner
        final Scanner input = new Scanner(System.in);

        // Declaramos las variables
        String nombre, aux;
        int id;
        double precio;
        boolean envio;

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

        // Conversion de texto a int
        var edad = Integer.parseInt("20");
        System.out.println("Edad = " + (edad + 1));

        // Conversion de texto a double
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("Valor Pi = " + valorPI);

        // Conversion de texto a int
        var input = new Scanner(System.in);
        System.out.println("Digite su edad");
        edad = Integer.parseInt(input.nextLine());
        System.out.println("Edad = " + edad);

        // Parte 2
        // Parsear numeros a cadena
        var edadTexto = String.valueOf(10);
        System.out.println("EdadTexto = " + edadTexto);

        var fraseChar = "programadores".charAt(12);
        System.out.println("fraseChar = " + fraseChar);

        System.out.println("Digite un caracter: ");
        fraseChar = input.nextLine().charAt(0);
        System.out.println("fraseChar = " + fraseChar);

        // **EJERCICIO**

        System.out.println("Digite el nombre del libro: ");
        String nombreLibro = input.nextLine();
        System.out.println("Digite el id del libro");
        int idLibro = Integer.parseInt(input.nextLine());
        System.out.println("Digite el precio del libro");
        double precioLibro = Double.parseDouble(input.nextLine());
        System.out.println("Confirme si el envio es gratuito: ");
        boolean envioGratuito = Boolean.parseBoolean(input.nextLine());

        System.out.println(nombreLibro + " #" + idLibro);
        System.out.println("Precio del libro: $" + precioLibro);
        System.out.println("El envio del libro es gratuito: " + envioGratuito);

    }
}

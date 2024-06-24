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

        // ***CLASE 09***

        // **EJERCICIO 5**
        System.out.println("Suma de calificaciones1");
        System.out.println("Ingrese la primer calificacion");
        int calif1 = Integer.parseInt(input.nextLine());

        System.out.println("Ingrese la segunda calificacion");
        int calif2 = Integer.parseInt(input.nextLine());

        System.out.println("Ingrese la tercera calificacion");
        int calif3 = Integer.parseInt(input.nextLine());

        int sumatoria = calif1 + calif2 + calif3;
        System.out.println("La sumatoria de las tres calificaciones1 es= " + sumatoria);

        // **EJERCICIO 6**
        System.out.println("Calculadora de cantidad de dolares");
        System.out.println("¿Cuantos dolares tiene Guillermo?");
        int dolarG = Integer.parseInt(input.nextLine());
        int dolarL = dolarG / 2;
        int dolarJ = (dolarG + dolarL) / 2;
        System.out.println("Guillermo tiene = $" + dolarG);
        System.out.println("Luis tiene = $" + dolarL);
        System.out.println("Juan tiene = $" + dolarJ);

        // **EJERCICIO 7**

        final int salarioNeto = 1000;
        double[] autos;
        double comisionTotalAuto = 0;
        double comisionAuto;
        double comisionVenta;
        int cant;
        String personal;

        System.out.println("Ingrese el nombre del personal");
        personal = input.nextLine();

        System.out.println("¿Cuantos autos vendio " + personal + " este mes?");
        cant = Integer.parseInt(input.nextLine());

        autos = new double[cant];

        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese el precio del automovil N" + (i + 1));
            autos[i] = Double.parseDouble(input.nextLine());
        }

        for (int i = 0; i < cant; i++) {
            comisionAuto = autos[i] * 0.05;
            comisionTotalAuto = comisionTotalAuto + comisionAuto;
        }
        comisionVenta = cant * 150;

        System.out.println("Resumen cuenta " + personal);
        System.out.println("Salario neto = $" + salarioNeto);
        System.out.println("Comisiones por ventas = $" + comisionVenta);
        System.out.println("Comisiones por automoviles = $" + comisionTotalAuto);
        System.out.println("Salario total = $" + (salarioNeto + comisionVenta + comisionTotalAuto));

    }
}

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // EJERCICIO 5
        System.out.println("EJERCICIO 5");
        // Declaracion de variables
        float nota1, nota2, nota3, resultado;

        // Impotamos la clase scanner
        final Scanner input = new Scanner(System.in);

        // Solicitamos al usuario que ingrese
        System.out.println("Ingrese la nota N 1");
        nota1 = input.nextFloat();

        System.out.println("Ingrese la nota N 2");
        nota2 = input.nextFloat();

        System.out.println("Ingrese la nota N 3");
        nota3 = input.nextFloat();

        // Realizamos la sumatoria
        resultado = nota1 + nota2 + nota3;

        // Mostramos el resultado en pantalla
        System.out.println("La sumatoria de las tres notas es: " + resultado);

        // EJERCICIO 6
        System.out.println("");
        System.out.println("EJERCICIO 6");
        // Guillermo tiene N dólares
        double N = 100.0; // Puedes cambiar este valor para probar con diferentes cantidades

        // Luis tiene la mitad de lo que posee Guillermo
        double luis = N / 2;

        // Juan tiene la mitad de lo que poseen Luis y Guillermo juntos
        double juan = (luis + N) / 2;

        // Calcular la cantidad total de dinero que tienen entre los tres
        double total = N + luis + juan;

        // Imprimir el resultado
        System.out.println("La cantidad de dinero que tienen entre los tres es: $" + total);

        // EJERCICIO 7
        System.out.println("");
        System.out.println("EJERCICIO 7");

        // Definir el salario base como una constante
        final int SALARIO_BASE = 1000;
        final int COMISION_POR_AUTO = 150;
        final double PORCENTAJE_VENTA = 0.05;

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Leer la cantidad de carros vendidos
        System.out.print("Ingrese la cantidad de carros vendidos: ");
        int autosVendidos = scanner.nextInt();

        // Leer el valor total de las ventas
        System.out.print("Ingrese el valor total de las ventas: ");
        double valorTotalVentas = scanner.nextDouble();

        // Calcular el salario mensual
        int comisionTotal = autosVendidos * COMISION_POR_AUTO;
        double porcentajeVentas = valorTotalVentas * PORCENTAJE_VENTA;
        double salarioMensual = SALARIO_BASE + comisionTotal + porcentajeVentas;

        // Imprimir el salario mensual
        System.out.println("El salario mensual del vendedor es: $" + salarioMensual);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}

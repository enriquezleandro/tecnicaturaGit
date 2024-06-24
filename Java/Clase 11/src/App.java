import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // EJERCICIO 1
        // Determinar si un alumno aprueba o reprueba un curso sabiendo que aprobara si
        // su promedio de tres calificaciones es mayor o igual a 70

        final Scanner input = new Scanner(System.in);

        double nota1, nota2, nota3, promedio;
        System.out.println("Determinacion de promedio");
        System.out.println("Ingrese la nota 1");
        nota1 = Double.parseDouble(input.nextLine());

        System.out.println("Ingrese la nota 2");
        nota2 = Double.parseDouble(input.nextLine());

        System.out.println("Ingrese la nota 3");
        nota3 = Double.parseDouble(input.nextLine());

        promedio = (nota1 + nota2 + nota3) / 3;

        if (promedio > 7) {
            System.out.println("El alumno esta promocionado");
        } else {
            System.out.println("El alumno no esta promocionado");
        }

        System.out.println("-------------------------------------");

        // EJERCICIO 2
        // En un almacen se ahce un 20% de descuento a los clientes cuya copra supere
        // los $100
        // calcular el descuento segun el monto de la compra ingresado

        double compra, descuento, precioFinal;
        System.out.println("Ingrese el monto de la compra");

        compra = Double.parseDouble(input.nextLine());

        if (compra > 100) {
            System.out.println("Monto de compra = $" + compra);
            System.out.println("Monto del descuento = $" + (descuento = compra * 0.2));
            System.out.println("Precio final a pagar = $" + (precioFinal = compra * 0.8));
        } else {
            System.out.println("Monto de compra = $" + compra);
            System.out.println("Monto del descuento = $" + 0);
            System.out.println("Precio final a pagar = $" + compra);
        }

        System.out.println("-------------------------------------");

        // EJERCICIO 3
        // Leer dos numeros, si son iguales que los multiplique, si el primer es mayor
        // que los reste y si no que los sume

        double num1, num2, resultado;

        System.out.println("Ingrese el primer numero");
        num1 = Double.parseDouble(input.nextLine());

        System.out.println("Ingrese el segundo numero");
        num2 = Double.parseDouble(input.nextLine());

        if (num1 == num2) {
            System.out.println(resultado = num1 * num2);
        } else if (num1 > num2) {
            System.out.println(resultado = num1 - num2);
        } else {
            System.out.println(resultado = num1 + num2);
        }
    }
}

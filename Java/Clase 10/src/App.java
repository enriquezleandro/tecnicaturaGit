import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Impotamos la clase scanner
        final Scanner input = new Scanner(System.in);

        // Esctructura if
        var condicion = false;
        if (condicion == true) {
            System.out.println("Condicion verdadera");
        } else {
            System.out.println("Condicion falsa");
        }

        // Estructura if-else
        var numero = 2;
        var numeroTexto = "Numero desconocido";
        if (numero == 1) {
            numeroTexto = "Numero uno";
        } else if (numero == 2) {
            numeroTexto = "Numero dos";
        } else if (numero == 3) {
            numeroTexto = "Numero tres";

        } else if (numero == 4) {
            numeroTexto = "Numero cuatro";

        } else {
            numeroTexto = "Numero no encontrado";
        }
        System.out.println("NumeroTexto = " + numeroTexto);

        // **EJERCICIO MES CON IF ELSE**
        System.out.println("Digite un mes del año");
        var mes = Integer.parseInt(input.nextLine());
        var estacion = "Estacion desconocida";
        if (mes == 1 || mes == 2 || mes == 3) {
            estacion = "verano";
        } else if (mes == 4 || mes == 5 || mes == 6) {
            estacion = "otoño";
        } else if (mes == 7 || mes == 8 || mes == 9) {
            estacion = "invierno";
        } else if (mes == 10 || mes == 11 || mes == 12) {
            estacion = "primavera";
        }
        System.out.println("El mes ingresado corresponde a la estacion de " + estacion);

        // Estructura switch
        var numeroP = 2;
        var numeroTexto1 = "Valor desconocido";
        switch (numeroP) {
            case 1:
                numeroTexto1 = "Numero uno";
                break;
            case 2:
                numeroTexto1 = "Numero dos";
                break;
            case 3:
                numeroTexto1 = "Numero tres";
                break;
            case 4:
                numeroTexto1 = "Numero cuatro";
                break;
            default:
                numeroTexto1 = "Caso no encontrado";
        }
        System.out.println("numeroTexto1 = " + numeroTexto1);

        // **EJERCICIO MES CON SWITCH**
        System.out.println("Digite un mes del año");
        mes = Integer.parseInt(input.nextLine());
        estacion = "Estacion desconocida";
        switch (mes) {
            case 1:
            case 2:
            case 3:
                estacion = "verano";
                break;
            case 4:
            case 5:
            case 6:
                estacion = "otoño";
                break;
            case 7:
            case 8:
            case 9:
                estacion = "invierno";
                break;
            case 10:
            case 11:
            case 12:
                estacion = "primavera";
                break;
        }

        System.out.println("Estacion = " + estacion);

        // **EJERCICIO 3 CALIFICACIONES**
        System.out.println("Digite un  numero entre 0 y 10 para saber su calificacion");
        var calificaciones1 = Integer.parseInt(input.nextLine());
        if (calificaciones1 >= 9 && calificaciones1 <= 10) {
            System.out.println("A");
        } else if (calificaciones1 >= 8 && calificaciones1 < 9) {
            System.out.println("B");
        } else if (calificaciones1 >= 7 && calificaciones1 < 8) {
            System.out.println("C");
        } else if (calificaciones1 >= 6 && calificaciones1 < 7) {
            System.out.println("D");
        } else if (calificaciones1 >= 0 && calificaciones1 < 6) {
            System.out.println("F");
        } else {
            System.out.println("Fuera de rango");
        }

    }
}

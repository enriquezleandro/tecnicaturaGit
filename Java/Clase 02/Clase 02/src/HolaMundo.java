import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) throws Exception {
        /*
         * // CLASE 02
         * 
         * // Tipo int
         * int miVariable = 10;
         * System.out.println(miVariable);
         * miVariable = 5;
         * System.out.println(miVariable);
         * 
         * // Tipo String
         * String miVariableCadena = "Bienvenidos";
         * System.out.println(miVariableCadena);
         * miVariableCadena = "Sigamos creciendo en programacion";
         * System.out.println(miVariableCadena);
         * 
         * // CLASE 03
         * 
         * // Utilizacion de la palabra reservada var, desde java 10 se usa eso para que
         * // java identifique que tipo de dato es, sin nosotros estar determinandolo.
         * 
         * var miVariableEntera2 = 10;
         * var miVariableCadena2 = "Seguiimos estudiando";
         * System.out.println("miVariable = " + miVariableEntera2);
         * System.out.println("miVariableCadena2 =" + miVariableCadena2);
         * 
         * // Reglas para definir una variable
         * // No se puede comenzar con numeros o signos, salvo
         * // _ guion bajo
         * // $ signo dolar
         * 
         * // CONCATENACION
         * var nombre = "Javier";
         * var apellido = "Milei";
         * var nombreCompleto = nombre + " " + apellido;
         * System.out.println(nombreCompleto);
         * 
         * var a = 8;
         * var b = 4;
         * var c = a + b;
         * System.out.println(c);
         * System.out.println("La suma es: " + a + b);
         * System.out.println("La suma es: " + (a + b));
         * 
         * // CARACTERES ESPECIALES
         * var nombre1 = "Natalia";
         * // Salto de linea
         * System.out.println("Nueva linea: \n" + nombre1);
         * // Espaciado
         * System.out.println("Tabulador: \t" + nombre1);
         * // Retroceso (borra lo que esta detras de el)
         * System.out.println("Retroceso: \b" + nombre1);
         * // Comillas simples
         * System.out.println("Comillas simples: \'" + nombre1 + "\'");
         * // Comillas dobles
         * System.out.println("Comilla doble \"" + nombre1 + "\"");
         * 
         * // CLASE SCANNER
         * Scanner input = new Scanner(System.in);
         * 
         * System.out.println("Digite su nombre");
         * var usuario2 = input.nextLine();
         * 
         * System.out.println("Usuario2 = " + usuario2);
         * System.out.println("Escriba un titulo:");
         * var titulo2 = input.nextLine();
         * System.out.println("Resultado: " + titulo2 + " " + usuario2);
         * 
         * // EJERCICIO
         * System.out.println("Proporciona el titulo del libro");
         * String titulo = input.nextLine();
         * System.out.println("Proporciona el autor");
         * String autor = input.nextLine();
         * System.out.println(titulo + "fue escrito por " + autor);
         */
        // CLASE 04

        byte numeroEnteroByte = 10;
        System.out.println("Valor minimo del Byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo de Byte: " + Byte.MAX_VALUE);

        System.out.println("Valor minimo del short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo de short: " + Short.MAX_VALUE);

        System.out.println("Valor minimo del int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo de int: " + Integer.MAX_VALUE);

        System.out.println("Valor minimo del long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo de long: " + Long.MAX_VALUE);

        System.out.println("Valor minimo del float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo de float: " + Float.MAX_VALUE);
        
        System.out.println("Valor minimo del double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo de double: " + Double.MAX_VALUE);
    }
}

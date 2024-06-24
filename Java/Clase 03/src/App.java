import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    // Utilizacion de la palabra reservada var, desde java 10 se usa eso para que
    // java identifique que tipo de dato es, sin nosotros estar determinandolo.

    var miVariableEntera2 = 10;
    var miVariableCadena2 = "Seguiimos estudiando";
    System.out.println("miVariable = " + miVariableEntera2);
    System.out.println("miVariableCadena2 =" + miVariableCadena2);

    // Reglas para definir una variable
    // No se puede comenzar con numeros o signos, salvo
    // _ guion bajo
    // $ signo dolar

    // CONCATENACION
    var nombre = "Javier";
    var apellido = "Milei";
    var nombreCompleto = nombre + " " + apellido;
    System.out.println(nombreCompleto);

    var a = 8;
    var b = 4;
    var c = a + b;
    System.out.println(c);
    System.out.println("La suma es: " + a + b);
    System.out.println("La suma es: " + (a + b));

    // CARACTERES ESPECIALES
    var nombre1 = "Natalia";
    // Salto de linea
    System.out.println("Nueva linea: \n" + nombre1);
    // Espaciado
    System.out.println("Tabulador: \t" + nombre1);
    // Retroceso (borra lo que esta detras de el)
    System.out.println("Retroceso: \b" + nombre1);
    // Comillas simples
    System.out.println("Comillas simples: \'" + nombre1 + "\'");
    // Comillas dobles
    System.out.println("Comilla doble \"" + nombre1 + "\"");

    // CLASE SCANNER
    Scanner input = new Scanner(System.in);

    System.out.println("Digite su nombre");
    var usuario2 = input.nextLine();

    System.out.println("Usuario2 = " + usuario2);
    System.out.println("Escriba un titulo:");
    var titulo2 = input.nextLine();
    System.out.println("Resultado: " + titulo2 + " " + usuario2);

    // EJERCICIO
    System.out.println("Proporciona el titulo del libro");
    String titulo = input.nextLine();
    System.out.println("Proporciona el autor");
    String autor = input.nextLine();
    System.out.println(titulo + "fue escrito por " + autor);
    }
}

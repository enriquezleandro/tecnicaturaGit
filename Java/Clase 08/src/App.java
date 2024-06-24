import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Importamos la clase scanner
        final Scanner input = new Scanner(System.in);

        // Operadores unarios
        var varA = 7;
        var varB = -varA; // El valor adopta un numero negativo
        System.out.println("varA = " + varA);
        System.out.println("varB = " + varB);

        // Operadores de negacion
        var varC = true;
        var varD = !varC; // Aca se esta invirtiendo el valor
        System.out.println("varC = " + varC);
        System.out.println("varD = " + varD);

        // Operadores uniarios de incremento: preincremento
        var varE = 9; // Se va a modificar su valor
        var varF = ++varE; // Simbolo antes de la variable
        System.out.println("varE = " + varE);// Primero se incrementa la variable y despues se usa su valor
        System.out.println("varF = " + varF);

        // Operadores uniarios de incremento: postincremento
        var varG = 3;
        var varH = varG++;
        System.out.println("varG = " + varG);
        System.out.println("varH = " + varH);

        // Operadores unarios de decremento: predecremento
        var varI = 4;
        var varJ = --varI;
        System.out.println("varI = " + varI);
        System.out.println("varJ = " + varJ);

        // Operadores unarios de decremento: postdecremento
        var varK = 8;
        var varL = --varI;
        System.out.println("varK = " + varK);
        System.out.println("varJ = " + varL);

        // Operadores de igualdad y relacionales
        var aNum = 5;
        var bNum = 4;
        var cNum = (aNum == bNum);
        System.out.println("cNum = " + cNum);

        var dNum = aNum != bNum;
        System.out.println("dNum = " + dNum);

        var cadenaA = "Hello";
        var cadenaB = "bye bye";
        var cVar = cadenaA == cadenaB; // asi no se comparan las cadenas
        System.out.println("cVar = " + cVar);

        var fVar = cadenaA.equals(cadenaB); // asi se compara las cadenas
        System.out.println("fVar = " + fVar);

        // Operadores relacionales
        var gVar = aNum != bNum; // > >= < <= == !=
        System.out.println("fVar = " + gVar);

        if (aNum % 2 == 0) {
            System.out.println("EL numero es Par");
        } else {
            System.out.println("El numero no es Par");
        }

        // Operadores condicionales
        var valorA = 7;
        var valorMinimo = 0;
        var valorMaximo = 10;
        var respuesta = valorA >= 0 && valorA < 10;
        if (respuesta) {
            System.out.println("Esta dentro del rango establecido");
        } else {
            System.out.println("Esta fuera del rango establecido");
        }

        var vacaciones = false;
        var diaLibre = false;
        if (vacaciones || diaLibre) {
            System.out.println("El papa puede asistir al juego de su hijo");
        } else {
            System.out.println("El papa no puede asistir al juego de su hijo");
        }

        // Operador ternario
        var resultadoT = (5 > 4) ? "Verdadero" : "Falso";
        System.out.println("resultadoT = " + resultadoT);

        var numeroT = 7;
        resultadoT = (numeroT % 2 == 0) ? "Es par" : "Es impar";
        System.out.println("resultadoT = " + resultadoT);

        // Prioridad de operadores

        var x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("Z = " + z);

        var solucionAritmetica = 4 + 5 * 6 / 3;
        System.out.println("solucionAritmetica = " + solucionAritmetica);

        solucionAritmetica = (4 + 5) * 6 / 3;
        System.out.println("solucionAritmetica = " + solucionAritmetica);

        // **EJERCICIO**

        // Ejercicio Rectangulo

        System.out.println("Calculadora de perimetros");

        System.out.println("Ingrese el alto del cuadrado en centimetros...");
        int alto = Integer.parseInt(input.nextLine());

        System.out.println("Ingrese el ancho del cuadrado en centimetros...");
        int ancho = Integer.parseInt(input.nextLine());

        int perimetro = (ancho + alto) * 2;
        int area = ancho * alto;

        System.out.println("El perimetro del cuadrado es = " + perimetro + "cm");
        System.out.println("El area del cuadrado es = " + area + "cm2");

        // **EJERCICIO TERNARIO**
        System.out.println("Identificar el numero mayor");
        System.out.println("Ingrese el primer numero...");
        int number1 = Integer.parseInt(input.nextLine());

        System.out.println("Ingrese el segundo numero");
        int number2 = Integer.parseInt(input.nextLine());

        var resultado = (number1 > number2) ? number1 : number2;

        System.out.println("El numero mayor es: " + resultado);
    }
}

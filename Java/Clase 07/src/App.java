public class App {
    public static void main(String[] args) throws Exception {

        // Declaracion de variables
        int num1 = 5, num2 = 4;

        // suma
        var solucion = num1 + num2;
        System.out.println("solucion suma = " + solucion);

        // resta
        solucion = num1 - num2;
        System.out.println("Solucion de la resta = " + solucion);

        // division
        solucion = num1 / num2;
        System.out.println("Solucion de la division = " + solucion);

        // multiplicacion
        solucion = num1 * num2;
        System.out.println("Solucion de la multiplicacion = " + solucion);

        // Extra
        var solucion2 = 3.4 / num2;
        System.out.println("Solucion extra = " + solucion2);

        // Modulo
        solucion = num1 % num2;
        System.out.println("Residuo entero de la division = " + solucion);

        if (num1 % 2 == 0) {
            System.out.println("Es un numero par");
        } else {
            System.out.println("No es un numero par");
        }

        // Operadores de asignacion
        int varNum1 = 1, varNum2 = 4;
        int varNum3 = varNum1 + 6 - varNum2;
        System.out.println("varNum3 = " + varNum3);

        varNum1 += 1; // varNum1 = varNum1 + 1;
        System.out.println("varNum1 = " + varNum1);

        varNum2 -= 2; // varNum2 = varNum2 - 2;
        System.out.println("varNum1 = " + varNum2);

        varNum1 *= 5; // varNum1 = varNum1 * 5;
        System.out.println("varNum1 = " + varNum1);

        varNum3 = 4; // varNum1 = varNum3 * 4;
        System.out.println("varNum1 = " + varNum3);

        varNum1 %= 6; // varNum1 = varNum1 % 6;
        System.out.println("varNum1 = " + varNum1);
    }
}

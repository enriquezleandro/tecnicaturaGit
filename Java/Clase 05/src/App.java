public class App {
    public static void main(String[] args) throws Exception {
        //Inferencia de tipos var y tipos primitivos
        //Las literales sin puntos automaticamente son de tipo int.
        var numEntero = 20; 
        System.out.println("numEntero = " + numEntero);

        //Las literales con puntos automaticamente son asignadas al tipo double.
        var numFloat = 10.0F; 
        System.out.println("NumFloat = " + numFloat);

        //Tipo primitivo char
        char miVariableChar = 'a';
        System.out.println("miVariableChar = " + miVariableChar);

        //Representamos el simbolo $ desde teclado
        char varTeclado = '$';
        System.out.println("varTeclado = " + varTeclado);

        //Representamos el simbolo $ en formato unicode
        char varUnicode = '\u0024';
        System.out.println("varUnicode = " + varUnicode);

        //Ahora representamos el simbolo $ con valor decimal
        char varDecimal = 36;
        System.out.println("varDecimal = " + varDecimal );

        //En este caso el programa va a tomar este valor como un int
        var varDecimal1 = 36;
        System.out.println("varDecimal1 = " + varDecimal1);

        //Para que eso no pase lo que debemos hacer es transformar en char
        var varDecimal2 = (char)36;
        System.out.println("varDecimal1 = " + varDecimal2);

        //Tambien podemos averiguar el valor decimal del simbolo declarandolo como int
        int varDecimal3 = '$';
        System.out.println("varDecimal3 = " + varDecimal3);
    }
}

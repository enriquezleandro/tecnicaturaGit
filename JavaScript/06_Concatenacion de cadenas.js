//Definimos dos variables
var nombre = "Javier";
var apellido = "Milei";

//Js admite concatenar variables dentro de otra variable
var nombreCompleto = nombre + " " + apellido;
console.log(nombreCompleto);

//Tambien permite concatenar cadenas dentro de una variable
var nombreCompleto2 = "Javier" + " " + "Milei";
console.log(nombreCompleto2);

//Js lee de izquierda a derecha.
//Si colocamos una str primero tomara al resto como variable
var juntos = nombre + 20 + 27;
console.log(juntos);

//Se puede evitar colocando utilizando parentesis
var juntos = nombre + (20 + 27);
console.log(juntos);

//Si colocamos un int primero hara todas las operaciones hasta encontrar un str
juntos = 20 + 27 + nombre;
console.log(juntos);

//Tambien se puede concatenar de una forma simplificada
nombre+=apellido;
console.log(nombre)
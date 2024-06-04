//Hoy no se utiliza var, se usa const para constantes y let para variables
let nombre = "Javier";
console.log(nombre);

const apellido = "Milei";
console.log(apellido);

/* con var se puede reasignar en cualquier momento
esta forma parte del ambito global
un error es que se sobreescribe
*/

var nom = "Javier";
nom = "Victoria";
console.log(nom);

function saludar() {
  var nom = "Karina";
  console.log(nom);
}
console.log(nom); //El problema aqui es que no lee el dato en la funcion

if (true) {
  var edad = 34;
  console.log(edad);
}
console.log(edad); //En la funcion funciono correctamente, en la estructura if fallo
/*
let: este puede ser reaignada en cualquier momento
la diferencia es que su ambito es de bloque,
solo disponible dentro de un bloque de llaves 
o de una funcion
*/

function saludar2() {
  let nombre2 = "Javier";
  console.log(nombre2);
}
console.log(nombre2);

if (true) {
  let edad2 = 33;
  console.log(edad2);
}
console.log(edad2);

/*
const se utiliza para valores constantes que no puede ser reasignados
*/

const fechaNac = 1994;
console.log(fechaNac);
fechaNac = 2001;
console.log(fechaNac);

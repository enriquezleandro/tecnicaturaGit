//TIPOS DE DATOS
//Tipo cadena
var nombre = "Javier";
console.log(nombre);

//Tipo numerico
var numero = 2027;
console.log(numero);

//Tipo objetos
var objeto = {
  nombre: "Javier",
  apellido: "Milei",
  telefono: "2027",
};
console.log(objeto);

//Tipo funcion
function miFuncion() {}
console.log(miFuncion);

//Tipo de dato booleano
var bandera = true;
console.log(typeof bandera);

//Tipo symbol
var simbolo = Symbol("mi simbolo");
console.log(simbolo);

//Tipo clase
class Persona {
  constructor(nombre, apellido) {
    this.nombre = "Leandro";
    this.apellido = "Enriquez";
  }
}
console.log(typeof Persona);

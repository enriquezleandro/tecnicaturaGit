//Ejercicio: Si el padre puede asistir al juego de su hijo
let vacaciones = false,
  diaDescanso = true;

if (vacaciones || diaDescanso) {
  console.log("El padre puede ir al partido de su hijo");
} else {
  console.log("El padre no puede ir al partido de su hijo");
}

//Ejercicio: Operador ternario
let numero1 = 3 > 2 ? "Verdadero" : "falso";
console.log(numero1);

let numero2 = 12;
console.log(numero2);

numero2 = numero1 % 2 == 0 ? "Es un numero par" : "Es un numero impar";
console.log(numero2);

//Ejercicio: Convertir de String a Number

let miNumero1 = "21";
console.log(typeof miNumero1);

let miNumero2 = Number(miNumero1);
console.log(typeof miNumero2);

//Funcion isNaN
if (isNaN(miNumero2)) {
  console.log("La variable no contiene solo numeros");
} else {
  if (miNumero2 >= 18) {
    console.log("Es mayor de edad");
  } else {
    console.log("Es menor de edad");
  }
}

//Operador ternario
let resultado2 = miNumero2 >= 18 ? "Es mayor de edad" : "No es mayor de edad";
console.log(resultado2);

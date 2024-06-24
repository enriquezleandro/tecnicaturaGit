//Ejercicio 1: Calcular estacion del año
//Con if

let mes = 4;
let estacion;

if (mes == 1 || mes == 2 || mes == 12) {
  estacion = "Verano";
} else if (mes == 3 || mes == 4 || mes == 5) {
  estacion = "Otoño";
} else if (mes == 6 || mes == 7 || mes == 8) {
  estacion = "Invierno";
} else if (mes == 9 || mes == 10 || mes == 11) {
  estacion = "Primavera";
} else {
  estacion = "Usted ingreso un valor invalido";
}
console.log("La estacion es: " + estacion);

//Con switch
switch (mes) {
  case 1:
  case 2:
  case 12:
    estacion = "Verano";
    break;
  case 3:
  case 4:
  case 5:
    estacion = "Otoño";
    break;
  case 6:
  case 7:
  case 8:
    estacion = "Invierno";
    break;
  case 9:
  case 10:
  case 11:
    estacion = "Primavera";
    break;
  default:
    estacion = "Usted ingreso un valor invalido";
}
console.log("La estacion es: " + estacion);

//Ejercicio 2: Hora del dia
/*
de 6 a 11 nos saluda: Good morning!
de 12 a 16 nos saluda: Good afternoon!
de 17 a 19 nos saluda: Good evening!
de 20 a 23 nos saluda: Good night!
*/

let hora = 23;
let mensaje;

if (hora >= 6 && hora <= 11) {
  mensaje = "Good morning!";
} else if (hora >= 12 && hora <= 16) {
  mensaje = "Good afternoon!";
} else if (hora >= 17 && hora <= 19) {
  mensaje = "Good evening!";
} else if (hora >= 20 && hora <= 23) {
  mensaje = "Good night!";
} else {
  mensaje = "Ingrese una hora correcta";
}
console.log(mensaje);

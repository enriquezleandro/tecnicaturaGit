# EJERCICIO 3 CALCULAR ESTACION DEL AÑO
# Pedir al usuario que ingrese un mes del año para luego decirle en que estacion del año se encuentra

while True:
    mes = int(input("Ingrese el mes del año (1/12): "))
    estacion = None

    if 1 <= mes <= 3:
        print(f'El mes {mes} corresponde a la estacion verano')
        break
    elif 4 <= mes <= 6:
        print(f'El mes {mes} corresponde a la estacion otoño')
        break
    elif 7 <= mes <= 9:
        print(f'El mes {mes} corresponde a la estacion invierno')
        break
    elif 10 <= mes <= 12:
        print(f'El mes {mes} corresponde a la estacion primavera')
        break
    else:
        print("Debe ingresar un numero valido")

# EJERCICIO 4 ETAPAS DE VIDA
# Haremos un programa que cuando el usuario ingrese su edad le diga en que etapa de su vida se encuentra

while True:
    edad = int(input("Ingrese su edad: "))

    if 1 <= edad <= 10:
        print("La infancia es increible")
        break
    elif 10 <= edad <= 19:
        print("Hay muchos cambios y mucho para estudiar")
        break
    elif 20 <= edad <= 29:
        print("A agarrar la pala y pagar impuestos")
        break
    elif 30 <= edad <= 65:
        print("Seguis pagando impuestos")
        break
    elif 65 <= edad <= 85:
        print("Seguis pagando impuestos pero pero un poco te la devuelven en forma de jubilacion")
        break
    elif 85 <= edad <= 100:
        print("¿Seguis aca?")
        break
    else:
        print("Ni que fueras tan viejo, dale ingresa tu edad verdadera")

# EJERCICIO 5 SISTEMA DE CALIFICACIONES
# Crear un sistema de calificaciones de acuerdo al valor ingresado por el usuario

while True:
    num = int(input("Ingrese la calificacion: "))
    calificacion = None

    if 0 <= num < 6:
        calificacion = "F"
        break
    elif 6 <= num < 7:
        calificacion = "D"
        break
    elif 7 <= num < 8:
        calificacion = "C"
        break
    elif 8 <= num < 9:
        calificacion = "B"
        break
    elif 9 <= num <= 10:
        calificacion = "A"
        break
    else:
        print("Debe ingresar una nota valida")

print(f'Su nota {num} corresponde a una calificacion: {calificacion}')

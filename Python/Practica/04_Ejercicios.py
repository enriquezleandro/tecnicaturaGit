# EJERCICIO RECTANGULO

# En el siguiente ejercicio se solicita calcular el área y el perímetro de un rectángulo.
# Para ello debemos de crear las siguientes variables: alto (int), ancho (int)
# El usuario debe de proporcionar los valores de alto y ancho, despues se debe imprimir el resultado

# Solicitud al usuario de los datos correspondientes
alto = int(input("Proporciona el alto del rectangulo: "))
ancho = int(input("Proporciona el ancho del rectangulo: "))

# Calculo de los valores necesarios
area = alto * ancho
perimetro = (alto + ancho)*2

# Muestra en pantalla de datos obtenidos

print("Area:", area)
print("Perimetro:", perimetro)


# EJERCICIO NUMERO PAR O IMPAR

# Solicitamos que el usuario ingrese un número, se le asigna a una variable y determinar si el numero es par.
# Imprimir dentro de una estructura if/else de acuerdo al resultad.

# A hacer el ejercicio en PyCharm

# Solicitud al usuario de los datos correspondientes
num = int(input("Ingrese un numero: "))

# Realizamos el calculo correspondiente e imprimimos el resultado
if num % 2 == 0:
    print("El numero: {num} es par")
else:
    print("El numero: {num} es impar")

# EJERCICIO DETERMINAR SI ES MAYOR DE EDAD

# Pedir al usuario que ingrese un numero y almacenarlo en una variable, este numero representa una edad.
# Determinar si la edad ingresada corresponde a la mayoria de edad o no

# Solicitud al usuario de los datos correspondientes
edad = int(input("Ingrese una edad: "))

# Realizamos el calculo correspondiente e imprimimos el resultado
if edad >= 18:
    print("La edad {edad} corresponde a la mayoria de edad")
else:
    print("La edad {edad} no corresponde a la mayoria de edad")

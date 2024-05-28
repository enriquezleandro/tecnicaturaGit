import math
# EJERCICIO CONVERSION A TEXTO
num = int(input('Digite un numero en el rango del 1 al 3: '))
numText = ''

if num == 1:
    numText = 'Numero uno'
elif num == 2:
    numText = 'Numero dos'
elif num == 3:
    numText = 'Numero 3'
else:
    numText = 'Haz ingresado un numero fuera de rango'

print(f'El numero ingresado es: {num} - {numText}')


# EJERCICIO 1
# Escribir la siguiente expresion en forma algoritmica ((a3x(b2-2ac))/2b)
# Pedimos al usuario 3 valores = a, b, c e imprimimos el resultado

a = float(input("Ingrese el primer valor: "))
b = float(input("Ingrese el segundo valor: "))
c = float(input("Ingrese el tercer valor: "))

ecuacion = ((a * 3 * (b * 2 - 2 * a * c)) / 2 * b)

print(f'El resultado es: {ecuacion}')

# EJERCICIO 2
# Determinar la solucion logica de la siguiente operacion

((3 + 5 * 8) < 3 and ((- 6/3 * 4) + 2 < 2)) or (a > b)


# EJERCICIO 3
# Intercambiar el valor de dos variables
a = 10
b = 5

print(f'El valor de A es: {a}')
print(f'El valor de B es: {b}')

aux = a
a = b
b = aux

print(f'El valor de A es: {a}')
print(f'El valor de B es: {b}')

# EJERCICIO 4
# Hacer un programa para ingresar el radio de un circulo y se reporte su area y longitud de la circunferencia

r = float(input("Ingrese el radio de la circunferencia: "))

area = math.pi * (r ** 2)
longitud = 2 * math.pi * r

print(f'El area de la circunferencia con radio {r} es de: {area}')
print(f'La longitud de la circunferencia con radio {r} es de: {longitud}')

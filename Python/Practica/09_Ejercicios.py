# 1. Diseñar un programa que ingresando un año nos devuelva por consola si es un año bisiesto
# o no, repetir hasta que el usuario lo decida.

year = int(input("Ingrese el año: "))

if year % 4 == 0 and year % 100 != 0 or year % 400 == 0:
    print(f'El año {year} es bisiesto')
else:
    print(f'El año {year} no es bisiesto')


# 2. Calcular la suma de "n" primeros numeros.

num = int(input("Digite la cantidad de numeros consecutivos a sumar: "))
aux = 0
for i in range(num+1):
    aux = aux + i

print(f'La suma de {num} consecutivos es: {aux}')

# 3. Leer 10 numeros e imprimir cuantos son positivos cuantos negativos y cuantos neutros.

may = 0
neu = 0
neg = 0

for i in range(10):
    num = int(input(f'Ingrese un numero ({10-i}): '))
    if num > 0:
        may += 1
    elif num == 0:
        neu += 1
    else:
        neg += 1

print(f'La cantida de numeros positivos es: {may}')
print(f'La cantidad de numeros neutros es: {neu}')
print(f'La cantidad de numeros negativos es: {neg}')

# 4. suponga que se tiene un conjuntos de calificaciones de un
# grupo de 10 alumnos. Realizar un algoritmo para calcular la
# calificacion promedio y la calificacion mas baja de todo el grupo

sumnot = 0
notaBaja = 10

for i in range(10):
    nota = int(input(f'Ingrese la nota del alumno ({10-i}): '))
    sumnot += nota

    if notaBaja > nota:
        notaBaja = nota

print(f'El promedio de las notas del curso es: {sumnot/10}')
print(f'La nota mas baja del curso es: {notaBaja}')

# Todo va a estar bien :)

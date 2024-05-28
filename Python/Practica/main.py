'''
# CLASE 02
# Experimentamos como las variables en python son dinamicas
miVariable = 3
print(miVariable)
miVariable = "Hello to all students of this university"
print(miVariable)
miVariable = 3.5
print(miVariable)

# Utilizamos la identacion de una variable
x = 10
y = 2
z = x+y
print(id(x))

# CLASE 03
# Tipos de datos tipo String, float, int, bool
a = "Hola Mundo"
print(a)

a = 1
print(a)
a = 3.5
print(a)

a = True
print(a)

# MANEJO DE CADENAS
bandaPreferida = "Pink Floyd"
print(bandaPreferida)

# Concatenacion de cadenas
print("Mi grupo favorito es: " + bandaPreferida)
print("Mi grupo favorito es:", bandaPreferida)

# Sumatoria de numeros en cadenas
numero1 = "7"
numero2 = "8"

print(numero1 + numero2)
print(int(numero1) + int(numero2))

# Tipos booleanos
miBooleano = True
print(miBooleano)

miBooleano = 1 > 2
print(miBooleano)

miBooleano = 2 > 1
print(miBooleano)

if miBooleano:
    print("El resultado es verdadero")
else:
    print("El resultado es falso")

# Procesar entrada del usuario

resultado = input()
print(resultado)

resultado = input("Digite un numero: ")
print(resultado)
print("El numero es: " + resultado)

# Conversion de entrada de datos
numero1 = int(input("Ingrese un numero: "))
numero2 = int(input("Ingrese otro numero: "))
print(type(numero1))
resultado = numero1 + numero2
print("El resultado de la suma es: ", resultado)

# CLASE 04
# OPERADORES ARITMETICOS
operandoA = 8
operandoB = 5

suma = operandoA + operandoB
print("Resultado de la suma:", suma)
print(f'El resultado de la suma es: {suma}')

resta = operandoA - operandoB
print(f'El resultado de la resta es: {resta}')

division = operandoA / operandoB
print(f'El resultado de la division es: {division}')

restaentera = operandoA // operandoB
print(f'El resultado entero de la resta es: {restaentera}')

multiplicacion = operandoA * operandoB
print(f'El resultado de la resta es: {multiplicacion}')

exponente = operandoA ** operandoB
print(f'El resultado de la exponenciacion es: {exponente}')

modulo = operandoA % operandoB
print(f'El resto de la division es: {modulo}')

# Algunos operadores aritmeticos tambien nos permiten realizar operaciones sobre cadenas de texto
print('Hello world ' * 4)

# OPERADORES DE ASIGNACION
# Asignacion con suma
miVariable = 10
miVariable += 2
print(miVariable)

# Asignacion con resta
miVariable = 10
miVariable -= 2
print(miVariable)

# Asignacion con multiplicacion
miVariable = 10
miVariable *= 2
print(miVariable)

# Asignacion con division
miVariable = 10
miVariable /= 2
print(miVariable)

# Operadores de comparacion
a = 2
b = 3
# Igual a
resultado = a == b
print(resultado)

# Distinto a
resultado = a != b
print(resultado)

# Mayor que
resultado = a >= b
print(resultado)

# Menor que
resultado = a <= b
print(resultado)

# OPERADORES LOGICOS

# Operador and
a = False
b = True

resultado = a and b

print(resultado)

# Operador or

resultado = a or b

print(resultado)
'''
# CLASE 06
# Estructura de control if
condicion = False
if condicion == True:
    print('Condicion Verdadera')
elif condicion == False:
    print('Condicion Falsa')
else:
    print('Condicion sin especificar')

# Operador ternario estructura if
print('Condicion Verdadera') if condicion else print('Condicion Falsa')

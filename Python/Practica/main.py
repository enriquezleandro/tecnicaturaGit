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

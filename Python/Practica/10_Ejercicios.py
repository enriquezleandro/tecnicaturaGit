# 5. Calcular el factorial de un numero mayor o igual a 0
num = int(input("Digite un numero: "))

i = 1
factorial = 1

# Verificar si el número es mayor o igual a 0
if num >= 0:
    # Calcular el factorial usando un ciclo while
    while i <= num:
        factorial = factorial * i
        i = i + 1
    # Imprimir el resultado
    print(f"El factorial es: {factorial}")
else:
    print("El número debe ser mayor o igual a 0.")

# 6. Ingresar "N" enteros, visualizar la suma de los numeros pares de la lista,
# cuantos numeros pares existen y cuales el promedio de los numero.

cant = int(input("¿Cuantos numeros desea ingresar?"))
par = 0
sum = 0
for i in range(cant):
    num1 = int(input(f'Ingrese un numero({cant-i}):'))
    sum = sum + num1
    if num1 % 2 == 0:
        par += 1

print(f'La sumatoria total de los numeros ingresados es: {sum}')
print(f'La cantidad de numeros pares ingresados es: {par}')

# 7. Dadas las horas trabajadas de 5 personas y la tarifa
# de pago, calcular el salario y la sumatoria de todos los salarios

# Inicialización de variables
i = 1
suma = 0

while i <= 5:
    print(f'Salario del empleado: {i}')
    horas = float(input('Digite las horas trabajadas:'))
    tarifa = float(input('Digite tarifa por hora:'))
    salario = horas * tarifa
    print(f'El salario es: ${salario}')
    suma += salario
    i += 1
print(f'La suma de todos los salarios es de: ${suma}')

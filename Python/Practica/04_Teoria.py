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
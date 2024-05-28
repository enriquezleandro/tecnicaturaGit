# EJERCICIO VALOR DENTRO DE RANGO

# Le solicitamos al usuario que ingrese un num y verificamos si se encuentra en el rango de 0 a 5

# Solicitamos al usuario que ingrese el dato
num = int(input("Ingrese un numero: "))

valorMin = 0
valorMax = 5
dentroDeRango = num >= valorMin and num <= valorMax

if dentroDeRango:
    print(f'El valor {num} esta dentro del rango')
else:
    print(f'El valor {num} no esta dentro del rango')


# EJERCICIO OPERADOR OR

# La pregunta es si un padre puede asistir al juego de su hijo.
# Verificamos si tiene vacaciones y verificamos si tiene dia libre, usar operador or en estructura if else

vacaciones = True
tiempoLibre = False

if not vacaciones and tiempoLibre:
    print('Esta ocupado')
else:
    print('Puede asistir')

# EJERCICIO RANGO ENTRE EDAD 20 Y 30 AÑOS

# Preguntar la edad al usuario para verificar si esta entre los 20 y 30 usar and y or para hacerlo

edad = int(input("Ingrese su edad: "))

if 20 <= edad <= 30:
    print(f'Su edad ({edad}) esta dentro del rango')
else:
    print(f'Su edad ({edad}) no esta dentro del rango')

# EJERCICIO MAYOR DE DOS NUMEROS

# Solicitar al usuario dos valores, determinar cual es el mayor

num1 = int(input("Ingrese el primer numero: "))
num2 = int(input("Ingrese el segundo numero: "))

if num1 < num2:
    print(f'El numero {num2} es mayor al numero {num1}')
elif num1 > num2:
    print(f'El numero {num1} es mayor al numero {num2}')
else:
    print(f'El numero {num1} es igual al numero {num2}')

# EJERCICIO TIENDA DE LIBROS

# Pedir al usuario que ingrese el nombre, Id y precio de un libro, indicar si el envio es gratis

nombre = input("Ingrese el nombre del libro : ")
id = input("Ingrese el ID del libro: ")
precio = float(input("Ingrese el precio del libro: "))
tipoEnvio = input("Indique si el envio es gratuito si/no: ")
if tipoEnvio == 'si':
    tipoEnvio = "gratuito"
else:
    tipoEnvio = "Con costo"
print(f'''
      Nombre: {nombre}
      Id: {id}
      Precio: {precio}
      Tipo de envio: {tipoEnvio}
      ''')

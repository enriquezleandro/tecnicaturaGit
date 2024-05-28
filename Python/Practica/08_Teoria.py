# Ciclo while (mientras o durante)
contador = 0

while contador <= 10:
    print('Ciclo while N: ', contador)
    contador += 1
else:
    print('Fin del ciclo while')

# Ciclo for
cadena = 'Hello'
for letra in cadena:
    print(letra)
else:
    print('Fin del ciclo for')

# Sentencia de salto break
for letra in 'Alemania':
    if letra == 'a':
        print(f'Letra encontrada: {letra}')
        break
else:
    print('Fin del ciclo for')

# Sentencia de salto continue
#Aca no usamos la sentencia continue
for i in range(6):
    if i % 2 == 0:
        print(f'Valor: {i}')

#Aca usamos la sentencia continue
for i in range(6):
    if i % 2 != 0:
        continue
    print(f'Valor: {i}')

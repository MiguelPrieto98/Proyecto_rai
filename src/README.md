# Informe de ventas en paralelo

> Plantilla del README del proyecto A01.5. Sustituid todo lo que está entre corchetes y borrad
> esta nota. Cada sección tiene una explicación de lo que hay que poner.

[Aplicación que solicita información a otro programa y, a partir de los datos recibidos, genera informes de ventas de las distintas tiendas. También mide el tiempo empleado en procesar los datos y generar el informe.]
## Persona

| Nombre | Qué ha hecho |
|---|---|
| [Miguel Ángel Prieto Rodriguez] | [Todo el proyecto en solitario] |


## Cómo se ejecuta

[Cómo se compila y qué clases se lanzan, desde la terminal y desde IntelliJ IDEA. Versión de
Java.]

## Procesos

| Clase | Papel | Entrada | Salida | Códigos de salida |
|---|---|---|---|---|
| [`SalesReport`] | [Padre / hijo; qué hace] | [Argumentos, entrada estándar...] | [Salida estándar, salida de error...] | [0: ...] |

[Cómo se conectan: qué lanza cada padre, qué se pasan y por dónde.]

## Pruebas realizadas

| Prueba | Resultado esperado | Resultado obtenido |
|---|---|---|
| [Informe de las 8 tiendas] | [El total que da el enunciado] | [...] |
| [Una tienda que no existe] | [...] | [...] |

## Tiempos

[Tiempo del informe uno a uno y todos a la vez, en vuestro equipo, con el número de núcleos.
¿Cuánto más rápido va? ¿Por qué no va 8 veces más rápido?]

## Caja en directo

[Las trazas de los dos escenarios y qué demuestran: quién espera en cada uno y por qué.]

## Depuración
- La fase 1 resultó bastante directa de implementar. La fase 2 requirió más tiempo porque fue necesario coordinar correctamente los métodos launch(), collect() y report(), además de comprender el intercambio de información entre procesos padre e hijo.
- Me encontré con un error al convertir los valores a long. Al depurar vi que los datos recibidos del hijo llevaban espacios en blanco ocultos alrededor del separador ;, por lo que el parseo fallaba. La solución fue eliminar esos espacios antes de hacer la conversión.
- Al probar el informe apareció un error porque el bucle empezaba en 0 y se intentaba lanzar una tienda inexistente. La solución fue crear una variable con i + 1 y usarla como identificador real de tienda.
]

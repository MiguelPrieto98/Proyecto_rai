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
¿Cuánto más rápido va?
- ¿Por qué no va 8 veces más rápido?
Aunque se ejecuten los ocho procesos a la vez, existen costes de creación y gestión de los procesos, además de la competencia por los recursos del procesador. Por eso, la ejecución en paralelo normalmente no consigue una aceleración exactamente ocho veces mayor.
## Ejecución del programa

### Resultado
#### Fase 2

    La tienda 1 El pid del hijo es 18324 El total de unidades es 150007132 El total de euros es 422699468,09
    El hijo lanzo un pid 18324; Su salida es : 150007132 ; 42269946809
    El hijo ha terminado con el código 0

    La tienda 2 El pid del hijo es 26228 El total de unidades es 150008398 El total de euros es 422697441,81
    El hijo lanzo un pid 26228; Su salida es : 150008398 ; 42269744181
    El hijo ha terminado con el código 0

    La tienda 3 El pid del hijo es 27116 El total de unidades es 149991121 El total de euros es 422677286,83
    El hijo lanzo un pid 27116; Su salida es : 149991121 ; 42267728683
    El hijo ha terminado con el código 0

    La tienda 4 El pid del hijo es 28016 El total de unidades es 150001401 El total de euros es 422566094,07
    El hijo lanzo un pid 28016; Su salida es : 150001401 ; 42256609407
    El hijo ha terminado con el código 0

    La tienda 5 El pid del hijo es 17448 El total de unidades es 149985543 El total de euros es 422758599,64
    El hijo lanzo un pid 17448; Su salida es : 149985543 ; 42275859964
    El hijo ha terminado con el código 0

    La tienda 6 El pid del hijo es 28464 El total de unidades es 150012774 El total de euros es 422710553,98
    El hijo lanzo un pid 28464; Su salida es : 150012774 ; 42271055398
    El hijo ha terminado con el código 0

    La tienda 7 El pid del hijo es 26764 El total de unidades es 150001397 El total de euros es 422814998,53
    El hijo lanzo un pid 26764; Su salida es : 150001397 ; 42281499853
    El hijo ha terminado con el código 0

    La tienda 8 El pid del hijo es 28320 El total de unidades es 150006583 El total de euros es 422747495,75
    El hijo lanzo un pid 28320; Su salida es : 150006583 ; 42274749575
    El hijo ha terminado con el código 0

    El total de unidades es 1200014349
    El total de centimos es 338167193870
    Su tiempo de ejecucion es 6271 ms

    Process finished with exit code 0

## Caja en directo

[Las trazas de los dos escenarios y qué demuestran: quién espera en cada uno y por qué.]

## Depuración
- La fase 1 resultó bastante directa de implementar. La fase 2 requirió más tiempo porque fue necesario coordinar correctamente los métodos launch(), collect() y report(), además de comprender el intercambio de información entre procesos padre e hijo.
- Durante el desarrollo también fue necesario ajustar el identificador de tienda, ya que el bucle comenzaba en 0 mientras que las tiendas válidas iban de la 1 a la 8. Se solucionó utilizando una variable auxiliar con i + 1 para trabajar con el identificador real de tienda.
- Me encontré con un error al convertir los valores a long. Al depurar vi que los datos recibidos del hijo llevaban espacios en blanco ocultos alrededor del separador ;, por lo que el parseo fallaba. La solución fue eliminar esos espacios antes de hacer la conversión.
- Al probar el informe apareció un error porque el bucle empezaba en 0 y se intentaba lanzar una tienda inexistente. La solución fue crear una variable con i + 1 y usarla como identificador real de tienda.
]

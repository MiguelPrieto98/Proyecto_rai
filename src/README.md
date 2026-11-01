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
#### Fase 3
    Tiendas que han fallado: 1
    Tiendas que han fallado: 2
    Tiendas que han fallado: 3
    Tiendas que han fallado: 4
    Tiendas que han fallado: 5
    Tiendas que han fallado: 6
    Tiendas que han fallado: 7
    Tiendas que han fallado: 8
    Tiendas que han fallado: 9
    El total de unidades es 0
    El total de centimos es 0
    Su tiempo de ejecucion es 105 ms
#### Fase 5
    "C:\Program Files\Java\jdk\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2026.2.3\lib\idea_rt.jar=50481" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\migue\Proyectos\Proyecto_rai\out\production\Proyecto_rai SalesReport
    La tienda 1 El pid del hijo es 28564 El total de unidades es 150007132 El total de euros es 422699468,09
    El hijo lanzo un pid 28564; Su salida es : 150007132 ; 42269946809
    El hijo ha terminado con el código 0
    La tienda 2 El pid del hijo es 29236 El total de unidades es 150008398 El total de euros es 422697441,81
    El hijo lanzo un pid 29236; Su salida es : 150008398 ; 42269744181
    El hijo ha terminado con el código 0
    La tienda 3 El pid del hijo es 7748 El total de unidades es 149991121 El total de euros es 422677286,83
    El hijo lanzo un pid 7748; Su salida es : 149991121 ; 42267728683
    El hijo ha terminado con el código 0
    La tienda 4 El pid del hijo es 23432 El total de unidades es 150001401 El total de euros es 422566094,07
    El hijo lanzo un pid 23432; Su salida es : 150001401 ; 42256609407
    El hijo ha terminado con el código 0
    La tienda 5 El pid del hijo es 23664 El total de unidades es 149985543 El total de euros es 422758599,64
    El hijo lanzo un pid 23664; Su salida es : 149985543 ; 42275859964
    El hijo ha terminado con el código 0
    La tienda 6 El pid del hijo es 1080 El total de unidades es 150012774 El total de euros es 422710553,98
    El hijo lanzo un pid 1080; Su salida es : 150012774 ; 42271055398
    El hijo ha terminado con el código 0
    La tienda 7 El pid del hijo es 24276 El total de unidades es 150001397 El total de euros es 422814998,53
    El hijo lanzo un pid 24276; Su salida es : 150001397 ; 42281499853
    El hijo ha terminado con el código 0
    La tienda 8 El pid del hijo es 29804 El total de unidades es 150006583 El total de euros es 422747495,75
    El hijo lanzo un pid 29804; Su salida es : 150006583 ; 42274749575
    El hijo ha terminado con el código 0
    El total de unidades es 1200014349 El total de centimos es 338167193870 su tiempo de ejecución es 6288
    La tienda 1 El pid del hijo es 20868 El total de unidades es 150007132 El total de euros es 422699468,09
    El hijo lanzo un pid 20868; Su salida es : 150007132 ; 42269946809
    El hijo ha terminado con el código 0
    La tienda 2 El pid del hijo es 24996 El total de unidades es 150008398 El total de euros es 422697441,81
    El hijo lanzo un pid 24996; Su salida es : 150008398 ; 42269744181
    El hijo ha terminado con el código 0
    La tienda 3 El pid del hijo es 6780 El total de unidades es 149991121 El total de euros es 422677286,83
    El hijo lanzo un pid 6780; Su salida es : 149991121 ; 42267728683
    El hijo ha terminado con el código 0
    La tienda 4 El pid del hijo es 27652 El total de unidades es 150001401 El total de euros es 422566094,07
    El hijo lanzo un pid 27652; Su salida es : 150001401 ; 42256609407
    El hijo ha terminado con el código 0
    La tienda 5 El pid del hijo es 25148 El total de unidades es 149985543 El total de euros es 422758599,64
    El hijo lanzo un pid 25148; Su salida es : 149985543 ; 42275859964
    El hijo ha terminado con el código 0
    La tienda 6 El pid del hijo es 24908 El total de unidades es 150012774 El total de euros es 422710553,98
    El hijo lanzo un pid 24908; Su salida es : 150012774 ; 42271055398
    El hijo ha terminado con el código 0
    La tienda 7 El pid del hijo es 7420 El total de unidades es 150001397 El total de euros es 422814998,53
    El hijo lanzo un pid 7420; Su salida es : 150001397 ; 42281499853
    El hijo ha terminado con el código 0
    La tienda 8 El pid del hijo es 19940 El total de unidades es 150006583 El total de euros es 422747495,75
    El hijo lanzo un pid 19940; Su salida es : 150006583 ; 42274749575
    El hijo ha terminado con el código 0
    Las tiendas   El total de unidades es 1200014349 El total de centimos es 338167193870 su tiempo de ejecución es 923
    El informe en paralelo ha ido 6,81 veces más rápido que el secuencial.
    
    Process finished with exit code 0


## Caja en directo
#### Fase 4
    Escenario 1, caja lenta y registro rápido: 5 tickets; pausa de la caja, 500 ms, y del registro, 0
    17:49:34.033 se ha creado el ticket 1
    17:49:34.0331 3673
    17:49:34.538 se ha creado el ticket 2
    17:49:34.5382 1042
    17:49:35.039 se ha creado el ticket 3
    17:49:35.0393 4443
    17:49:35.539 se ha creado el ticket 4
    17:49:35.5394 6887
    17:49:36.040 se ha creado el ticket 5
    17:49:36.0405 8963
    17:49:36.040 Tickets finalizado
    leadger fin de la entrada: 5 tickets 250.08 Euros
    Escenario 2, caja rápida y registro lento: 10 tickets; pausa de la caja, 0, y del registro, 300 ms.
    17:49:36.192 se ha creado el ticket 1
    17:49:36.198 se ha creado el ticket 2
    17:49:36.198 se ha creado el ticket 3
    17:49:36.198 se ha creado el ticket 4
    17:49:36.198 se ha creado el ticket 5
    17:49:36.198 se ha creado el ticket 6
    17:49:36.199 se ha creado el ticket 7
    17:49:36.199 se ha creado el ticket 8
    17:49:36.199 se ha creado el ticket 9
    17:49:36.199 se ha creado el ticket 10
    17:49:36.1921 393
    17:49:36.199 Tickets finalizado
    17:49:36.5022 2245
    17:49:36.8023 9768
    17:49:37.1034 190
    17:49:37.4045 9943
    17:49:37.7056 1481
    17:49:38.0067 5557
    17:49:38.3068 8394
    17:49:38.6079 6409
    17:49:38.90810 1087
    leadger fin de la entrada: 10 tickets 454.67 Euros
    
    Process finished with exit code 0

[Las trazas de los dos escenarios y qué demuestran: quién espera en cada uno y por qué.]

## Depuración
- La fase 1 resultó bastante directa de implementar. La fase 2 requirió más tiempo porque fue necesario coordinar correctamente los métodos launch(), collect() y report(), además de comprender el intercambio de información entre procesos padre e hijo.
- Durante el desarrollo también fue necesario ajustar el identificador de tienda, ya que el bucle comenzaba en 0 mientras que las tiendas válidas iban de la 1 a la 8. Se solucionó utilizando una variable auxiliar con i + 1 para trabajar con el identificador real de tienda.
- Me encontré con un error al convertir los valores a long. Al depurar vi que los datos recibidos del hijo llevaban espacios en blanco ocultos alrededor del separador ;, por lo que el parseo fallaba. La solución fue eliminar esos espacios antes de hacer la conversión.
- Al probar el informe apareció un error porque el bucle empezaba en 0 y se intentaba lanzar una tienda inexistente. La solución fue crear una variable con i + 1 y usarla como identificador real de tienda.
- En la fase 3 una de las partes que más me hizo pensar no fue el código en sí, sino el orden de las comprobaciones. Tuve que decidir si comprobar primero el tiempo límite o el código de salida del proceso hijo para asegurar que solo se leyera el resultado cuando el proceso hubiera terminado correctamente.
]

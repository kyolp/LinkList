5190-18-19436
README – Ejercicios con LinkedList en Java
==========================================

Proyecto: Estructura de Datos 2025

Este proyecto contiene soluciones a ejercicios prácticos utilizando la clase LinkedList de Java, como parte del curso de estructuras de datos. Los ejercicios están implementados en la clase EjercicioLinkList.java, y las pruebas unitarias en el paquete umg.edu.gt.test.EjercicioLinkedList.

EJERCICIOS IMPLEMENTADOS
-------------------------

Ejercicio 1: Eliminar duplicados
- Descripción: Elimina los valores repetidos de una LinkedList<Integer>, dejando solo la primera aparición de cada elemento.
- Método: eliminarDuplicados(LinkedList<Integer> lista)

Ejercicio 2: Invertir lista sin estructuras auxiliares
- Descripción: Invierte una LinkedList<String> sin usar listas adicionales ni arrays.
- Método: invertirLista(LinkedList<String> lista)

Ejercicio 3: Intercalar dos listas ordenadas
- Descripción: Recibe dos listas de enteros ordenados y devuelve una nueva lista con los elementos intercalados manteniendo el orden.
- Método: intercalarListasOrdenadas(LinkedList<Integer> l1, LinkedList<Integer> l2)

PROCESO DE PRUEBA
-----------------

Las pruebas unitarias se encuentran en la clase EjercicioLinkListTest.java, dentro del paquete:

umg.edu.gt.test.EjercicioLinkedList

Pruebas realizadas:
- Test 1: Verifica que se eliminen los duplicados correctamente.
- Test 2: Valida que la lista de cadenas se invierta correctamente.
- Test 3: Verifica que el intercalado de listas funcione correctamente, forzando un fallo al comparar con un resultado incorrecto a propósito.

Las pruebas se ejecutan con JUnit 5 (junit-jupiter). Asegúrarse de tener las dependencias declaradas en tu pom.xml.

CÓMO EJECUTAR PRUEBAS
----------------------

Desde la terminal del proyecto Maven, puedes correr las pruebas con:

    mvn test

Esto se ejecutará automáticamente todos los métodos @Test definidos en el proyecto.

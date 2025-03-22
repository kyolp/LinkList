/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.test.EjercicioLinkedList;

import org.junit.jupiter.api.Test;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;
import umg.edu.EjercicioLinkList;

public class EjercicioLinkListTest {

    @Test
    public void testEliminarDuplicados() {
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(1); lista.add(2); lista.add(2); lista.add(3); lista.add(1);

        EjercicioLinkList.eliminarDuplicados(lista);

        LinkedList<Integer> esperado = new LinkedList<>();
        esperado.add(1); esperado.add(2); esperado.add(3);

        assertEquals(esperado, lista);
    }

    @Test
    public void testInvertirLista() {
        LinkedList<String> lista = new LinkedList<>();
        lista.add("uno"); lista.add("dos"); lista.add("tres");

        EjercicioLinkList.invertirLista(lista);

        LinkedList<String> esperado = new LinkedList<>();
        esperado.add("tres"); esperado.add("dos"); esperado.add("uno");

        assertEquals(esperado, lista);
    }

    @Test
    public void testIntercalarListasOrdenadas() {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(1); l1.add(3); l1.add(5);

        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(2); l2.add(4); l2.add(6);

        LinkedList<Integer> resultado = EjercicioLinkList.intercalarListasOrdenadas(l1, l2);

        LinkedList<Integer> esperado = new LinkedList<>();
        esperado.add(1); esperado.add(2); esperado.add(3); esperado.add(4); esperado.add(5); esperado.add(6);

        // Forzamos a fallar cambiando el orden
        assertNotEquals(esperado, resultado); // Este test fallará a propósito
    }
}

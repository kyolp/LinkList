package umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios;
import java.util.LinkedList;
public class EjercicioLinkedList {

    // Problema 1: Eliminar duplicados
    public static void eliminarDuplicados(LinkedList<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            Integer actual = lista.get(i);
            for (int j = lista.size() - 1; j > i; j--) {
                if (lista.get(j).equals(actual)) {
                    lista.remove(j);
                }
            }
        }
    }

    // Problema 2: Invertir lista sin usar otra estructura
    public static void invertirLista(LinkedList<String> lista) {
        int n = lista.size();
        for (int i = 0; i < n / 2; i++) {
            String temp = lista.get(i);
            lista.set(i, lista.get(n - 1 - i));
            lista.set(n - 1 - i, temp);
        }
    }

    // Problema 3: Intercalar dos listas ordenadas
    public static LinkedList<Integer> intercalarListasOrdenadas(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        LinkedList<Integer> resultado = new LinkedList<>();
        int i = 0, j = 0;

        while (i < l1.size() && j < l2.size()) {
            if (l1.get(i) <= l2.get(j)) {
                resultado.add(l1.get(i));
                i++;
            } else {
                resultado.add(l2.get(j));
                j++;
            }
        }

        while (i < l1.size()) resultado.add(l1.get(i++));
        while (j < l2.size()) resultado.add(l2.get(j++));

        return resultado;
    }
}



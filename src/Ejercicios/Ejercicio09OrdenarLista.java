package Ejercicios;

import java.sql.SQLOutput;
import java.util.List;
import java.util.stream.Collectors;

/*
Ordenar una lista: A partir de una lista de cadenas,
utiliza Stream para devolver una nueva lista con los elementos ordenados alfabéticamente.
 */
public class Ejercicio09OrdenarLista {
    public static void main(String[] args) {
        new Ejercicio09OrdenarLista();
    }

    public Ejercicio09OrdenarLista() {
        List<String> listaCadenas = List.of("hola", "animal", "vaca", "caballo", "cebra", "benda");
        System.out.println("=LISTA CADENAS=");
        System.out.println(listaCadenas);

        List<String> listaOrdenada = listaCadenas
                .stream()
                .sorted((o1, o2) -> o1.compareTo(o2))
                .toList();
        System.out.println("LISTA ORDENADA");
        System.out.println(listaOrdenada);
    }
}

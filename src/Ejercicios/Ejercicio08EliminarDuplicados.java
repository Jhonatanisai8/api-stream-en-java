package Ejercicios;
/*
Eliminar duplicados: Dada una lista de números, utiliza Stream
para eliminar duplicados y devolver la lista resultante.
 */

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Ejercicio08EliminarDuplicados {
    public static void main(String[] args) {
        new Ejercicio08EliminarDuplicados();

    }

    public Ejercicio08EliminarDuplicados() {
        Random random = new Random();

        List<Integer> listaEnteros = random
                .ints(10, 1, 20)
                .boxed()
                .collect(Collectors.toList());

        System.out.println("=LISTA DE ENTEROS=");
        System.out.println(listaEnteros);

        List<Integer> listaSinDuplicados = listaEnteros
                .stream()
                .distinct()
                .toList();
        System.out.println("=LISTA SIN DUPLICADOS=");
        System.out.println(listaSinDuplicados);


    }
}

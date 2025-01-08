package Ejercicios;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/*
Obtener los 3 primeros elementos: Dada una lista de números,
utiliza Stream para obtener los primeros 3 números más grandes.
 */
public class Ejercicio10OrdenarElementos3 {
    public static void main(String[] args) {
        new Ejercicio10OrdenarElementos3();
    }

    public Ejercicio10OrdenarElementos3() {
        Random random = new Random();

        List<Integer> listaEnteros = random
                .ints(10, 1, 20)
                .boxed()
                .toList();

        System.out.println("=LISTA=");
        System.out.println(listaEnteros);

        List<Integer> lista3NumerosGrandes = listaEnteros
                .stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("=LISTA DE 3 NUMEROS MAS GRANDES=");
        System.out.println(lista3NumerosGrandes);


    }
}

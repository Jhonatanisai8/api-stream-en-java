package recoleccionStreamALista;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class EjemploRecoleccionStreamArray {
    Random random = new Random();

    public static void main(String[] args) {
        new EjemploRecoleccionStreamArray();
    }

    public EjemploRecoleccionStreamArray() {
        List<Integer> listaEnteros = random
                .ints(10, 1, 5)
                .boxed()
                .toList();

        System.out.println(listaEnteros);

        Object[] arregloEnteros = listaEnteros.stream()
                .filter(integer -> integer % 2 == 0)
                .toArray();

        long cuantosSonPares = listaEnteros
                .stream()
                .filter(integer -> integer % 2 == 0)
                .count();

        System.out.println("cuantosSonPares = " + cuantosSonPares);

        Arrays.stream(arregloEnteros).forEach(System.out::println);

    }
}

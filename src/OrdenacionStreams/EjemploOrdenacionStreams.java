package OrdenacionStreams;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploOrdenacionStreams {
    private Random random = new Random();

    public static void main(String[] args) {
        new EjemploOrdenacionStreams();
    }

    public EjemploOrdenacionStreams() {
        System.out.println("\tOrdenacion Streams");
        List<Integer> listaEnteros = List.of(2, 3, 4);
        System.out.println("listaEnteros = " + listaEnteros);
        System.out.println("Ejemplo 01....");
        listaEnteros.stream()
                .flatMap(this::generarNumeroRandom)
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Ejemplo 02....");
        listaEnteros.stream()
                .peek(System.out::println)
                .collect(Collectors.toList());
        System.out.println();

        System.out.println("Ejemplo 03....");
        listaEnteros.stream()
                .parallel()
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Ejemplo 03....");
        listaEnteros.stream()
                .parallel()
                .forEachOrdered(integer -> System.out.println("integer = " + integer));
        System.out.println();

        System.out.println("\tOrdenacion");
        listaEnteros.stream()
                .sorted()
                .forEach(System.out::println);

        //ordenar una lista
        List<String> listaAnimales = List.of("vaca", "gallo", "abeja","caballo");
        listaAnimales.stream().sorted().forEach(System.out::println);
        System.out.println("");
        listaAnimales.stream().sorted((o1, o2) -> o1.length()-o2.length()).forEach(System.out::println);
        System.out.println();
        listaAnimales.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }

    private Stream<Integer> generarNumeroRandom(Integer valor) {
        return random.ints(valor, 1, 5).boxed();
    }

}

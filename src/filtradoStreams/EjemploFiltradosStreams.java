package filtradoStreams;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploFiltradosStreams {
    Random random = new Random();

    public static void main(String[] args) {
        new EjemploFiltradosStreams();
    }

    public EjemploFiltradosStreams() {
        System.out.println("\tFILTRACION DE STREAMS");

        System.out.println();
        System.out.println("\tLISTA 05 GENERADA");
        List<Integer> lista05 = IntStream.range(1, 10) // valores del 1 al 9
                .boxed() // convierte a una streams de integer
                .toList(); //recolectamos
        System.out.println("lista05 = " + lista05);

        //limit
        System.out.println("\tLimit");
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .limit(4)
                .forEach(System.out::println);
        System.out.println();

        System.out.println("\tfilter");
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .filter(integer -> integer % 2 == 0)
                .forEach(System.out::println);
        System.out.println();

        System.out.println("\tskip");
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .skip(4) // me borra los 4 primeros elementos
                .forEach(System.out::println);
        System.out.println();

        System.out.println("\tdropWhile");
        Stream.of(14, 2, 4, 6, 8, 9, 10, 12)
                .dropWhile(integer -> integer % 2 == 0)
                .forEach(System.out::println);
        System.out.println();


        System.out.println("\ttakeWhile");
        Stream.of(14, 2, 4, 6, 8, 9, 10, 12)
                .takeWhile(integer -> integer % 2 == 0)
                .forEach(System.out::println);
        System.out.println();

    }

    public int generarNumero() {
        return random.nextInt(10);
    }
}

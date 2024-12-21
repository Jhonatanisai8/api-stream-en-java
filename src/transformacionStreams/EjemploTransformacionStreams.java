package transformacionStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class EjemploTransformacionStreams {
    Random random = new Random();

    public static void main(String[] args) {
        new EjemploTransformacionStreams();
    }

    public EjemploTransformacionStreams() {
        System.out.println("\tTRANSFORMACIÓN DE STREAMS");
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("lista Original= " + lista);
        System.out.println();

        System.out.println("\tmap");
        List<String> resultado = lista.stream()
                .map(integer -> "valor " + integer) // transforma a tipo string
                .toList();
        System.out.println("resultado = " + resultado);

        System.out.println("\tmap");
        List<Integer> resultado02 = lista.stream()
                .map(integer -> integer * 2) // transforma la lista original mutiliplicando sus elementos por 2
                .toList();
        System.out.println("resultado02 = " + resultado02);

        System.out.println("\tmap");
        List<Double> resultado03 = IntStream.range(1, 10)
                .mapToDouble(integer -> integer * 2) // transforma los elementos a tipo double
                .boxed()
                .toList();
        System.out.println("resultado03 = " + resultado03);


        System.out.println("\tEjemplo Ultimo");
        Stream<Integer> result = Stream.of(2, 4, 6)
                .flatMap(this::getNumerosRandoms);
        List<Integer> listaGenerada = result.toList();
        System.out.println("listaGenerada = " + listaGenerada);


        //otro ejemplo
        Stream<Double> resul = Stream.of(1, 2, 3, 4)
                .flatMapToDouble(integer -> IntStream.range(1, integer).asDoubleStream())
                .boxed();
        List<Double> listaDoubles = resul.toList();
        System.out.println("listaDoubles = " + listaDoubles);
    }

    public Stream<Integer> getNumerosRandoms(int tamanio) {
        return random.ints(tamanio, 1, 10).boxed();
    }

    public int generarNumero() {
        return random.nextInt(10);
    }
}

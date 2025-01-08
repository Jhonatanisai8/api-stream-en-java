package Ejercicios;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
Calcular el promedio: Dada una lista de números enteros, 
utiliza el API de Stream para calcular el promedio de los valores.
 */
public class Ejercicio05PromedioEnteros {
    public static void main(String[] args) {
        new Ejercicio05PromedioEnteros();
    }

    public Ejercicio05PromedioEnteros() {
        List<Integer> listaEnteros = IntStream.range(1, 10)
                .boxed()
                .collect(Collectors.toList());
        System.out.println("LISTA");
        System.out.println(listaEnteros);
        OptionalDouble promedio = listaEnteros
                .stream()
                .mapToInt(Integer::intValue)
                .average();
        System.out.println("promedio = " + promedio);

    }
}

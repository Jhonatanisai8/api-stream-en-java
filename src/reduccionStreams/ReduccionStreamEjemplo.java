package reduccionStreams;

import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class ReduccionStreamEjemplo {
    public static void main(String[] args) {
        List<Integer> listaNumeros = List.of(1, 3, 4, 2, 5, -7, 6, 8, 0, 9);
        System.out.println("lista Numeros = " + listaNumeros);
        //uso del metodo count el cual retorna un long
        long numerosPares;
        numerosPares = listaNumeros.stream()
                .filter(integer -> integer % 2 == 0)
                .count();

        int suma = listaNumeros.stream()
                .mapToInt(Integer::valueOf)
                .sum();//convertimos cada elemento a tipo int

        listaNumeros.stream()
                .mapToInt(Integer::valueOf)//convertimos cada elemento a tipo int
                .min()
                .ifPresentOrElse(value -> System.out.println("valor minimo = " + value),
                        () -> System.out.println("No hay Valor minimo, lista vacia."));

        listaNumeros.stream()
                .min(Comparator.naturalOrder())
                .ifPresentOrElse(valorMinimo -> System.out.println("valorMinimo = " + valorMinimo),
                        () -> System.out.println("Lista vacia.."));

        OptionalInt maximo = listaNumeros.stream()
                .mapToInt(Integer::intValue)
                .max();

        OptionalDouble promedio = listaNumeros.stream()
                .mapToInt(Integer::intValue)
                .average();

        long numeroElementos = listaNumeros.stream()
                .mapToInt(Integer::intValue)
                .count();

        System.out.println("Total de Numeros pares de la lista: " + numerosPares);
        System.out.println("suma = " + suma);
        //System.out.println("minimo = " + minimo);
        System.out.println("maximo = " + maximo);
        System.out.println("promedio = " + promedio);
        System.out.println("numeroElementos = " + numeroElementos);
    }
}

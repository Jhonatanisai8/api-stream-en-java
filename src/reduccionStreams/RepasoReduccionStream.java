package reduccionStreams;

import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class RepasoReduccionStream {
    public static void main(String[] args) {
        System.out.println("\tMETODOS DE REDUCCION DEL API STREAM");
        List<Integer> listaNumeros = List.of(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
        System.out.println("listaNumeros = " + listaNumeros);
        OptionalInt valorMinimo = listaNumeros.stream().mapToInt(Integer::intValue).min();
        OptionalInt valorMaxmo = listaNumeros.stream().mapToInt(Integer::intValue).max();
        OptionalDouble promedioGeneral = listaNumeros.stream().mapToInt(Integer::intValue).average();
        int sumaGeneral = listaNumeros.stream().mapToInt(Integer::intValue).sum();
        long numeroElementos = listaNumeros.stream().count();

        System.out.println("valorMinimo = " + valorMinimo);
        System.out.println("valorMaxmo = " + sumaGeneral);
        System.out.println("promedioGeneral = " + promedioGeneral);
        System.out.println("sumaGeneral = " + sumaGeneral);
        System.out.println("numeroElementos = " + numeroElementos);
    }
}

package Ejercicios;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio11AgruparPalabrasLongitud {
    public static void main(String[] args) {
        new Ejercicio11AgruparPalabrasLongitud();
    }

    public Ejercicio11AgruparPalabrasLongitud() {
        List<String> palabras = Arrays.asList("uno", "dos", "tres", "cuatro");

        Map<Integer, List<String>> lista = palabras
                .stream()
                .collect(Collectors
                        .groupingBy(s -> s.length()));

        System.out.println(lista);
    }
}

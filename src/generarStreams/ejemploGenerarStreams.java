package generarStreams;

import java.util.*;
import java.util.stream.Stream;

public class ejemploGenerarStreams {
    public static void main(String[] args) {
        System.out.println("CREACION DE STREAMS");
        //forma 01
        List<String> lista = new ArrayList<>(Arrays.asList("Hola", "Que tal"));
        Stream<String> stream = lista.stream();
        //forma 02
        Map<Integer, String> mapa = new HashMap<>();
        Stream<Map.Entry<Integer, String>> stream1 = mapa.entrySet().stream();
        //forma 03
        String[] estudiantes = {"juan", "Pedro"};
        Stream<String> stream2 = Arrays.stream(estudiantes);

    }
}

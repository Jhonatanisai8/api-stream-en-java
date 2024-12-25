package OrdenacionStreams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class OrdenacionStreamsParte02 {
    public static void main(String[] args) {
        System.out.println("ORDENACIÓN DE STREAMS");
        List<String> listaNombres = List.of("Baldomero", "German Gines", "Ambrosio");
        listaNombres.stream().parallel()
                .limit(2)
                .forEach(System.out::println);

        System.out.println("Ordenacion con el metodo sorted");
        List<String> listaAnimales = List.of("conejo", "vaca", "perro", "lagarto", "abeja");
        listaAnimales.stream()
                //  .sorted((o1, o2) -> o2.compareTo(o1)) // dependiendo de los argumentos se puede ordenar ya en forma ASC Y DESC
                .sorted(Comparator.reverseOrder()) // dependiendo de los argumentos se puede ordenar ya en forma ASC Y DESC
                //.limit(3)
                .forEach(System.out::println);
    }
}

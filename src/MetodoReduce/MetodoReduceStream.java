package MetodoReduce;

import java.util.List;
import java.util.Optional;

public class MetodoReduceStream {

    public static void main(String[] args) {
        List<Integer> lista = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("lista = " + lista);
        Optional<Integer> resultado = lista.stream().reduce(Integer::sum);
        resultado.ifPresentOrElse(
                valor -> System.out.println("valor = " + valor),
                () -> System.out.println("Stream Vacio"));
        //System.out.println("resultado = " + resultado);

        //uso con identidad
        Integer resul = lista.stream().reduce(2, (integer, integer2) -> integer * integer2);
        System.out.println("resul = " + resul);
    }
}

package reduccionStreams;

import java.util.List;

public class ReduccionStreamEjemplo {
    public static void main(String[] args) {
        List<Integer> listaNumeros = List.of(1, 5, 3, 7, 9, 70, 23, 2);
        System.out.println("listaNumeros = " + listaNumeros);
        //uso del metodo count el cual retorna un long
        long numerosPares;
        numerosPares = listaNumeros.stream()
                .filter(integer -> integer % 2 == 0)
                .count();
        System.out.println("Total de Numeros pares de la lista: " + numerosPares);
    }
}

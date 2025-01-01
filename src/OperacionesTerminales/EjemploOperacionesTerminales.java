package OperacionesTerminales;

import java.util.List;
import java.util.Optional;

public class EjemploOperacionesTerminales {
    public static void main(String[] args) {
        new EjemploOperacionesTerminales();
    }

    public EjemploOperacionesTerminales() {
        List<Integer> listaNumeros = List.of(18, 4, 12, 2, 6, 4, 8);
        boolean sonPares = listaNumeros.stream()
                .allMatch(integer -> integer % 2 == 0);
        System.out.println("sonPares = " + sonPares); // retorna si todos los elementos de la lista son pares

        int valorBuscado = 17;
        boolean existeValor = listaNumeros.stream().allMatch(integer -> listaNumeros.contains(valorBuscado));
        System.out.println("existeValor = " + existeValor); // muestra si el valor esta en la lista


        Optional<Integer> valorBuscado01 = listaNumeros.stream().filter(integer -> integer % 3 == 0)
                .findFirst();

        Optional<Integer> valorPrimero = listaNumeros.stream().filter(integer -> integer % 3 == 0)
                .findAny();
        System.out.println("valorPrimero = " + valorPrimero);
        System.out.println("valorBuscado = " + valorBuscado01);

    }
}

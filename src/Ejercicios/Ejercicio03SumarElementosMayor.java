package Ejercicios;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

/*
Sumar elementos mayores que un valor: A partir de una lista de números,
encuentra la suma de todos los números mayores que 10.
 */
public class Ejercicio03SumarElementosMayor {
    public static void main(String[] args) {
        new Ejercicio03SumarElementosMayor();
    }

    public Ejercicio03SumarElementosMayor() {
        Random random = new Random();
        List<Integer> listaNumeros = random
                .ints(5, 5,20 )
                .boxed()
                .collect(Collectors.toList());

        System.out.println("=LISTA DE NUMEROS ORGINAL=");
        System.out.println(listaNumeros);

        Optional<Integer> suma = listaNumeros
                .stream()
                .filter(integer -> integer >= 10)
                .reduce(Integer::sum);
        System.out.println("suma = " + suma);

    }
}

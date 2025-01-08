package Ejercicios;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/*
Filtrado de números pares: Dado un listado de números enteros,
Guardar en  una lista  solo los números pares.
 */
public class Ejercicio01FiltrarPares {
    Random random = new Random();

    public static void main(String[] args) {
        new Ejercicio01FiltrarPares();
    }

    public Ejercicio01FiltrarPares() {

        //generamos una lista con numeros aleatorios
        List<Integer> listaEnteros = random
                .ints(10, 1, 10)
                .boxed()
                .collect(Collectors.toList());
        System.out.println("=LISTA ORIGINAL=");
        System.out.println(listaEnteros);

        //filtramos los pares y los guardamos en una lista
        List<Integer> listaPares = listaEnteros
                .stream()
                .filter(integer -> integer % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("=LISTA DE PARES=");
        System.out.println(listaPares);
    }

}

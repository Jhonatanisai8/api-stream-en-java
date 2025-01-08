package Ejercicios;

import java.util.List;

/*
Contar elementos que cumplen una condición:
A partir de una lista de cadenas, cuenta cuántas tienen más de 5 caracteres.
 */
public class Ejercicio06ContarCondicion {
    public static void main(String[] args) {
        new Ejercicio06ContarCondicion();
    }

    public Ejercicio06ContarCondicion() {
        List<String> listaCadenas = List.of("Hola", "que tal", "como", "cuattro", "cinco", "holaa");
        System.out.println("=LISTA=");
        System.out.println(listaCadenas);

        long cadena5Caracteres = listaCadenas
                .stream()
                .filter(s -> s.length() >= 5)
                .mapToInt(String::length)
                .count();
        System.out.println("cadena5Caracteres = " + cadena5Caracteres);
    }
}

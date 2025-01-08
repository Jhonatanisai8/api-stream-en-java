package Ejercicios;

import java.util.List;

/*
Concatenar cadenas:
Dada una lista de palabras, utiliza Stream para concatenarlas todas en una sola cadena, separándolas por comas.
 */
public class Ejercicio07ConcatenarCadenas {
    public static void main(String[] args) {
        new Ejercicio07ConcatenarCadenas();
    }

    public Ejercicio07ConcatenarCadenas() {
        List<String> listaCadena = List.of("Hola", "como", "estas");
        System.out.println("=Lista cadena=");
        System.out.println(listaCadena);

        String cadenaGenerada = listaCadena
                .stream()
                .reduce((s, s2) -> s.concat(",").concat(s2))
                .orElse("");
        System.out.println(cadenaGenerada);
    }
}

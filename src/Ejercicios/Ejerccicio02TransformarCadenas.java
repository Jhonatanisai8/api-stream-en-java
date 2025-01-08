package Ejercicios;

import java.util.List;
import java.util.stream.Collectors;

/*
Transformar cadenas a mayúsculas: Dada una lista de cadenas,
usa Stream para convertir todas las cadenas a mayúsculas
y devuélvelas como una nueva lista.
 */
public class Ejerccicio02TransformarCadenas {
    public static void main(String[] args) {
        new Ejerccicio02TransformarCadenas();
    }

    public Ejerccicio02TransformarCadenas() {
        List<String> listaCadenas = List.of("hola", "mundo", "como estas");
        System.out.println("=LISTA ORIGINAL=");

        List<String> listaMayusculas = listaCadenas
                .stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());
        System.out.println("=LISTA DE MAYUSCULAS=");
        System.out.println(listaMayusculas);
    }
}

package Ejercicios;

import java.util.List;
import java.util.Optional;

/*
Buscar el primer elemento: De una lista de cadenas,
encuentra la primera que empiece con la letra "A", utilizando Stream.
 */
public class Ejercicio04BuscandoPrimerElemento {
    public static void main(String[] args) {
        new Ejercicio04BuscandoPrimerElemento();
    }

    public Ejercicio04BuscandoPrimerElemento() {
        List<String> listaCadenas = List.of("hola", "mundo", "como estas", "ALIas", "julia", "ala");

        System.out.println("LISTA ORIGINAL");
        System.out.println(listaCadenas);
        Optional<String> cadenaConA = listaCadenas
                .stream()
                .filter(s -> String.valueOf(s.charAt(0)).equals("A"))
                .findAny();
        System.out.println("cadenaConA = " + cadenaConA);

    }
}

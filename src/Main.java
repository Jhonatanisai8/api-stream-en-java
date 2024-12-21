import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>(List.of("Java", "Python", "C#", "Kotlin", "JavaScript"));
        //1. creacion del stream
        nombres.stream()
                //2. Operacion intermedia
                .filter(s -> s.contains("J"))
                //3. Operacion terminal
                .forEach(System.out::println);
        ejemplo01();
        ejemplo02UsoDelLimit();
    }

    public static void ejemplo01() {
        System.out.println("Ejemplo 01 del uso de Streams");
        List<String> nombres = new ArrayList<>(List.of("Java", "Python", "C#", "Kotlin", "JavaScript"));
        //en este caso vamos a obtener una lista de resultados
        List<String> resultado = nombres.stream()
                .filter(s -> s.contains("J")) // filtrará los elementos que contengan la J
                .toList(); // lo convierte a una lista
        //mostramos
        resultado.forEach(System.out::println);
        System.out.println();
    }

    public static void ejemplo02UsoDelLimit() {
        System.out.println("Ejemplo 01 del uso de Limit");
        List<String> nombres = new ArrayList<>(List.of("Java", "Python", "C#", "Kotlin", "JavaScript"));
        //en este caso vamos a obtener una lista de resultados
        List<String> resultado = nombres.stream()
                .limit(1)
                .toList(); // lo convierte a una lista
        //mostramos
        resultado.forEach(System.out::println);
        System.out.println();
    }
}
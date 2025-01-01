package EjemploProyecto;

import java.util.Comparator;
import java.util.Random;

public class EjemploStream {
    Random random = new Random();

    public static void main(String[] args) {
        new EjemploStream();
    }

    public EjemploStream() {
        int sum = random.ints(10, 1, 11)
                .boxed()
                .filter(integer -> integer % 2 == 0) // filtra los numeros pares
                .sorted(Comparator.naturalOrder()) // ordena de mayor a menor
                .map(integer -> integer * integer) // eleva al cuadrado
                .peek(System.out::println) //muestra por pantalla
                .mapToInt(Integer::intValue) // convierte a entero
                .sum(); //halla la suma

        System.out.println("sum = " + sum);
        System.out.println("_________________________________________________________");
        int suma02 = random.ints(10, 1, 11)
                .boxed()
                .filter(integer -> integer % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .map(integer -> integer * integer)
                .peek(System.out::println)
                .mapToInt(Integer::intValue)
                .reduce(0, Integer::sum);

        System.out.println("suma02 = " + suma02);
    }
}

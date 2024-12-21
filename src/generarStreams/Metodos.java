package generarStreams;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Metodos {
    Random random = new Random();

    public static void main(String[] args) {
        new Metodos();
    }

    public Metodos() {
        System.out.println("\tLISTA 01 GENERADA");
        List<Integer> lista = Stream.generate(() -> {
                    int numeroGenerado = generarNumero(); //llamamos a la funcion generadora
                    System.out.printf("Se ah guardado el %d\n", numeroGenerado);
                    return numeroGenerado;
                }).limit(10)
                .collect(Collectors.toList());
        System.out.println("lista = " + lista);

        System.out.println();
        System.out.println("\tLISTA 02 GENERADA");
        List<Integer> lista02 = Stream.iterate(1, integer -> integer * 3) // recibe un valor inicial  y un valor unario
                .limit(5)
                .collect(Collectors.toList());
        System.out.println("lista02 = " + lista02);

        System.out.println();
        System.out.println("\tLISTA 03 GENERADA");
        List<Integer> lista03 = Stream.iterate(1, integer -> integer <= 100, integer -> integer * 2) // recibe un valor inicial , una condicion y un valor unario
                .collect(Collectors.toList());
        System.out.println("lista03 = " + lista03);

        System.out.println();
        System.out.println("\tLISTA 04 GENERADA");
        List<Integer> lista04 = random.ints(5, 0, 10) // numero de elementos, 1 => valor incial y 10 => valor final
                .boxed() // convierte a una streams de integer
                .collect(Collectors.toList()); //recolectamos
        System.out.println("lista04 = " + lista04);

        System.out.println();
        System.out.println("\tLISTA 05 GENERADA");
        List<Integer> lista05 = IntStream.range(1,10) // valores del 1 al 9
                .boxed() // convierte a una streams de integer
                .collect(Collectors.toList()); //recolectamos
        System.out.println("lista05 = " + lista05);
    }

    public int generarNumero() {
        return random.nextInt(10);
    }
}

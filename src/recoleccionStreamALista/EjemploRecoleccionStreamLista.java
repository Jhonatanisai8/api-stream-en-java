package recoleccionStreamALista;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EjemploRecoleccionStreamLista {
    public static void main(String[] args) {
        new EjemploRecoleccionStreamLista();
    }

    public EjemploRecoleccionStreamLista() {
        //reduccion mutable 
        List<Book> myBooks = Arrays.asList(
                new Book("345-89", "Sufriendo por Pedro", 2018, Genre.TERROR),
                new Book("923-45", "Los papeles por delante", 1998, Genre.THRILLER),
                new Book("978-25", "La vida de Baldomero", 2017, Genre.COMEDY),
                new Book("923-45", "Los papeles por delante.", 1998, Genre.THRILLER),
                new Book("978-25", "La vida del Baldomero.", 2017, Genre.COMEDY)
        );
        System.out.println("myBooks = " + myBooks);

        System.out.println("=============================0");
        System.out.println("LISTA DE LIBROS CON AÑO DE PUBLICACION MENOR A 2000");
        List<Book> listaLibrosAnioMayorA2000 = myBooks
                .stream()
                .filter(book -> book.getYearOfPublication() < 2000) //recolectamos solo los libros que tenga de año menor a 200
                .collect(Collectors.toList());

        List<Book> listaLibrosAnioMayorA2000B = myBooks
                .stream()
                .filter(book -> book.getYearOfPublication() < 2000) //recolectamos solo los libros que tenga de año menor a 200 pero no se puede modificar
                .collect(Collectors.toUnmodifiableList());

        try {
            listaLibrosAnioMayorA2000B.add(new Book("a", "s", 12, Genre.COMEDY));
        } catch (UnsupportedOperationException e) {
            System.out.println("NO SE PUEDE AÑADIR OTORO LIBRO A LISTA POR QUE NO SE PUEDE MODIFICAR: " + e.getMessage());
        }
        System.out.println("listaLibrosAnioMayorA2000");
        listaLibrosAnioMayorA2000.forEach(System.out::println);
        listaLibrosAnioMayorA2000B.forEach(System.out::println);


    }
}

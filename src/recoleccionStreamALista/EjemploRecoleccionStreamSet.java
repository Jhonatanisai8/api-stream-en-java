package recoleccionStreamALista;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class EjemploRecoleccionStreamSet {
    public static void main(String[] args) {
        new EjemploRecoleccionStreamSet();
    }

    public EjemploRecoleccionStreamSet() {
        //reduccion mutable 
        List<Book> myBooks = Arrays.asList(
                new Book("345-89", "Sufriendo por Pedro", 2018, Genre.TERROR),
                new Book("923-45", "Los papeles por delante", 1998, Genre.THRILLER),
                new Book("978-25", "La vida de Baldomero", 2017, Genre.COMEDY),
                new Book("923-45", "Los papeles por delante", 1998, Genre.THRILLER),
                new Book("978-25", "La vida del Baldomero.", 2017, Genre.COMEDY)
        );
        System.out.println("myBooks = " + myBooks);

        System.out.println("=============================0");
        System.out.println("LISTA DE LIBROS CON AÑO DE PUBLICACION MENOR A 2000");
        Set<Book> conjuntoLibros = myBooks
                .stream()
                .filter(book -> book.getYearOfPublication() < 2000) //recolectamos solo los libros que tenga de año menor a 200
                .collect(Collectors.toSet()); //los guardamos en un conjunto
        conjuntoLibros.add(new Book("Hola", "Hola", 1221, Genre.COMEDY));

        Set<Book> conjuntoLibrosNoModificable = myBooks
                .stream()
                .filter(book -> book.getYearOfPublication() < 2000) //recolectamos solo los libros que tenga de año menor a 200
                .collect(Collectors.toUnmodifiableSet()); //los guardamos en un conjunto que no se puede modificar
        try {
            conjuntoLibrosNoModificable.add(new Book("Hola", "Hola", 1221, Genre.COMEDY));
        } catch (UnsupportedOperationException e) {
            System.out.println("No se puede modificar el conjunto: " + e.getMessage());
        }
        System.out.println("==============================");
        System.out.println("MI CONJUNTO DE LIBROS");
        conjuntoLibros.forEach(System.out::println);


    }
}

package recoleccionStreamALista;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EjemploRecoleccionStreamMap {
    public static void main(String[] args) {
        new EjemploRecoleccionStreamMap();
    }

    public EjemploRecoleccionStreamMap() {
        //reduccion mutable 
        List<Book> myBooks = Arrays.asList(
                new Book("345-89", "Sufriendo por Pedro", 2018, Genre.TERROR),
                new Book("923-45", "Los papeles por delante", 1998, Genre.THRILLER),
                new Book("978-25", "La vida de Baldomero", 2017, Genre.COMEDY),
                new Book("923-45", "Los papeles por delante", 1998, Genre.THRILLER),
                new Book("978-25", "La vida de Baldomero", 2017, Genre.COMEDY)
        );
        System.out.println("myBooks = " + myBooks);

        System.out.println("=============================0");
        System.out.println("LISTA DE LIBROS CON AÑO DE PUBLICACION MENOR A 2000");
        Map<String, Book> mapLibros = myBooks
                .stream()
                .distinct()
                .collect(Collectors
                        .toMap(Book::getIsbn //clave
                                //, book -> book //valor
                                , Function.identity()
                        ));

        System.out.println(mapLibros);
    }
}

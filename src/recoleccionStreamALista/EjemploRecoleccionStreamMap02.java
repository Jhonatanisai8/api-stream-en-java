package recoleccionStreamALista;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EjemploRecoleccionStreamMap02 {
    public static void main(String[] args) {
        new EjemploRecoleccionStreamMap02();
    }

    public EjemploRecoleccionStreamMap02() {
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
        Map<String, Book> mapLibros;
        mapLibros = myBooks
                .stream()
                .filter(book -> book.getYearOfPublication() < 2000)
                .collect(Collectors
                        .toMap(Book::getIsbn //clave
                                //, book -> book //valor
                                , Function.identity()
                                , (book, book2) -> //hace una combinacion entre los dos libros
                                        new Book(book.getIsbn(), book2.getTittle() + "(+)", book.getYearOfPublication(), book.getGenre())
                                , TreeMap::new //pasamos el tipo de structura de dato
                        ));

        System.out.println("===================");
        System.out.println(mapLibros);
    }
}

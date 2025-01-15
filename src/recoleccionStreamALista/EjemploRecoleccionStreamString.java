package recoleccionStreamALista;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class EjemploRecoleccionStreamString {
    Random random = new Random();

    public static void main(String[] args) {
        new EjemploRecoleccionStreamString();
    }

    public EjemploRecoleccionStreamString() {
        //reduccion mutable 
        List<Book> myBooks = Arrays.asList(
                new Book("345-89", "Sufriendo por Pedro", 2018, Genre.TERROR),
                new Book("923-45", "Los papeles por delante", 1998, Genre.THRILLER),
                new Book("978-25", "La vida de Baldomero", 2017, Genre.COMEDY),
                new Book("923-45", "Los papeles por delante.", 1998, Genre.THRILLER),
                new Book("978-25", "La vida del Baldomero.", 2017, Genre.COMEDY)
        );
        System.out.println("LISTA DE LIBROS");
        System.out.println(myBooks);

        String cadena = myBooks
                .stream()
                .filter(book -> book.getYearOfPublication() < 2000)
                .map(Book::getTittle)
                .collect(Collectors.joining(", "));

        System.out.println("cadena = " + cadena);
    }
}

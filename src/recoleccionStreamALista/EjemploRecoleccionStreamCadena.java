package recoleccionStreamALista;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EjemploRecoleccionStreamCadena {
    public static void main(String[] args) {
        new EjemploRecoleccionStreamCadena();
    }

    public EjemploRecoleccionStreamCadena() {
        //reduccion mutable 
        List<Book> myBooks = Arrays.asList(
                new Book("345-89", "Sufriendo por Pedro", 2018, Genre.TERROR),
                new Book("923-45", "Los papeles por delante", 1998, Genre.THRILLER),
                new Book("978-25", "La vida del Baldomero", 2017, Genre.COMEDY),
                new Book("923-45", "Los papeles por delante", 1998, Genre.THRILLER),
                new Book("978-25", "La vida del Baldomero", 2017, Genre.COMEDY)
        );
        System.out.println("myBooks = " + myBooks);

        System.out.println("=============================");

        String cadena = myBooks
                .stream()
                //.map(book -> book.getTittle())
                .map(Book::getTittle)
                .collect(Collectors.joining(", ")); //separamos los titulos por una coma

        String cadena02 = myBooks
                .stream()
                //.map(book -> book.getTittle())
                .map(Book::getTittle)
                .collect(Collectors.joining(", ", "(", ")")); //separamos los titulos por una coma


        String collect = myBooks
                .stream()
                .filter(book -> book.getYearOfPublication() < 1999)
                .map(Book::getTittle)
                .collect(Collectors.joining(", "));

        System.out.println(cadena);
        System.out.println(cadena02);
        System.out.println(collect);
    }


}

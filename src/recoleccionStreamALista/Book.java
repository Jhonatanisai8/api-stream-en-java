package recoleccionStreamALista;

import java.util.Objects;

public class Book {
    private final String isbn;
    private final String tittle;
    private final int yearOfPublication;
    private final Genre genre;

    @Override
    public String toString() {
        return "\nBook{" +
                "\nisbn='" + isbn + '\'' +
                "\n, tittle='" + tittle + '\'' +
                "\n, yearOfPublication=" + yearOfPublication +
                "\n, genre=" + genre +
                '}';
    }

    public Book(String isbn, String tittle, int yearOfPublication, Genre genre) {
        Objects.requireNonNull(isbn);
        Objects.requireNonNull(tittle);
        Objects.requireNonNull(yearOfPublication);
        Objects.requireNonNull(genre);

        this.isbn = isbn;
        this.tittle = tittle;
        this.yearOfPublication = yearOfPublication;
        this.genre = genre;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTittle() {
        return tittle;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public Genre getGenre() {
        return genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication && Objects.equals(isbn, book.isbn) && Objects.equals(tittle, book.tittle) && genre == book.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, tittle, yearOfPublication, genre);
    }
}

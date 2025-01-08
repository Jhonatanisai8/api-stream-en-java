package recoleccionStreamALista;

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
}

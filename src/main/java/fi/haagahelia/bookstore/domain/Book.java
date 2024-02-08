package fi.haagahelia.bookstore.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String author;

    private int publicationYear;
    private long isbn;


    public Book() {}
    public Book(String title, String author, int year, long isbn) {
        super();
        this.id = id;
        this.title = title;
        this.author = author;
        this.publicationYear = year;
        this.isbn = isbn;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return publicationYear;
    }

    public long getIsbn() {
        return isbn;
    }



    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.publicationYear = year;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }



    @Override
    public String toString() {
        return "Book [id=" + id + ", title=" + title + ", author=" + author + ", year=" + publicationYear + ", isbn" + isbn + "]";
    }
}

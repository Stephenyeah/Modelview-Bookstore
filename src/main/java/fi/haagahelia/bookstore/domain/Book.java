package fi.haagahelia.bookstore.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    private String title;
    private String author;
    private int year;
    private long isbn;
    private double price;

    public Book() {
        super();
    }
    public Book(long id,String title, String author, int year, long isbn, double price) {

        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.isbn = isbn;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public long getIsbn() {
        return isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", year=" + year + ", Isbn" + isbn + ",price=" + price
                + "]";
    }
}

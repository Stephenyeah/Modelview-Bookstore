package fi.haagahelia.bookstore.domain;

public class Book {

    private String title;
    private String author;
    private int year;
    private long isbn;
    private double price;

    public Book(){
        super();
    }


    public Book(String title, long isbn, int price) {
        this.title = title;
        this.isbn = isbn;
        this.price = price;
    }


    public Book(String title,String author){
        super();
        this.title = title;
        this.author =author;
    }


    public Book(String title, String author, int year, long isbn, double price) {
        super();
        this.title = title;
        this.author = author;
        this.year = year;
        this.isbn = isbn;
        this.price = price;
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
        return "Book [title="+title+", author="+author+", year="+year+", Isbn"+isbn+",price="+price+"]";
    }
}

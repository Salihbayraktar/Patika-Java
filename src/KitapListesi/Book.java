package KitapListesi;

import java.time.LocalDate;

public class Book {
    private String name;
    private int numberOfPage;
    private String author;
    private LocalDate publicationDate;

    public Book(String name, int numberOfPage, String author, LocalDate publicationDate) {
        this.name = name;
        this.numberOfPage = numberOfPage;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }
}

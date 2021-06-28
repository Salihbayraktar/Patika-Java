package KitapListesi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
    private static final ArrayList<Book> books = new ArrayList<>();

    static {
        books.add(new Book("Gen Bencildir", 544, "Richard Dawkins", LocalDate.of(1976, 1, 1)));
        books.add(new Book("Siyah Inci", 248, "Anna Sewell", LocalDate.of(1877, 11, 24)));
        books.add(new Book("Cesur Yeni Dünya", 272, "Aldous Huxley", LocalDate.of(1932, 1, 1)));
        books.add(new Book("Tüfek, Mikrop ve Çelik", 664, "Jared Diamond", LocalDate.of(1997, 1, 1)));
        books.add(new Book("Beyaz Zambaklar Ülkesinde", 100, "Grigory Petrov", LocalDate.of(1923, 1, 1)));
        books.add(new Book("Bir Ömür Nasıl Yaşanır?", 288, "Ilber Ortayli", LocalDate.of(2019, 1, 1)));
        books.add(new Book("Karamazov Kardeşler", 1008, "Fyodor Mihailoviç Dostoyevski", LocalDate.of(1880, 1, 1)));
        books.add(new Book("Dönüşüm", 74, "Frans Kafka", LocalDate.of(1915, 1, 1)));
        books.add(new Book("Fareler ve İnsanlar", 111, "John Steinbeck", LocalDate.of(1937, 1, 1)));
        books.add(new Book("Fahrenheit 451", 208, "Ray Bradbury", LocalDate.of(1953, 10, 19)));
    }

    public static void main(String[] args) {


        books.stream().collect(Collectors.toMap(Book::getName, Book::getAuthor)).forEach((key, value) -> System.out.printf("Book Name : %-40s -> Author : %s \n", key, value));

        ArrayList<Book> over100PagesBooks = (ArrayList<Book>) books.stream().filter(i -> i.getNumberOfPage() > 100).collect(Collectors.toList());

        over100PagesBooks.forEach(i -> System.out.println(i.getNumberOfPage()));

    }

}

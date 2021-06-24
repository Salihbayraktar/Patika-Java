package CollectionVeMapInterface.KitapSiralayici;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Set<Book> booksSortedByName = new TreeSet<>(new BookComparatorByName());

        booksSortedByName.add(new Book("Korluk",336,"Jose Saramago",1995));
        booksSortedByName.add(new Book("Fareler ve Insanlar",111, "John Steinbeck", 1937));
        booksSortedByName.add(new Book("Hayvan Ciftligi",152,"George Orwell ", 1945));
        booksSortedByName.add(new Book("Fahrenheit 451",208,"Ray Bradbury",1951));
        booksSortedByName.add(new Book("Tufek, Mikrop ve Celik",664,"Jared Diamond",1997));

        for(Book book : booksSortedByName){
            System.out.println(book);
        }

        System.out.println("--------------------------------------------------");



        Set<Book> booksSortedByNumber = new TreeSet<>(new BookComparatorByNumberOfPages());

        booksSortedByNumber.add(new Book("Korluk",336,"Jose Saramago",1995));
        booksSortedByNumber.add(new Book("Fareler ve Insanlar",111, "John Steinbeck", 1937));
        booksSortedByNumber.add(new Book("Hayvan Ciftligi",152,"George Orwell ", 1945));
        booksSortedByNumber.add(new Book("Fahrenheit 451",208,"Ray Bradbury",1951));
        booksSortedByNumber.add(new Book("Tufek, Mikrop ve Celik",664,"Jared Diamond",1997));

        for(Book book : booksSortedByNumber){
            System.out.println(book);
        }



        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        System.out.println("IKINCI COZUM YONTEMI");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");

        Set<Book> books = new LinkedHashSet<>();

        books.add(new Book("Korluk",336,"Jose Saramago",1995));
        books.add(new Book("Fareler ve Insanlar",111, "John Steinbeck", 1937));
        books.add(new Book("Hayvan Ciftligi",152,"George Orwell ", 1945));
        books.add(new Book("Fahrenheit 451",208,"Ray Bradbury",1951));
        books.add(new Book("Tufek, Mikrop ve Celik",664,"Jared Diamond",1997));

        books.stream().sorted(new BookComparatorByName()).forEach(System.out::println);
        System.out.println("---------------------------------------------------------------------------------------------");
        books.stream().sorted(new BookComparatorByNumberOfPages()).forEach(System.out::println);
    }
}

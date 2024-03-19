package BookSorter;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Book implements Comparable<Book>{
    String bookName, authorName, publicationDate;
    int numberOfPage;

    public Book(String bookName, String authorName, String publicationDate, int numberOfPage) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.publicationDate = publicationDate;
        this.numberOfPage = numberOfPage;
    }

    @Override
    public int compareTo(Book o) {
        return this.bookName.compareTo(o.bookName);
    }

    @Override
    public String toString() {
        return "Book Name: " + bookName + ", Author: " + authorName + ", Publication Date: " + publicationDate + ", Pages: " + numberOfPage;
    }

    public static void main(String[] args) {
        Book book1 = new Book("Kırlangıç Çığlığı", "Ahmet Ümit", "2001-03-10", 350);
        Book book2 = new Book("Ince Memed 1", "Yaşar Kemal", "1955-09-01", 400);
        Book book3 = new Book("Şeker Portakalı", "José Mauro de Vasconcelos", "1968-05-05", 250);
        Book book4 = new Book("Huzursuzluk", "Zülfü Livaneli", "2009-11-20", 320);
        Book book5 = new Book("Martin Eden", "Jack London", "1909-09-01", 500);

        Set<Book> bookSortByName = new TreeSet<>();
        bookSortByName.add(book1);
        bookSortByName.add(book2);
        bookSortByName.add(book3);
        bookSortByName.add(book4);
        bookSortByName.add(book5);

        // Sort and Print books by name
        System.out.println("Books sorted by name:");
        for (Book books : bookSortByName){
            System.out.println(books);
        }

        // Sort books by page count
        Set<Book> bookSortByPageCount = new TreeSet<>(Comparator.comparingInt(book -> book.numberOfPage));
        bookSortByPageCount.addAll(bookSortByName);

        // Print book by page count
        System.out.println("\nBooks sorted by page count:");
        for (Book books : bookSortByPageCount){
            System.out.println(books);
        }
    }
}
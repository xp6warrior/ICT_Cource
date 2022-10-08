package Week6;

import java.util.ArrayList;

public class Exersize101 {
    public static class Book {
        private final String title;
        private final String publisher;
        private final int year;

        public Book(String title, String publisher, int year) {
            this.title = title;
            this.publisher = publisher;
            this.year = year;
        }

        public String title() {
            return title;
        }

        public String publisher() {
            return publisher;
        }

        public int year() {
            return year;
        }

        @Override
        public String toString() {
            return title + ", " + publisher + ", " + year;
        }
    }

    public static class Library {
        private final ArrayList<Book> books = new ArrayList<>();

        public void addBook(Book book) {
            books.add(book);
        }

        public void printBooks() {
            for (Book b: books) {
                System.out.println(b);
            }
        }

        public ArrayList<Book> searchByTitle(String title) {
            ArrayList<Book> found = new ArrayList<Book>();
            String searchTerm = title.toLowerCase().trim();

            for (Book b: books) {
                String p = b.title.toLowerCase();
                if (p.contains(searchTerm)) {
                    found.add(b);
                }
            }

            return found;
        }
        public ArrayList<Book> searchByPublisher(String publisher) {
            ArrayList<Book> found = new ArrayList<Book>();
            String searchTerm = publisher.toLowerCase().trim();

            for (Book b: books) {
                String p = b.publisher.toLowerCase();
                if (p.contains(searchTerm)) {
                    found.add(b);
                }
            }

            return found;
        }
        public ArrayList<Book> searchByYear(int year) {
            ArrayList<Book> found = new ArrayList<Book>();

            for (Book b: books) {
                if (b.year == year) {
                    found.add(b);
                }
            }

            return found;
        }
    }

    public static void main(String[] args) {
        Library Library = new Library();

        Library.addBook(new Book("Cheese Problems Solved", "Woodhead Publishing", 2007));
        Library.addBook(new Book("The Stinky Cheese Man and Other Fairly Stupid Tales", "Penguin Group", 1992));
        Library.addBook(new Book("NHL Hockey", "Stanley Kupp", 1952));
        Library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));

        for (Book book: Library.searchByTitle("CHEESE")) {
            System.out.println(book);
        }

        System.out.println("---");
        for (Book book: Library.searchByPublisher("PENGUIN  ")) {
            System.out.println(book);
        }
    }
}

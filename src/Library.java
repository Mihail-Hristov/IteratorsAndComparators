import java.util.Iterator;

public class Library implements Iterable<Book> {
    private Book[] books;

    public Library(Book... books) {
        this.books = books;
    }

    public Iterator<Book> iterator() {
        return new LibIterator();
    }

    private final class LibIterator implements Iterator<Book> {
        private int count;

        public LibIterator() {
            this.count = 0;
        }

        @Override
        public boolean hasNext() {
            if (this.count < books.length){
                return true;
            }else {
                return false;
            }
        }

        @Override
        public Book next() {
            return books[count++];
        }
    }
}

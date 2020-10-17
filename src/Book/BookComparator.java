package Book;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {

    @Override
    public int compare(Book bookOne, Book bookTwo) {
        if (bookOne.compareTo(bookTwo) == 0) {
            if (bookOne.compareTo(bookTwo) > 0) {
                return 1;
            }else if (bookOne.compareTo(bookTwo) < 0) {
                return -1;
            }
            return 0;
        }else {
            return bookOne.compareTo(bookTwo);
        }


    }
}

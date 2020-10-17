package ListIterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListIterator implements Iterable<String> {
    private List<String> list;
    private int index;

    public ListIterator(String... elements) {
        List<String> list = Arrays.asList(elements);
        this.list = list;
        this.index = 0;
    }

    public boolean move() {
        if (index + 1 < list.size()) {
            this.index++;
            return true;
        } else {
            return false;
        }
    }

    public String print() {
        if (validIndex()) {
            String currentElement = this.list.get(index);
            return currentElement;
        } else {
            return "Invalid Operation!";
        }
    }

    public boolean hasNext() {
        if (this.index < list.size() - 1) {
            return true;
        } else {
            return false;
        }
    }

    private boolean validIndex() {
        if (this.index >= 0 && this.index < this.list.size()) {
            return true;
        } else {
            return false;
        }
    }

    public Iterator<String> iterator() {
        return new Iter();
    }

    private final class Iter implements Iterator<String> {
        int count;

        public Iter() {
            this.count = 0;
        }

        @Override
        public boolean hasNext() {
            if (this.count < list.size()) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public String next() {
            return list.get(count++);
        }
    }
}

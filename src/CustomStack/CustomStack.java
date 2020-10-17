package CustomStack;

import java.util.Iterator;

public class CustomStack implements Iterable<String> {

    private Node head;
    private int size;

    @Override
    public Iterator<String> iterator() {
        return new iter();
    }

    private final class iter implements Iterator<String> {
        Node iHead;
        int iSize;

        public iter() {
            iHead = head;
            iSize = size;
        }

            @Override
            public boolean hasNext() {
                if (iSize > 0) {
                    return true;
                }
                return false;
            }

            @Override
            public String next() {
            String forReturn = iHead.element;
            iHead = iHead.prev;
            iSize --;

                return forReturn;
            }
        };

    private static class Node {
        private String element;
        private Node prev;

        public Node (String element) {
            this.element = element;
        }
    }

    public void push(String element) {
        Node newElement = new Node(element);
        if (this.size == 0) {
            newElement.prev = null;
            this.head = newElement;
        }else {
            newElement.prev = this.head;
            this.head = newElement;
        }
        size ++;
    }

    public void pop() {
        if (size > 0) {
            this.head = this.head.prev;

            this.size--;
        }else {
            System.out.println("No elements");
        }
    }



}

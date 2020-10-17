package CustomStack;

import java.util.Iterator;

public class CustomStack implements Iterable<CustomStack> {

    private Node head;
    private int size;

    @Override
    public Iterator<CustomStack> iterator() {
        return new Iterator<CustomStack>() {

            @Override
            public boolean hasNext() {
                if (size > 0) {
                    return true;
                }
                return false;
            }

            @Override
            public CustomStack next() {
                return null;
            }
        };
    }


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

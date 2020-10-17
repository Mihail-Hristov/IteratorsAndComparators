package Lake;

import java.util.*;

public class Lake implements Iterable<Integer> {

    private int[] stones;

    public Lake(int[] stones) {
        this.stones = stones;
    }


    @Override
    public Iterator<Integer> iterator() {
        return new iter();
    }

    private final class iter implements Iterator<Integer> {
        private int index;
        private Deque<Integer> deque;

        public iter() {
            this.index = 0;
            this.deque = new ArrayDeque<>();
            for (int i = 0; i < 2; i++) {
                for (int j = i; j < stones.length; j += 2) {
                    deque.offer(stones[j]);
                }
            }
        }

        @Override
        public boolean hasNext() {
            return !deque.isEmpty();
        }

        @Override
        public Integer next() {
            return deque.poll();
        }
    }
}

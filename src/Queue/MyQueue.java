package Queue;

import java.util.ArrayList;

public class MyQueue<integer> {
    private final ArrayList<integer> queue;

    public MyQueue() {

        queue = new ArrayList<>();
    }

    public boolean isEmpty() {

        return queue.isEmpty();
    }

    public int queueSize() {
        return queue.size();
    }

    public void addQueue(integer list) {
        queue.add(list);
    }

    public void removeQueue(integer list) {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is fucking Empty");

        }
        if (!isEmpty()){
            queue.remove(0);
        }
    }
}
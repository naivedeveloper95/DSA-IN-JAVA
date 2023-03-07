import java.util.*;

public class PQueueDS {

    public static void main(String[] args) {

        // Priority Queue : A FIFO DS that serves elements with the highest priorities
        //                  first before the lower priority ones.

        Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer("B");
        queue.offer("C");
        queue.offer("D");
        queue.offer("A");
        queue.offer("E");
        queue.offer("F");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}

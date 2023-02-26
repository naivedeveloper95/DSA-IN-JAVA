import java.util.LinkedList;
import java.util.Queue;

public class QueueDS {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Karen");
        queue.offer("Raj");
        queue.offer("Sam");
        queue.offer("Steve");
        queue.offer("Herald");

        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.contains("Herald"));
        System.out.println(queue);

        queue.poll();
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.contains("Herald"));
        System.out.println(queue);

        queue.poll();
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.contains("Herald"));
        System.out.println(queue);

        queue.poll();
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.contains("Herald"));
        System.out.println(queue);

        queue.poll();
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.contains("Herald"));
        System.out.println(queue);

        queue.poll();
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.contains("Herald"));
        System.out.println(queue);
    }
}

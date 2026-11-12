import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.offer(10);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.offer(5);
        queue.offer(1);
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.remove(5));
    }
}

import java.util.LinkedList;
import java.util.Deque;
import java.util.Iterator;
public class LinkedListAsDequeAllMethods {
    public static void main(String[] args) {

        // Create Deque
        Deque<String> D = new LinkedList<String>();

        // 1. add()
        D.add("Java");
        D.add("Python");
        D.add("HTML");
        System.out.println("add(): " + D);

        // 2. addFirst()
        D.addFirst("C++");
        System.out.println("addFirst(): " + D);

        // 3. addLast()
        D.addLast("CSS");
        System.out.println("addLast(): " + D);

        // 4. offerFirst()
        D.offerFirst("Spring");
        System.out.println("offerFirst(): " + D);

        // 5. offerLast()
        D.offerLast("JavaScript");
        System.out.println("offerLast(): " + D);

        // 6. offer()
        D.offer("SQL");
        System.out.println("offer(): " + D);

        // 7. getFirst()
        System.out.println("getFirst(): " + D.getFirst());

        // 8. getLast()
        System.out.println("getLast(): " + D.getLast());

        // 9. peekFirst()
        System.out.println("peekFirst(): " + D.peekFirst());

        // 10. peekLast()
        System.out.println("peekLast(): " + D.peekLast());

        // 11. peek()
        System.out.println("peek(): " + D.peek());

        // 12. contains()
        System.out.println("contains(): " + D.contains("Java"));

        // 13. size()
        System.out.println("size(): " + D.size());

        // 14. isEmpty()
        System.out.println("isEmpty(): " + D.isEmpty());

        // 15. iterator()
        System.out.println("iterator():");

        Iterator<String> I = D.iterator();

        while (I.hasNext()) {
            System.out.println(I.next());
        }

        // 16. descendingIterator()
        System.out.println("descendingIterator():");

        Iterator<String> DI = D.descendingIterator();

        while (DI.hasNext()) {
            System.out.println(DI.next());
        }

        // 17. removeFirst()
        D.removeFirst();
        System.out.println("removeFirst(): " + D);

        // 18. removeLast()
        D.removeLast();
        System.out.println("removeLast(): " + D);

        // 19. pollFirst()
        System.out.println("pollFirst(): " + D.pollFirst());
        System.out.println("After pollFirst(): " + D);

        // 20. pollLast()
        System.out.println("pollLast(): " + D.pollLast());
        System.out.println("After pollLast(): " + D);

        // 21. remove()
        D.remove();
        System.out.println("remove(): " + D);

        // 22. poll()
        System.out.println("poll(): " + D.poll());
        System.out.println("After poll(): " + D);

        // 23. element()
        System.out.println("element(): " + D.element());

        // 24. push()
        D.push("React");
        System.out.println("push(): " + D);

        // 25. pop()
        System.out.println("pop(): " + D.pop());
        System.out.println("After pop(): " + D);

        // 26. toArray()
        Object[] A = D.toArray();

        System.out.println("toArray():");

        for (Object Data : A) {
            System.out.println(Data);
        }

        // 27. clear()
        D.clear();
        System.out.println("clear(): " + D);

        // 28. isEmpty()
        System.out.println("isEmpty(): " + D.isEmpty());
    }
}

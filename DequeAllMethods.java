import java.util.*;
public class DequeAllMethods {
    public static void main(String[] args) {

        Deque<String> Names = new ArrayDeque<>();

        // 1. add()
        Names.add("Ram");
        Names.add("Sam");
        Names.add("John");

        System.out.println("Deque: " + Names);

        // 2. addFirst()
        Names.addFirst("Amit");
        System.out.println("After AddFirst: " + Names);

        // 3. addLast()
        Names.addLast("Rahul");
        System.out.println("After AddLast: " + Names);

        // 4. offerFirst()
        Names.offerFirst("Karan");
        System.out.println("After OfferFirst: " + Names);

        // 5. offerLast()
        Names.offerLast("Ravi");
        System.out.println("After OfferLast: " + Names);

        // 6. getFirst()
        System.out.println("First: " + Names.getFirst());

        // 7. getLast()
        System.out.println("Last: " + Names.getLast());

        // 8. peekFirst()
        System.out.println("PeekFirst: " + Names.peekFirst());

        // 9. peekLast()
        System.out.println("PeekLast: " + Names.peekLast());

        // 10. removeFirst()
        Names.removeFirst();
        System.out.println("After RemoveFirst: " + Names);

        // 11. removeLast()
        Names.removeLast();
        System.out.println("After RemoveLast: " + Names);

        // 12. pollFirst()
        System.out.println("PollFirst: " + Names.pollFirst());

        // 13. pollLast()
        System.out.println("PollLast: " + Names.pollLast());

        System.out.println("After Poll: " + Names);

        // 14. push()
        Names.push("Rohit");
        System.out.println("After Push: " + Names);

        // 15. pop()
        System.out.println("Pop: " + Names.pop());

        // 16. size()
        System.out.println("Size: " + Names.size());

        // 17. contains()
        System.out.println("Contains Ram: " + Names.contains("Ram"));

        // 18. iterator()
        System.out.println("Using Iterator:");

        Iterator<String> itr = Names.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // 19. descendingIterator()
        System.out.println("Descending Iterator:");

        Iterator<String> Ditr = Names.descendingIterator();

        while (Ditr.hasNext()) {
            System.out.println(Ditr.next());
        }

        // 20. forEach()
        System.out.println("Using forEach:");

        Names.forEach(System.out::println);

        // 21. clear()
        Names.clear();

        System.out.println("After Clear: " + Names);
        System.out.println("Is Empty: " + Names.isEmpty());
    }
}

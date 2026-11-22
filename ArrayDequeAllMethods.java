    
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayDequeAllMethods {

    public static void main(String[] args) {

        ArrayDeque<String> Names = new ArrayDeque<>();

        // 1. add()
        Names.add("Java");
        Names.add("Python");
        Names.add("HTML");
        System.out.println("add(): " + Names);

        // 2. offer()
        Names.offer("CSS");
        System.out.println("offer(): " + Names);

        // 3. addFirst()
        Names.addFirst("C");
        System.out.println("addFirst(): " + Names);

        // 4. addLast()
        Names.addLast("JavaScript");
        System.out.println("addLast(): " + Names);

        // 5. offerFirst()
        Names.offerFirst("C++");
        System.out.println("offerFirst(): " + Names);

        // 6. offerLast()
        Names.offerLast("SQL");
        System.out.println("offerLast(): " + Names);

        // 7. push()
        Names.push("Spring");
        System.out.println("push(): " + Names);

        // 8. getFirst()
        System.out.println("getFirst(): " + Names.getFirst());

        // 9. getLast()
        System.out.println("getLast(): " + Names.getLast());

        // 10. peek()
        System.out.println("peek(): " + Names.peek());

        // 11. peekFirst()
        System.out.println("peekFirst(): " + Names.peekFirst());

        // 12. peekLast()
        System.out.println("peekLast(): " + Names.peekLast());

        // 13. contains()
        System.out.println("contains(Java): " + Names.contains("Java"));

        // 14. removeFirst()
        Names.removeFirst();
        System.out.println("removeFirst(): " + Names);

        // 15. removeLast()
        Names.removeLast();
        System.out.println("removeLast(): " + Names);

        // 16. remove()
        Names.remove();
        System.out.println("remove(): " + Names);

        // 17. poll()
        System.out.println("poll(): " + Names.poll());
        System.out.println("After poll(): " + Names);

        // 18. pollFirst()
        System.out.println("pollFirst(): " + Names.pollFirst());
        System.out.println("After pollFirst(): " + Names);

        // 19. pollLast()
        System.out.println("pollLast(): " + Names.pollLast());
        System.out.println("After pollLast(): " + Names);

        // 20. add duplicate elements
        Names.add("Java");
        Names.add("Python");
        Names.add("Java");
        Names.add("HTML");

        System.out.println("Before occurrence removal: " + Names);

        // 21. removeFirstOccurrence()
        Names.removeFirstOccurrence("Java");
        System.out.println("removeFirstOccurrence(): " + Names);

        // 22. removeLastOccurrence()
        Names.removeLastOccurrence("Java");
        System.out.println("removeLastOccurrence(): " + Names);

        // 23. size()
        System.out.println("size(): " + Names.size());

        // 24. isEmpty()
        System.out.println("isEmpty(): " + Names.isEmpty());

        // 25. iterator()
        System.out.println("Forward Traversal:");

        Iterator<String> I = Names.iterator();

        while (I.hasNext()) {
            System.out.println(I.next());
        }

        // 26. descendingIterator()
        System.out.println("Reverse Traversal:");

        Iterator<String> D = Names.descendingIterator();

        while (D.hasNext()) {
            System.out.println(D.next());
        }

        // 27. forEach()
        System.out.println("forEach():");

        Names.forEach(N -> System.out.println(N));

        // 28. toArray()
        Object[] Arr = Names.toArray();

        System.out.println("toArray(): " + Arrays.toString(Arr));

        // 29. addAll()
        ArrayDeque<String> MoreNames = new ArrayDeque<>();

        MoreNames.add("React");
        MoreNames.add("Angular");

        Names.addAll(MoreNames);

        System.out.println("addAll(): " + Names);

        // 30. removeAll()
        Names.removeAll(MoreNames);

        System.out.println("removeAll(): " + Names);

        // 31. retainAll()
        ArrayDeque<String> KeepNames = new ArrayDeque<>();

        KeepNames.add("Python");
        KeepNames.add("HTML");

        Names.retainAll(KeepNames);

        System.out.println("retainAll(): " + Names);

        // 32. removeIf()
        Names.removeIf(N -> N.equals("HTML"));

        System.out.println("removeIf(): " + Names);

        // 33. pop()
        Names.push("Java");
        System.out.println("Before pop(): " + Names);

        System.out.println("pop(): " + Names.pop());

        // 34. clear()
        Names.clear();

        System.out.println("clear(): " + Names);

        // 35. isEmpty() after clear
        System.out.println("Final isEmpty(): " + Names.isEmpty());
    }
}

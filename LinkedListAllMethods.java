import java.util.LinkedList;
import java.util.Collections;

public class LinkedListAllMethods {
    public static void main(String[] args) {

        LinkedList<String> Names = new LinkedList<>();

        // 1. add()
        Names.add("Ram");
        Names.add("Sam");
        Names.add("John");
        Names.add("Amit");
        Names.add("Rahul");

        System.out.println("1. Original: " + Names);

        // 2. add(index, element)
        Names.add(1, "Raj");
        System.out.println("2. Add: " + Names);

        // 3. addFirst()
        Names.addFirst("Rohit");
        System.out.println("3. Add First: " + Names);

        // 4. addLast()
        Names.addLast("Karan");
        System.out.println("4. Add Last: " + Names);

        // 5. get()
        System.out.println("5. Get: " + Names.get(0));

        // 6. getFirst()
        System.out.println("6. First: " + Names.getFirst());

        // 7. getLast()
        System.out.println("7. Last: " + Names.getLast());

        // 8. set()
        Names.set(0, "8. Vijay");
        System.out.println("Set: " + Names);

        // 9. remove()
        Names.remove("Sam");
        System.out.println("9. Remove: " + Names);

        // 10. removeFirst()
        Names.removeFirst();
        System.out.println("10. Remove First: " + Names);

        // 11. removeLast()
        Names.removeLast();
        System.out.println("11. Remove Last: " + Names);

        // 12. size()
        System.out.println("12. Size: " + Names.size());

        // 13. contains()
        System.out.println("13. Contains John: " + Names.contains("John"));

        // 14. indexOf()
        System.out.println("14. Index: " + Names.indexOf("John"));

        // 15. isEmpty()
        System.out.println("15. Is Empty: " + Names.isEmpty());

        // 16. offer()
        Names.offer("Suman");
        System.out.println("16. Offer: " + Names);

        // 17. peek()
        System.out.println("17. Peek: " + Names.peek());

        // 18. poll()
        System.out.println("18. Poll: " + Names.poll());
        System.out.println("After Poll: " + Names);

        // 19. push()
        Names.push("Anil");
        System.out.println("19. Push: " + Names);

        // 20. pop()
        System.out.println("20. Pop: " + Names.pop());

        // 21. Sorting
        Collections.sort(Names);
        System.out.println("21. Ascending: " + Names);

        // 22. Reverse Sorting
        Collections.sort(Names, Collections.reverseOrder());
        System.out.println("22. Descending: " + Names);

        // 23. forEach()
        System.out.println("23. ForEach:");
        Names.forEach(n -> System.out.println(n));

        // 24. removeIf()
        Names.removeIf(n -> n.startsWith("R"));
        System.out.println("24. RemoveIf: " + Names);

        // 25. clear()
        Names.clear();
        System.out.println("25. Clear: " + Names);

    }
}

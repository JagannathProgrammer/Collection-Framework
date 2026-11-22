import java.util.*;
public class PriorityQueueAllMethods {
    public static void main(String[] args) {

        PriorityQueue<String> Names = new PriorityQueue<>();

        // 1. add()
        Names.add("Ram");
        Names.add("Sam");
        Names.add("John");
        Names.add("Amit");
        Names.add("Rahul");

        System.out.println("PriorityQueue: " + Names);

        // 2. offer()
        Names.offer("Karan");

        System.out.println("After Offer: " + Names);

        // 3. peek()
        System.out.println("Peek: " + Names.peek());

        // 4. element()
        System.out.println("Element: " + Names.element());

        // 5. remove()
        System.out.println("Removed: " + Names.remove());

        System.out.println("After Remove: " + Names);

        // 6. poll()
        System.out.println("Poll: " + Names.poll());

        System.out.println("After Poll: " + Names);

        // 7. size()
        System.out.println("Size: " + Names.size());

        // 8. contains()
        System.out.println("Contains Sam: " + Names.contains("Sam"));

        // 9. isEmpty()
        System.out.println("Is Empty: " + Names.isEmpty());

        // 10. iterator()
        System.out.println("Using Iterator:");

        Iterator<String> itr = Names.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // 11. forEach()
        System.out.println("Using forEach:");

        Names.forEach(System.out::println);

        // 12. removeIf()
        Names.removeIf(Name -> Name.startsWith("R"));

        System.out.println("After RemoveIf: " + Names);

        // 13. clear()
        Names.clear();

        System.out.println("After Clear: " + Names);

        System.out.println("Is Empty: " + Names.isEmpty());
    }
}

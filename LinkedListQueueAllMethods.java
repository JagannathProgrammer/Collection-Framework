    
import java.util.LinkedList;
import java.util.Queue;
import java.util.Arrays;

public class LinkedListQueueAllMethods {

    public static void main(String[] args) {

        Queue<String> Names = new LinkedList<>();

        // 1. add()
        Names.add("Java");
        Names.add("Python");
        Names.add("HTML");
        System.out.println("add(): " + Names);

        // 2. offer()
        Names.offer("CSS");
        System.out.println("offer(): " + Names);

        // 3. element()
        System.out.println("element(): " + Names.element());

        // 4. peek()
        System.out.println("peek(): " + Names.peek());

        // 5. contains()
        System.out.println("contains(): " + Names.contains("Java"));

        // 6. size()
        System.out.println("size(): " + Names.size());

        // 7. isEmpty()
        System.out.println("isEmpty(): " + Names.isEmpty());

        // 8. remove()
        System.out.println("remove(): " + Names.remove());
        System.out.println("After remove(): " + Names);

        // 9. poll()
        System.out.println("poll(): " + Names.poll());
        System.out.println("After poll(): " + Names);

        // 10. addAll()
        Queue<String> MoreNames = new LinkedList<>();

        MoreNames.add("React");
        MoreNames.add("Angular");

        Names.addAll(MoreNames);

        System.out.println("addAll(): " + Names);

        // 11. iterator()
        System.out.println("Forward Traversal:");

        for (String N : Names) {
            System.out.println(N);
        }

        // 12. forEach()
        System.out.println("forEach():");

        Names.forEach(N -> System.out.println(N));

        // 13. toArray()
        Object[] Arr = Names.toArray();

        System.out.println("toArray(): " + Arrays.toString(Arr));

        // 14. removeAll()
        Names.removeAll(MoreNames);

        System.out.println("removeAll(): " + Names);

        // 15. retainAll()
        Queue<String> KeepNames = new LinkedList<>();

        KeepNames.add("Python");
        KeepNames.add("HTML");

        Names.retainAll(KeepNames);

        System.out.println("retainAll(): " + Names);

        // 16. removeIf()
        Names.removeIf(N -> N.equals("HTML"));

        System.out.println("removeIf(): " + Names);

        // 17. clear()
        Names.clear();

        System.out.println("clear(): " + Names);

        // 18. isEmpty()
        System.out.println("Final isEmpty(): " + Names.isEmpty());
    }
}

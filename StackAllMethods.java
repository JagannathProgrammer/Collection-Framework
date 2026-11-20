import java.util.Stack;
import java.util.Collections;

public class StackAllMethods {
    public static void main(String[] args) {

        Stack<String> Names = new Stack<>();

        // 1. push()
        Names.push("Ram");
        Names.push("Sam");
        Names.push("John");
        Names.push("Amit");
        Names.push("Rahul");

        System.out.println("Original: " + Names);

        // 2. peek()
        System.out.println("Peek: " + Names.peek());

        // 3. pop()
        System.out.println("Pop: " + Names.pop());
        System.out.println("After Pop: " + Names);

        // 4. search()
        System.out.println("Search Sam: " + Names.search("Sam"));

        // 5. empty()
        System.out.println("Empty: " + Names.empty());

        // 6. add()
        Names.add("Karan");
        System.out.println("Add: " + Names);

        // 7. get()
        System.out.println("Get: " + Names.get(0));

        // 8. set()
        Names.set(0, "Rohit");
        System.out.println("Set: " + Names);

        // 9. remove()
        Names.remove("Sam");
        System.out.println("Remove: " + Names);

        // 10. size()
        System.out.println("Size: " + Names.size());

        // 11. contains()
        System.out.println("Contains John: " + Names.contains("John"));

        // 12. indexOf()
        System.out.println("Index: " + Names.indexOf("John"));

        // 13. Sorting
        Collections.sort(Names);
        System.out.println("Ascending: " + Names);

        // 14. Reverse Sorting
        Collections.sort(Names, Collections.reverseOrder());
        System.out.println("Descending: " + Names);

        // 15. forEach()
        System.out.println("ForEach:");
        Names.forEach(n -> System.out.println(n));

        // 16. clear()
        Names.clear();
        System.out.println("Clear: " + Names);

    }
}


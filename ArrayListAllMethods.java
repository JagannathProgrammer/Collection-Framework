
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListAllMethods {
    public static void main(String[] args) {
        ArrayList<String> Names = new ArrayList<>();

        // 1. add()
        Names.add("Ram");
        Names.add("Sam");
        Names.add("John");
        Names.add("Amit");
        Names.add("Rahul");

        System.out.println("1. Add Original: " + Names);

        // 2. add(index, element)
        Names.add(1, "Raj");
        System.out.println("2. Add(index, element): " + Names);

        // 3. get()
        System.out.println("3. Get: " + Names.get(0));

        // 4. set()
        Names.set(0, "Rohit");
        System.out.println("4. Set: " + Names);

        // 5. remove()
        Names.remove("Sam");
        System.out.println("5. Remove: " + Names);

        // 6. size()
        System.out.println("6. Size: " + Names.size());

        // 7. contains()
        System.out.println("6. Contains: " + Names.contains("John"));

        // 8. indexOf()
        System.out.println("8. Index: " + Names.indexOf("John"));

        // 9. lastIndexOf()
        Names.add("John");
        System.out.println("9. Last Index: " + Names.lastIndexOf("John"));

        // 10. isEmpty()
        System.out.println("10. Is Empty: " + Names.isEmpty());

        // 11. Sorting
        Collections.sort(Names);
        System.out.println("11. Ascending: " + Names);

        // 12. Reverse Sorting
        Collections.sort(Names, Collections.reverseOrder());
        System.out.println("12. Descending: " + Names);

        // 13. forEach()
        System.out.println("13. ForEach:");
        Names.forEach(n -> System.out.println(n));

        // 14. removeIf()
        Names.removeIf(n -> n.startsWith("R"));
        System.out.println("14. RemoveIf: " + Names);

        // 15. clear()
        Names.clear();
        System.out.println("15. Clear: " + Names);

    }
}


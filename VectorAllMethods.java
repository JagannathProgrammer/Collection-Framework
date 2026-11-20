import java.util.Vector;
import java.util.Collections;

public class VectorAllMethods {
    public static void main(String[] args) {

        Vector<String> Names = new Vector<>();

        // 1. add()
        Names.add("Ram");
        Names.add("Sam");
        Names.add("John");
        Names.add("Amit");
        Names.add("Rahul");

        System.out.println("Original: " + Names);

        // 2. add(index, element)
        Names.add(1, "Raj");
        System.out.println("Add: " + Names);

        // 3. addElement()
        Names.addElement("Karan");
        System.out.println("Add Element: " + Names);

        // 4. insertElementAt()
        Names.insertElementAt("Rohit", 0);
        System.out.println("Insert: " + Names);

        // 5. get()
        System.out.println("Get: " + Names.get(0));

        // 6. elementAt()
        System.out.println("Element At: " + Names.elementAt(1));

        // 7. firstElement()
        System.out.println("First: " + Names.firstElement());

        // 8. lastElement()
        System.out.println("Last: " + Names.lastElement());

        // 9. set()
        Names.set(0, "Vijay");
        System.out.println("Set: " + Names);

        // 10. setElementAt()
        Names.setElementAt("Anil", 1);
        System.out.println("Set Element: " + Names);

        // 11. remove()
        Names.remove("Sam");
        System.out.println("Remove: " + Names);

        // 12. removeElement()
        Names.removeElement("John");
        System.out.println("Remove Element: " + Names);

        // 13. removeElementAt()
        Names.removeElementAt(0);
        System.out.println("Remove Element At: " + Names);

        // 14. size()
        System.out.println("Size: " + Names.size());

        // 15. capacity()
        System.out.println("Capacity: " + Names.capacity());

        // 16. contains()
        System.out.println("Contains Amit: " + Names.contains("Amit"));

        // 17. indexOf()
        System.out.println("Index: " + Names.indexOf("Amit"));

        // 18. isEmpty()
        System.out.println("Is Empty: " + Names.isEmpty());

        // 19. Sorting
        Collections.sort(Names);
        System.out.println("Ascending: " + Names);

        // 20. Reverse Sorting
        Collections.sort(Names, Collections.reverseOrder());
        System.out.println("Descending: " + Names);

        // 21. forEach()
        System.out.println("ForEach:");
        Names.forEach(n -> System.out.println(n));

        // 22. removeIf()
        Names.removeIf(n -> n.startsWith("R"));
        System.out.println("RemoveIf: " + Names);

        // 23. clear()
        Names.clear();
        System.out.println("Clear: " + Names);

    }
}

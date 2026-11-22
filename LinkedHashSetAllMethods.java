import java.util.*;
public class LinkedHashSetAllMethods {
    public static void main(String[] args) {

        LinkedHashSet<String> Names = new LinkedHashSet<>();

        // 1. add()
        Names.add("Ram");
        Names.add("Sam");
        Names.add("John");
        Names.add("Amit");
        Names.add("Rahul");
        Names.add("Ram"); // Duplicate

        System.out.println("Names: " + Names);

        // 2. size()
        System.out.println("Size: " + Names.size());

        // 3. contains()
        System.out.println("Contains Sam: " + Names.contains("Sam"));

        // 4. isEmpty()
        System.out.println("Is Empty: " + Names.isEmpty());

        // 5. remove()
        Names.remove("John");
        System.out.println("After Remove: " + Names);

        // 6. addAll()
        LinkedHashSet<String> NewNames = new LinkedHashSet<>();

        NewNames.add("Karan");
        NewNames.add("Ravi");

        Names.addAll(NewNames);
        System.out.println("After AddAll: " + Names);

        // 7. containsAll()
        System.out.println("Contains All: " + Names.containsAll(NewNames));

        // 8. removeAll()
        Names.removeAll(NewNames);
        System.out.println("After RemoveAll: " + Names);

        // 9. retainAll()
        LinkedHashSet<String> Students = new LinkedHashSet<>();

        Students.add("Ram");
        Students.add("Amit");
        Students.add("Rohit");

        Names.retainAll(Students);
        System.out.println("After RetainAll: " + Names);

        // 10. iterator()
        Iterator<String> itr = Names.iterator();

        System.out.println("Using Iterator:");

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

import java.util.*;
public class TreeSetAllMethods {
    public static void main(String[] args) {

        TreeSet<String> Names = new TreeSet<>();

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

        // 6. first()
        System.out.println("First Element: " + Names.first());

        // 7. last()
        System.out.println("Last Element: " + Names.last());

        // 8. lower()
        System.out.println("Lower than Ram: " + Names.lower("Ram"));

        // 9. higher()
        System.out.println("Higher than Ram: " + Names.higher("Ram"));

        // 10. floor()
        System.out.println("Floor of Ram: " + Names.floor("Ram"));

        // 11. ceiling()
        System.out.println("Ceiling of Ram: " + Names.ceiling("Ram"));

        // 12. descendingSet()
        System.out.println("Descending: " + Names.descendingSet());

        // 13. headSet()
        System.out.println("HeadSet: " + Names.headSet("Ram"));

        // 14. tailSet()
        System.out.println("TailSet: " + Names.tailSet("Ram"));

        // 15. subSet()
        System.out.println("SubSet: " +
                Names.subSet("Amit", true, "Sam", false));

        // 16. iterator()
        System.out.println("Using Iterator:");

        Iterator<String> itr = Names.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // 17. forEach()
        System.out.println("Using forEach:");

        Names.forEach(System.out::println);

        // 18. pollFirst()
        System.out.println("Removed First: " + Names.pollFirst());

        // 19. pollLast()
        System.out.println("Removed Last: " + Names.pollLast());

        System.out.println("After Poll: " + Names);

        // 20. removeIf()
        Names.removeIf(Name -> Name.startsWith("R"));

        System.out.println("After RemoveIf: " + Names);

        // 21. clear()
        Names.clear();

        System.out.println("After Clear: " + Names);
        System.out.println("Is Empty: " + Names.isEmpty());
    }
}

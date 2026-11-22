import java.util.HashSet;
public class HashSetAllMethods {
    public static void main(String[] args) {

        HashSet<String> Names = new HashSet<>();

        // 1. add()
        Names.add("Ram");
        Names.add("Sam");
        Names.add("John");
        Names.add("Amit");
        Names.add("Rahul");

        System.out.println("Original: " + Names);

        // 2. Add Duplicate
        Names.add("Ram");
        System.out.println("Duplicate: " + Names);

        // 3. size()
        System.out.println("Size: " + Names.size());

        // 4. contains()
        System.out.println("Contains Ram: " +
                Names.contains("Ram"));

        // 5. isEmpty()
        System.out.println("Is Empty: " +
                Names.isEmpty());

        // 6. remove()
        Names.remove("Sam");
        System.out.println("Remove: " + Names);

        // 7. addAll()
        HashSet<String> NewNames = new HashSet<>();

        NewNames.add("Karan");
        NewNames.add("Suman");

        Names.addAll(NewNames);
        System.out.println("AddAll: " + Names);

        // 8. containsAll()
        System.out.println("ContainsAll: " +
                Names.containsAll(NewNames));

        // 9. removeAll()
        Names.removeAll(NewNames);
        System.out.println("RemoveAll: " + Names);

        // 10. retainAll()
        HashSet<String> A = new HashSet<>();

        A.add("Ram");
        A.add("John");
        A.add("Amit");

        HashSet<String> B = new HashSet<>();

        B.add("John");
        B.add("Rahul");

        A.retainAll(B);
        System.out.println("RetainAll: " + A);

        // 11. iterator()
        System.out.println("Iterator:");

        java.util.Iterator<String> itr = Names.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // 12. forEach()
        System.out.println("ForEach:");

        Names.forEach(n -> System.out.println(n));

        // 13. removeIf()
        Names.removeIf(n -> n.startsWith("R"));

        System.out.println("RemoveIf: " + Names);

        // 14. clear()
        Names.clear();

        System.out.println("Clear: " + Names);

    }
}

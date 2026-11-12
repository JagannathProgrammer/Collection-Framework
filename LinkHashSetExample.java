import java.util.LinkedHashSet;
public class LinkHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> LHS = new LinkedHashSet<>();
        LHS.add("Jagannath");
        LHS.add("Rath");
        LHS.add("Yatra");

        System.out.println("LinkHashSet: " + LHS);
        LHS.clone();
        System.out.println("1. Cloned LinkHashSet: " + LHS);
        System.out.println("2. Does the LinkHashSet contain 'Jagannath'? "+ LHS.contains("Jagannath"));
        // LHS.addFirst("India");
        // System.out.println("3. LinkHashSet after adding 'India' at the beginning: " + LHS);
        // LHS.addLast("World");
        // System.out.println("4. LinkHashSet after adding 'World' at the end: " + LHS);
        LHS.getFirst();
        System.out.println("5. Getting the first element: " + LHS.getFirst());
        LHS.getLast();
        System.out.println("6. Getting the last element: " + LHS.getLast());
        LHS.size();
        System.out.println("7. Size of the LinkHashSet: " + LHS.size());
        LHS.isEmpty();  
        System.out.println("8. Is the LinkHashSet empty? " + LHS.isEmpty());
        LHS.equals(LHS);
        System.out.println("9. Is the LinkHashSet equal to itself? " + LHS.equals(LHS));
        // LHS.remove("India");
        // System.out.println("10. LinkHashSet after removing 'India': " + LHS);
        // LHS.removeFirst();
        // System.out.println("11. LinkHashSet after removing the first element: " + LHS);
        // LHS.removeLast();
        // System.out.println("12. LinkHashSet after removing the last element: " + LHS);
        // LHS.clear();
        // System.out.println("13. LinkHashSet after clearing all elements: " + LHS);
        LHS.hashCode();
        System.out.println("14. Hash code of the LinkHashSet: " + LHS.hashCode());
        LHS.reversed();
        System.out.println("15. Reversed LinkHashSet: " + LHS.reversed());
        
    }
}
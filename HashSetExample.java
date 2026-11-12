import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> Set = new HashSet<>();
        Set.add("Jagannath");
        Set.add("Rath");
        Set.add("Yatra");  

        Set.clone();
        System.out.println("1. Cloned set: " + Set);
        System.out.println("2. Does the set contain 'Jagannath'? " + Set.contains("Jagannath"));
        Set.isEmpty();  
        System.out.println("3. Is the set empty? " + Set.isEmpty());
        Set.size();
        System.out.println("4.  Size of the set: " + Set.size());
        // Set.clear();
        // System.out.println("Set after clearing: " + Set);
        // Set.removeAll(Set);
        // System.out.println("Set after removing all elements: " + Set);
        Set.equals(Set);
        System.out.println("5. Is the set equal to itself? " + Set.equals(Set));
        Set.hashCode();
        System.out.println("6. Hash code of the set: " + Set.hashCode());

    }
}

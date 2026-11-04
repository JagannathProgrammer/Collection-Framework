import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> Set = new HashSet<>();
        Set.add("Jagannath");
        Set.add("Rath");
        Set.add("Yatra");  

        Set.clone();
        System.out.println("Cloned set: " + Set);
        System.out.println("Does the set contain 'Jagannath'? " + Set.contains("Jagannath"));
        Set.isEmpty();  
        System.out.println("Is the set empty? " + Set.isEmpty());
        Set.size();
        System.out.println("Size of the set: " + Set.size());
        // Set.clear();
        // System.out.println("Set after clearing: " + Set);
        // Set.removeAll(Set);
        // System.out.println("Set after removing all elements: " + Set);
        Set.equals(Set);
        System.out.println("Is the set equal to itself? " + Set.equals(Set));
        Set.hashCode();
        System.out.println("Hash code of the set: " + Set.hashCode());

    }
}

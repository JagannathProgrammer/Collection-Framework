import java.util.HashMap;
public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> HM = new HashMap<>();
        HM.put("Jagannath", 25);
        HM.put("David", 30);
        HM.put("Charlie", 35);
        HM.put(null, 100);
        HM.put("Alice", null);
        HM.put(null, null);
        HM.replace("Alice", 200);


        System.out.println("HashMap: " + HM);
        // HM.clone();
        // System.out.println("1. Cloned HashMap: " + HM);
        // System.out.println("2. Does the HashMap contain 'Jagannath'? " + HM.containsKey("Jagannath"));
        // HM.hashCode();
        // System.out.println("3. Hash code of the HashMap: " + HM.hashCode());
        // HM.put("India", 40);
        // System.out.println("4. HashMap after adding 'India': " + HM);
        // HM.remove("David");
        // System.out.println("5. HashMap after removing 'David': " + HM);
        // HM.replace("Charlie", 35, 50);
        // System.out.println("6. HashMap after replacing 'Charlie': " + HM);
        // HM.size();
        // System.out.println("7. Size of the HashMap: " + HM.size());
    }
}

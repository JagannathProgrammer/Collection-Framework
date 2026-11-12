import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(1, "One");
        map.put(2, "Two");
        map.put(4, "Four");
        map.put(5, "Five");
        map.put(3, "Three");
        map.put(7, "Srven");
        

        // System.out.println(map);
        // System.out.println(map.clone());
        // System.out.println(map.containsKey(5));
        // System.out.println(map.containsValue("Four"));
        // System.out.println(map.get(2));
        // System.out.println(map.getOrDefault(2, "Two"));
        // System.out.println(map.remove(6));
        // System.out.println(map);
        // System.out.println(map.replace(2, "One"));
        // System.out.println(map);
        // System.out.println(map.replace(2, "One", "Two"));
        // System.out.println(map);
        // System.out.println(map.size());
        // System.out.println(map.lastKey());
        // System.out.println(map.keySet());
        // System.out.println(map.floorEntry(3));
        // System.out.println(map.headMap(4));
        // System.out.println(map.higherEntry(5));
        System.out.println(map.higherKey(1));
    }
}

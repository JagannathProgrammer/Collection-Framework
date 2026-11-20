import java.util.LinkedHashMap;
public class LinkHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> LHM = new LinkedHashMap<>();
        LHM.put("Jagannath", 25);
        LHM.put("Jay", 30);
        LHM.put("Charlie", 35);
        
        
        System.out.println("LinkedHashMap: " + LHM);
        System.out.println(LHM.size());
        
    }
}

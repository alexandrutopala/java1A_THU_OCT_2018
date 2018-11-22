import java.util.*;

public class Exmeplu9 {
    public static void main(String [] args) {
        
        Map<String, Integer> map = new HashMap<>();
        
        map.put("Gigel", 3);
        map.put("Costel", 2);
        map.put("Florica", 1);
        
        System.out.println(map);
        
        map.put("Gigel", 1);
        
        System.out.println(map);
        
        for (String key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println(key + " : " + value);            
        }
        
        
        
        
    }
}
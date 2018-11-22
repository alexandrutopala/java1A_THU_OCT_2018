import java.util.*;

public class Exemplu6 {
    public static void main(String [] args) {
        
        Set<String> set = new LinkedHashSet<>();
        
        set.add("Bucuresti");
        set.add("Brasov");
        set.add("Sibiu");
        set.add("Brasov");
        set.add("Timisoara");
        
        System.out.println(set);
    }
}




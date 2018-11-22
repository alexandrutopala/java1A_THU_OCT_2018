import java.util.*;

public class Exemplu3 {
    public static void main(String [] args) {
        List<Integer> list = new ArrayList<>();
        
        list.add(1);
        
        list.add(4);
        list.add(1);
        list.add(0);
        
        //list.remove(1);
        list.remove(new Integer(1));
        
        System.out.println(list);
        
        
        
        
        
    }
}
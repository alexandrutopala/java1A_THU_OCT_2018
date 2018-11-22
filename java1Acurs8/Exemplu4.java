import java.util.*;

public class Exemplu4 {
    public static void main(String [] args) {
        
        LinkedList<Integer> list = new LinkedList<>();
        
        list.addFirst(4);
        list.addFirst(6);
        list.addLast(4);
        list.addFirst(1);
        list.removeLast();
        list.addLast(10);
        list.removeFirst();
        list.removeFirst();
        list.addFirst(9);
        
        System.out.println(list); //  9 4 10 
        
        
        
        
    }
    
}
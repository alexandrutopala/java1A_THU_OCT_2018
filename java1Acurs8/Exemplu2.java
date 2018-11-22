import java.util.*;

public class Exemplu2 {
    public static void main(String [] args) {
        
        List<Integer> list = new ArrayList<Integer>();
        
        list.add(3);
        list.add(1);
        
        list.add(0);        
        list.add(3);
        list.add(5);
        
        System.out.println("Size : " + list.size());
        System.out.println("Is empty? " + list.isEmpty());
        System.out.println("Exista 5? " + list.contains(5));
        System.out.println("Elementul de indexul 2 " + list.get(2));
        
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        
        for (int x : list) {
            System.out.print(x + " " );
        }
        System.out.println();
        
        System.out.println(new int[]{5, 1, 0});
        System.out.println(list);
        
        list.forEach(e -> System.out.println(e));
        
        
        
        
        
        
    }
}
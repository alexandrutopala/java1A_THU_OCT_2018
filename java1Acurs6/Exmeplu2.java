public class Exmeplu2 {
    public static void main(String [] args) {
        Pisica p1 = new Pisica("Tom", 2);
        Pisica p2 = new Pisica("tom", 2);
        
        Pisica p3 = p2;
        
        System.out.println(p1.equals(p2)); // true
        System.out.println(p1 == p2); // false
        System.out.println(p2 == p3); // true
        System.out.println(p1.equals(null)); // false
        
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        
        
        System.out.println(p1);
        
        
        
        
        
    }
}
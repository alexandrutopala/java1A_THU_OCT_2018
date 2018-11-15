public class Exemplu4 {
    public static void main(String [] args) {
        Integer i1 = 3; //new Integer(3); - boxing
        int x = i1; //i1.intValue(); - unboxing
        
        int y = x + i1;
        System.out.println(y);
        
        int z = Integer.parseInt("32");
        System.out.println(z);
    }
}
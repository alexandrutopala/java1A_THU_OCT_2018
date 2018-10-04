public class Exemplu6 {
    public static void main(String [] args) {
        boolean b = false;
        
        
        if (b == true) {
            System.out.println("b are valoarea true");
            System.out.println("in if ");
        } else {
            System.out.println("in else");
        }
        
        System.out.println("end");
        
        int x = b == true ? 1 : 0;
        System.out.println(x);
        
        int y;
        
        if (b == true) {
            y = 1;
        } else {
            y = 0;
        }
        System.out.println(y);
        
        // <=> int y = b == true ? 1 : 0;
        
        
        
        
        
    }
}
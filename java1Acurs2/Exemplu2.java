public class Exemplu2 {
    public static void main(String [] args) {
        int n = 0;
       
       
        while (n < 5) {
            n++;
            
            if (n == 3) {
                continue;
            }
            
            if (n == 4) {
                break;
            }
            
            System.out.println(n);
        }
    }
}
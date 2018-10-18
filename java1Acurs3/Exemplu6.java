public class Exemplu6 {
    public static void main(String [] args) {
        int[] x1, y1; // x1: 1-dim, y1: 1-dim
        int x2[], y2; // x2: 1-dim, y2: variabila
        
        int[] x3[], y3, z3[][]; // x3: 2-dim, y3: 1-dim, z3: 3-dim 
        
        System.out.println( suma(2, 4, 6) );
        System.out.println( suma(2, 2) );
        System.out.println( suma() );
        System.out.println( suma(new int[]{2, 4, 6}) );
    }
    
    static int suma(int...nr) {
        int[] x = nr;
        int s = 0;
        
        /*
         * for (int i = 0; i < nr.length; i++) {
         *      s += nr[i];
           }
         */
        
        for (int a : nr) {
            s += a;
        }
        
        return s;
    }
    
    
    
    
    
    
    
}
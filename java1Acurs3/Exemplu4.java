public class Exemplu4 {
    public static void main(String [] args) {
        int[] v = {5, 1, 1, 2};
        
        
        System.out.println(v[2]);
        v[0] = 10;
        v[1] = v[0] + v[2];
        
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
        
        for (int x : v) {
            System.out.println(x); // x <=> v[i] 
        }
        
        
        
        
        
        
        
    }
}
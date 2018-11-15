import java.util.*;

public class Loterie {
    private static Loterie singleton;
    
    private Loterie() {
    }
    
    
    public static Loterie getInstance() {
        if (singleton == null) {
            singleton = new Loterie();
        }
        return singleton;
        
    }
    
    public int[] genereaza() {
        int[] sir = new int[6];
        Random r = new Random();
        
        for (int i = 0; i < sir.length; i++) {
            sir[i] = r.nextInt(25) + 1;
        }
        return sir;
    }
    
    public int calculeaza(int[] sir1, int[] sir2) {
        int sum = 0;
        
        
        for (int i = 0; i < sir1.length; i++) {
            int x = sir1[i];
            int y = sir2[i];
            
            int dif = Math.abs(x - y);
            switch (dif) {
                case 0 : sum += 100; break;
                case 1 : case 2 : case 3 : sum += 50; break;
                //case 1 | 2 | 3 : sum += 50; break;
                //case 4 | 5 : sum += 25; break;
                case 4 : case 5 : sum += 25; break;
            }
            
        }
        
        return sum;
    }
    
    public void afiseaza(int[] sir) {
        for (int x : sir) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    
    
    
    
    
    
    
    
    
    
    
}
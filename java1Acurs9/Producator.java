import java.util.*;

public class Producator extends Thread {
    static int id = 0;
    public Producator() {
        super("Producator " + id++);
    }
    
    
    
    @Override
    public void run() {
        Random r = new Random();
        
        while (true) {
            try {
                synchronized (Exemplu2.list) {
                    if (Exemplu2.list.size() < 50) {
                        int x = r.nextInt(100);
                        Exemplu2.list.add(x);
                        System.out.println("PRODUS: " + x);
                        Exemplu2.list.notifyAll();
                    } else {
                        Exemplu2.list.wait();
                    }
                }
            } catch (InterruptedException e) {
            }
        }
        
        
    }
}




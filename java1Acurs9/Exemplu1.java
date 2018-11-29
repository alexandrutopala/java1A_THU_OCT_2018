public class Exemplu1 {
    public static void main(String [] args) {
        EvenNumbersThread t1 = new EvenNumbersThread();
        OddNumbersRunnable task = new OddNumbersRunnable();
        
        Thread t2 = new Thread(task);
        
        t1.start();
        t2.start();
       
        try {
            t1.join();
            // pune firul curent in asteptare (main) pana la
            // la terminarea firului t1
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            
        System.out.println("end main");
        
        
        
    }
}
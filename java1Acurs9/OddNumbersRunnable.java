public class OddNumbersRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < 50; i += 2) {
        
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
    
}
public class EvenNumbersThread extends Thread {
    
    @Override
    public void run() {
        
        for (int i = 2; i <= 50; i += 2) {
            try {
                Thread.sleep(70);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}
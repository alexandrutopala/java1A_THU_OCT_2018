public class Exemplu5 {
    public static void main(String [] args) {
        try (DBConnection con1 = new DBConnection();
             DBConnection con2 = new DBConnection()) {
                 
            // ..  
            throw new Exception("IN TRY");
        } catch (Exception e) {
            System.out.println(e);
            Throwable[] ts = e.getSuppressed();
            for (Throwable t : ts) {
                System.out.println(t);
            }
            e.printStackTrace();
        }
    }
}
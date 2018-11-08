public class DBConnection implements AutoCloseable {
    public DBConnection() {
        System.out.println("Se stabileste conexiunea...");
    }
    
    @Override
    public void close() {
        System.out.println("Se inchide conexiunea...");
        throw new RuntimeException("Exceptie la inchidere");
    }
}
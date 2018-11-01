public class Masina {
    String marca;
    
    // singleton sincronizat lazy
    private Masina() {
    }
    
    private final static class SingletonHolder {
        public final static Masina SINGLETON = new Masina();
    }
    
    public static Masina getInstance() {
        return SingletonHolder.SINGLETON;
    }
    
    
    
    
    
    
    
}
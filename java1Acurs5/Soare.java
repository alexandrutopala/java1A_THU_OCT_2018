public class Soare {
    long diametru;
    // singleton nesincronizat lazy
    
    // singleton va retine unica instanta de Soare din aplicatie
    
    private static Soare singleton;
    
    private Soare() {
    }
    
    public static Soare getInstance() {
        if (singleton == null) { // adica nu a mai fost creata o instanta de Soare pana acum
            singleton = new Soare();
        }
        
        return singleton;
        
        
    }
    
    
    
    
    
}
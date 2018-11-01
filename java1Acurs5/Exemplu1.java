public class Exemplu1 {
    public static void main(String [] args) {
       Personaj p = getPersonaj();
       p.actioneaza();
    }
  
    
    
    private static Personaj getPersonaj() {
        return new Span();
    }
}
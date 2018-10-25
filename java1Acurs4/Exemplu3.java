public class Exemplu3 {
    public static void main(String [] args) {
        Pisica p1 = new Pisica();
        Domestic d1 = new Pisica();
        
        Animal a1 = new Pisica();
        
        Animal a2 = new Domestic(true);
        
        //a1.isDeInterior();
        a1.sayHello();
        
        Pisica p2 = (Pisica) a1;
        
        if (a2 instanceof Pisica) {
            Pisica p3 = (Pisica) a2; // cast
        } else {
            System.out.println("Ai fi dat cu capul");
        }
        
        
        
        
        
        
        
    }
}
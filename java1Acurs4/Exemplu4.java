public class Exemplu4 {
    public static void main(String [] args) {
        Adapost a = new Adapost(5);
        
        
        a.adauga(new Animal());
        a.adauga(new Domestic(true));
        a.adauga(new Animal());
        a.adauga(new Pisica());
        a.adauga(new Animal());
        
        System.out.println("--------------------");
        a.afiseaza();
        System.out.println("--------------------");
        a.sayMiau();
        
        
        
        
        
        
    }
}
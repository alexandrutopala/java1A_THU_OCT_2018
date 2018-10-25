public class Exemplu2 {
    public static void main(String [] args) {
        Domestic d1 = new Domestic(false);
        
        
        d1.sayHello();
        
        Pisica p1 = new Pisica();
        p1.sayHello();
        System.out.println(p1.isDeInterior());
        
        p1.nume = "Pisi";
        p1.afisSuperNume();
        p1.afisThisNume();
        
        
        
        
        
        
        
        
        
        
    }
}
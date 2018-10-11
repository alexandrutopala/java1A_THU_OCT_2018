public class Exemplu5 {
    public static void main(String [] args) {
        Pisica p1;
        p1 = new Pisica();
        
        p1.nume = "Pisi";
        p1.varsta = 2;
        p1.culoare = "negru";
        
        Pisica p2 = p1;
        p2.nume = "Tom";
        
        System.out.println(p1.nume);
        
        Pisica p3 = new Pisica();
        p3.nume = p1.nume;
        p3.varsta = p1.varsta;
        p3.culoare = p1.culoare;
        
        //p3 = null;
        
        System.out.println(p3.nume);
        
        p3.sayMiau();
        
        
        
        
        
        
        
    }
}
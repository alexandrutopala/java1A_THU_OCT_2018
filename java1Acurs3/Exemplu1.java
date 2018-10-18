public class Exemplu1 {
    public static void main(String [] args) {
        Pisica p1 = new Pisica("George", 3);
        Pisica p2 = new Pisica("Costel", 4);
        
        System.out.println(p1.counter);
        System.out.println(p2.counter);
        
        System.out.println(Pisica.counter);
        
        p1.staticM();
        Pisica.staticM();
    }
}
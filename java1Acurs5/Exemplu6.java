public class Exemplu6 {
    public static void main(String [] args) {
        Soare s1 = Soare.getInstance();
        s1.diametru = 100;
        
        Soare s2 = Soare.getInstance();
        s2.diametru = 50;
        
        System.out.println(s1.diametru); //
        
    }
}
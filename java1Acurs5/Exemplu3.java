public class Exemplu3 {
    public static void main(String [] args) {
        // instantierea unei clase inner statice
        B.B3 b3 = new B.B3();
        
        // instantierea unei clase inner non-statice
        B.B1 b1;
        B b = new B();
        b1 = b.new B1();
        
        B.B1 b11 = new B().new B1();
    }
}
public class Exmeplu6 {
    public static void main(String [] args) {
        Foo f1 = new Foo();
        
        
        int s = f1.suma(2, 4);
        System.out.println(s);
        
        f1.m(2);
        f1.m(5L);
        //f1.m(null);
    }
}
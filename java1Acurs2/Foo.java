public class Foo {
    int suma(int a, int b) {
        int c = a + b;
        return c;
        
        //System.out.println("end suma");
    }
    
    int suma(int a, int b, int c) {
        return suma(a, b) + c;
    }
    
    void m(int x) {
        System.out.println("1");
    }
    
    void m(long x) {
        System.out.println("2");
    }
    
    void m(Pisica x) {
        System.out.println("3");
    }
    
    void m(String x) {
        System.out.println("4");
    }
    
    
    
    
    
    
    
}
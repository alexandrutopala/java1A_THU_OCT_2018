import p1.*; // importa toate clasele din pachetul p1
import p1.pp1.A;
import static p1.A.y;
import java.lang.*;
import static java.lang.System.out;

public class Exemplu3 {
    public static void main(String [] args) {
        p1.A a = new p1.A();
        p1.pp1.A a1 = new p1.pp1.A();
        
        A a3 = new A();
        out.println(a3.z);
        
        B b = new B();
        
        y = 9;
        
        
        
        
    }
}
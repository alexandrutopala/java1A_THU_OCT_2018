public class C {
    int x = 4;
    
    
    
    void m() {
        int z = 1; // variabila efectiv finala
        //z++;
        class LocalC { // clasa locala
            int x = 10;
            void m() {
                System.out.println(z);
                System.out.println(this.x); // 10
                System.out.println(C.this.x++); // 4
            }
        }
        
        abstract class AC {
        }
        
        //interface I { // nu sunt suportate interfetele locale
        //}
        
        //enum E { // nu sunt suportate enumerarile locale
        //}
        
        
        
    }
}
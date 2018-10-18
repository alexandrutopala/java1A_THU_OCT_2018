public class Pisica {
    String nume;
    final int varsta;// = 5;
    static int counter;// = 0;
    
    
    static {
        /*
         * La prima folosire in program a unei clase : 
         *  - sunt alocate variabilele statice
         *  - sunt executate blocurile anonime statice
         */
        System.out.println("bloc anonim static");
    }
   
    {
        /*
         * La momentul unei instantieri :
         *  - sunt alocate atributele clasei
         *  - sunt executate blocurile anonime non-statice
         *  - este apelat constructorul
         */
        System.out.println("bloc anonim non-static");
        //varsta = 5;
    }
    
    
    Pisica(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
        this.counter++;
        System.out.println("c-tor");
    }
    
    void m() {
        System.out.println(this.nume);
        System.out.println(counter);
        System.out.println("non-static context");
    }
    
    static void staticM() {
        System.out.println(counter);
        //System.out.println(this.nume);
        System.out.println("static context");
    }
    
    
    
    
    
    
}
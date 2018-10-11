public class Pisica {
    String nume;
    int varsta;
    String culoare;
    
    Pisica() {
        this("Mitzi", 1, "alb");
        System.out.println("S-a creat o Pisica");
    }
    
    Pisica(String nume, int varsta, String culoare) {
        this.nume = nume;
        this.varsta = varsta;
        this.culoare = culoare;
    }
    
    void sayMiau() {
        System.out.println("Miau! Numele meu este " + this.nume);
        return;
    }
    
    
    
}
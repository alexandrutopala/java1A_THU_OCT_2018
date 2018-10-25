public class Animal {
    protected String nume;
    private int greutate;
    
    Animal(String nume, int greutate) {
        this.nume = nume;
        this.greutate = greutate;
        System.out.println("S-a creat un animal");
    }
    
    Animal() {
        this("Rex", 10);
    }
    
    void sayHello() {
        System.out.println("Buna! Numele meu este " + this.nume);
    }
    
    public String getNume() {
        return this.nume;
    }
    
    public void setNume(String nume) {
        if (nume == null) {
            return;
        }
        this.nume = nume;
    }
    
    public int getGreutate() {
        return this.greutate;
    }
    
    public void setGreutate(int greutate) {
        this.greutate = greutate;
    }
    
    
    
    
    
    
    
    
    
}
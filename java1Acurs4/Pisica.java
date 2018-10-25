public final class Pisica extends Domestic {
    String nume; // 3 - hiding field
    
    public Pisica() {
        super(false); // c-torul Domestic(boolean deInterior)
        System.out.println("c-tor pisica");
    }
    
    public void afisThisNume() {
        System.out.println("this : " + this.nume);
    }    
    
    public void afisSuperNume() {
        System.out.println("super : " + super.nume);
    }
    
    @Override
    public final void sayHello() {
        System.out.println("Miau! Numele meu este " + nume); // this subinteles
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
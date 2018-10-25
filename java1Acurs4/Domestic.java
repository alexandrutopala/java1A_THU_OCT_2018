public class Domestic extends Animal {
    // 1 - adaugare de atribute
    private boolean deInterior;
    
    
    public Domestic(boolean deInterior) {
        this.deInterior = deInterior;
        System.out.println("c-tor domestic");
    }
    
    // 2 - adaugare de comportamente
    public void setDeInterior(boolean deInterior) {
        this.deInterior = deInterior;
    }
    
    public boolean isDeInterior() {
        return this.deInterior;
    }
}
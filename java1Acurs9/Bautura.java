public abstract class Bautura {
    public String nume;
    public int pret;    
    
    public Bautura(String nume, int pret) {
        this.nume = nume;
        this.pret = pret;
    }
    
    @Override
    public String toString() {
        return nume + " " + pret;
    }
}
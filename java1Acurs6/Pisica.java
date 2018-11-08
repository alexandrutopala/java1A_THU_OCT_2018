public class Pisica /*IMPLICIT: extends Object*/ {
    public String nume;
    public int varsta;
    
    
    public Pisica(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        
        if (!(obj instanceof Pisica)) {
            return false;
        }
        
        Pisica p = (Pisica) obj;
        
        return this.nume.equals(p.nume);
    }
    
    @Override
    public int hashCode() {
        return this.nume.hashCode();
    }
    
    @Override
    public String toString() {
        
        return "Miau! " + this.nume + " " + super.toString();
    }
    
    
    
    
    
    
    
    
    
}
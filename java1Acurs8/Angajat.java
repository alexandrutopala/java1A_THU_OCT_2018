public class Angajat implements Comparable<Angajat> {
    public String nume;
    public int varsta;
    
    public Angajat(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }
    
    @Override
    public int compareTo(Angajat other) {
        return this.varsta - other.varsta;
    }
    
    @Override
    public String toString() {
        return nume + " " + varsta;
    }
}





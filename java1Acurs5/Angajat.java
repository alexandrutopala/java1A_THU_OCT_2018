public class Angajat {
    public String nume;
    public int vechime;
    
    
    public Angajat(String nume, int vechime) {
        this.nume = nume;
        this.vechime = vechime;
    }
    
    public int getSalariu() {
        return 1000 * vechime;
    }
    
    
}
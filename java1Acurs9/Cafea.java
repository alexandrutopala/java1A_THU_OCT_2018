public class Cafea extends Bautura {
    public int cafeina;
    
    public Cafea(String nume, int pret, int cafeina) {
        super(nume, pret);
        this.cafeina = cafeina;
    }
}
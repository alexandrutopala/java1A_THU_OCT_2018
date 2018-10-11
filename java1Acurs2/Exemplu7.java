public class Exemplu7 {
    public static void main(String [] args) {
        int x = 4;
        
        Pisica p = new Pisica();
        p.nume = "Tommy";
        
        Bar b = new Bar();
        
        b.transferCopie(x);
        b.transferReferinta(p);
        
        System.out.println(x);
        System.out.println(p.nume);
    }
}
public class Exemplu4 {
    public static void main(String [] args) {
        Angajat a1 = new Angajat("Costel", 3);
        Angajat a2 = new Angajat("Florica", 4);
        
        Angajat a3 = new Angajat("Gigel", 1){ // clasa anonima
            @Override
            public int getSalariu() {
                return 4000;
            }
        };
        
        System.out.println(a1.getSalariu());
        System.out.println(a2.getSalariu());
        System.out.println(a3.getSalariu());
    }
}
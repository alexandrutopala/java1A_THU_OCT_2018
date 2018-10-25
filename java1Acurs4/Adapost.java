public class Adapost {
    private Animal[] animale;
    private int counter;
    
    
    public Adapost(int nrAnimale) {
        animale = new Animal[nrAnimale];
    }

    public int getCounter() {
        return this.counter;
    }
    
    public Animal[] getAnimale() {
        return this.animale;
    }
    
    public void adauga(Animal a) {
        if (counter == animale.length) {
            return;
        }
        
        animale[counter] = a;
        counter++;
    }
    
    public void afiseaza() {
        for (int i = 0; i < counter; i++) {
            Animal a = animale[i];
            System.out.println(a.getNume() + " " + a.getGreutate());
        }
    }
    
    public void sayMiau() {
        for (int i = 0; i < counter; i++) {
            Animal a = animale[i];
            if (a instanceof Pisica) {
                a.sayHello();
            }
        }
    }
    
    
    
    
    
    
}

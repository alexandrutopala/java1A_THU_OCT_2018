public class Exemplu1 {
    public static void main(String [] args) {
        Animal a1 = new Animal();
        System.out.println(a1.getNume());
        
        Animal a2 = new Animal("Tom", 8);
        
        //a2.nume = null; 
        
        System.out.println(a2.getNume());
    }
}
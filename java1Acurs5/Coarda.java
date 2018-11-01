public interface Coarda {
    
    default void vibreaza() {
        System.out.println("bzzzzz");
    }
    
    static void m() {
        System.out.println("Metoda static in interfata");
    }
}
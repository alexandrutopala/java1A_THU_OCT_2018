public class Exemplu1 {
    public static void main(String [] args) {
        int x = 1;
        
        
        switch (x) {
            case 0 :
            case 1 : System.out.println("IARNA"); break;
            case 2 : System.out.println("PRIMAVARA"); break;
            case 3 : System.out.println("VARA"); break;
            case 4 : System.out.println("TOAMNA"); break;
            default : System.out.println("invalid");
        }
    }
}
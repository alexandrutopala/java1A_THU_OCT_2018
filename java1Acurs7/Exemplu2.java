public class Exemplu2 {
    public static void main(String [] args) {
        String rez = transform("ana are mere");
        System.out.println(rez);
    }
    
    
    private static String transform(String s) {
        // trans 1 : inlocuirea tuturor spatiilor din s cu sirul de
        //           caractere "99"
        // trans 2 : inversarea sirului
        // s = "ana are mere"
        // ana99are99mere
        // erem99era99ana
        
        s = s.replace(" ", "99");
        StringBuilder sb = new StringBuilder(s);
        
        sb.reverse();
        
        s = sb.toString();
        
        
        return s;
    }
    
    
    
    
    
}
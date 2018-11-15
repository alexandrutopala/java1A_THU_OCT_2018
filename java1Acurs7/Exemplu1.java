public class Exemplu1 {
    public static void main(String [] args) {
        String s1 = "Hello ";
        String s2 = "world";
        
        String s3 = s1;
        
        s1 = s1 + s2;
        
        System.out.println(s3);
    }
}
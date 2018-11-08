public class Exmeplu3 {
    public static void main(String [] args) {
        System.out.println("A");
        
        try {
            m(1);
            System.out.println("E");
        } catch (MyException e) {
            System.out.println("D");
        } catch (MyRuntimeException | NullPointerException e) { // multi-catch
            System.out.println(e.getMessage());
            System.out.println(e);
            e.printStackTrace();
        } finally {
            System.out.println("C");
        }
        
        System.out.println("B");
    }
    
    private static void m(int i) throws MyException, NullPointerException  {
        switch(i) {
            case 1 : 
                MyRuntimeException e = new MyRuntimeException();
                throw e;
                //break;
            case 2 : 
                throw new MyException();
            case 3 : 
                throw new NullPointerException("Un mesaj");
                
        }
    }
    
    
    
    
    
    
    
    
}
public class Exemplu4 {
    public static void main(String [] args) {
        DBConnection con = null;
        
        try {
            con = new DBConnection();
            //..
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                con.close();
            }
            
            
            
        }
        
        //
    }
}
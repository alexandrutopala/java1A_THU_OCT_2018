public class Exemplu1 {
    public static void main(String [] args) {
        Cutie c1 = new Cutie();
        
        
        Cutie<String> c2 = new Cutie<String>();
        // c2 poate retine doar instante de cutie care au ca tip
        // generic pe String
        
        Cutie<?> c3 = new Cutie<Integer>();
        // c3 poate retine instante de Cutie, indiferent de tipul 
        // lor generic
        
        Cutie<? extends Number> c4 = new Cutie<Integer>();
        // c4 poate retine doar instante de Cutie care au ca tip
        // generic o clasa care mosteneste pe Number 
        // (inclusiv Number)
        
        Cutie<? super Number> c5 = new Cutie<Number>();
        // c5 poate retine doar instante de Cutie care au ca tip
        // generic o clasa superioara lui Number 
        // (inclusiv Number)
        
        new Cutie<int[]>();
        
        Cutie<String> c6 = new Cutie<>();
        
        new Cutie< Cutie<String> >();
    }
}






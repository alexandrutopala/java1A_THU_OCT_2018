import java.util.*;

public class Main {
    public static void main(String [] args) {
        
        Scanner scanner = new Scanner(System.in);
        String line;
        String[] input;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        while (true) {
            line = scanner.nextLine();
            input = line.split("\\s+"); // " "
            
            switch (input[0].toUpperCase()) {
                case "ADD" : 
                    int x = Integer.parseInt(input[1]);    
                    
                    list.add(x);
                    break;
                case "AFIS_ORDERED" : 
                    System.out.println(list);
                    break;                
                case "AFIS_SORTED" : 
                    ArrayList<Integer> copie = new ArrayList<>(list);
                    Collections.sort(copie);
                    System.out.println(copie);
                    break;
                case "REMOVE" : 
                    int index = Integer.parseInt(input[1]); 
                    list.remove(index);
                    break;
                case "REMOVE_ALL" : 
                    int x1 = Integer.parseInt(input[1]); 
                    /*while (list.contains(new Integer(x1))) {
                        list.remove(new Integer(x1));
                    }*/
                    
                    list.removeIf(e -> e == x1);
                    break;
                case "CLEAR" : 
                    list.clear();
                    break;
                case "EXIT" :
                    System.exit(0);
                    break;
                default : System.err.println("Comanda invalida");
            }
        }
        
        
        
        
        
        
        
        
    }
}
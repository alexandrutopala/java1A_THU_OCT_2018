import java.util.*;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        String[] input;
        Cafenea cafenea = Cafenea.getInstance();
        
        while (true) {
            try {
                line = scanner.nextLine();
                input = line.split("\\s+"); // " "
                
                switch (input[0].toUpperCase()) {
                    case "ADD" : adauga(input); break;
                    case "AFIS" : cafenea.afiseazaBauturi(); break;
                    case "AFIS_CAFELE" : cafenea.afiseazaCafele(); break;
                    case "STERGE" : cafenea.stergeBautura(input[1]); break;
                    case "SORT" : cafenea.afiseazaSortat(); break;
                    case "EXIT" : System.exit(0); break;
                    default : System.err.println("Comanda invalida");
                }
                
                
                
            } catch (Exception e) {
                System.err.println(e);
            }
        }
    }
    
    private static void adauga(String [] input) throws NameAlreadyExistsException {
        String tip = input[1];
        String nume = input[2];
        int pret = Integer.parseInt(input[3]);
        int inf = Integer.parseInt(input[4]);
        
        if (tip.equalsIgnoreCase("cafea")) {
            Cafenea.getInstance().adaugaBautura( new Cafea(nume, pret, inf) );
        } else if (tip.equalsIgnoreCase("suc")) {
            Cafenea.getInstance().adaugaBautura( new Suc(nume, pret, inf) );
        }
        
    }
}







/*
 * Programma che disegna al terminale una matrice 
 * con numeri randomici
 * @Evan Sala
 * @version 11.12.2023
 */
import java.util.Scanner;

public class Program{
    public static void main(String[] args){
        int dimensione = Integer.parseInt(args[0]);
        int seleziona = Integer.parseInt(args[1]);
        if(args[0].equals("") && args[1].equals("")){
            Scanner in = new Scanner(System.in);
            System.out.print("Inserisci la dimensione della matrice: ");
            String dimensioneMatrice = in.next();
            System.out.print("[1] matrice random o [2] matrice con solo zeri ed un solo 1 posizionato casualmente");
            String selezionaMatrice = in.next();
            dimensione = Integer.parseInt(dimensioneMatrice);
            seleziona = Integer.parseInt(selezionaMatrice);

        }
        if(seleziona == 1){
            
        }
    }
}
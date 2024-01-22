/*
 * programma che stampa al terminale un quadrato
 * di lunghezza che gli ofrnice l'utente
 */
import java.util.Scanner;
public class Quadrato {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Inserisci un numero: ");
        int numero = Integer.parseInt(in.next());
        for(int i = 0; i < numero;i++){
            for(int j = 0; j < numero; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

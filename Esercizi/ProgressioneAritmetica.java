/*
 * programmca che scrive al terminale se
 * i tre numeri ceh l'utente sono forniti sono aritmetici.
 * @Evan Sala
 * @version 18.09.2023
 * 
 */
import java.util.Scanner;

public class ProgressioneAritmetica {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Inserisci il primo numero: ");
        int numero1 = Integer.parseInt(in.next());
        System.out.print("Inserisci il secondo numero: ");
        int numero2 = Integer.parseInt(in.next());
        System.out.print("Inserisci il terzo numero: ");
        int numero3 = Integer.parseInt(in.next());
        if(numero2 -numero1 == numero3- numero2){
            int differenza= numero2-numero1;
            System.out.println("I tre numeri sono in progressione aritmetica (differenza costante di "+differenza+" )");
        }else{
            System.out.println("I tre numeri non sono in progressione aritmetica"); 
        }
    }
}

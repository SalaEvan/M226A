/*
 * programma che stampa al terminale il fattoriale
 * del numero che l'utente ha dato.
 * @Evan Sala
 * @version 18.09.2023
 */
import java.util.Scanner;
public class Fattoriale {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Inserisci un numero intero positivo: ");
        int numero = Integer.parseInt(in.next());
        int fatt = 1;
        if(numero < 0){
            System.out.println("Numero non valido!!");
        }else{
            for(int i = numero; i > 0; i--){
                fatt *=i;
                if(i != 1){
                    System.out.print(i +" * ");
                }else{
                    System.out.print(i +" = "+ fatt);
                }
            }
        }
    }   
}

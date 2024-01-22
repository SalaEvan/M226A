/**
 * chiede all'utente di inserire i due cateti di un triangolo come argomenti.
 * Il programma deve quindi determinare la lunghezza dell'ipotenusa del triangolo
 * @author Evan Sala
 * @version 11.09.2023
 */

import java.util.Scanner;
public class Pitagora{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Inserisci il primo cateto: ");
        String cateto1 = in.next();
        System.out.print("Inserisci il secondo cateto: ");
        String cateto2 = in.next();
        int co = Integer.parseInt(cateto1);
        int ca = Integer.parseInt(cateto2);
        System.out.println(Math.sqrt(Math.pow(co,2.0)+ Math.pow(ca,2.0)));
    }
}
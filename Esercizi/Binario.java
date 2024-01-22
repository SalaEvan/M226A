/*
 * programma che stampa al terminale il numero 
 * che l'utente ha fortnito intero positivo convertito in binario.
 * @Evan Sala
 * @version 18.9.2023
 */

import java.util.Scanner;
public class Binario {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Inserisci un numero intero positivo: ");
        int numero = Integer.parseInt(in.next());
        int count = 0;
        char[] binario = new char[numero];
        int numero_nuovo = numero;
        if(numero <0){
            System.out.print("Numero non valido!!");
        }
        for(int i = 0; i <numero; i++){
            if(numero_nuovo <=0){
                break;
            }
            if(numero_nuovo % 2 ==0){
                binario[i]='0';
            }else{
                binario[i]='1';
            }
            numero_nuovo /= 2;
            count++;
        }
        for(int j = 0; j <count; j++){
            System.out.print(binario[count - 1 - j]);
        }
        System.out.println();
    }
}

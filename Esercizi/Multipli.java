/*
 * programma che scrive al terminale
 * i multipli del numero che l'utente ha fornito.
 * @author Evan Sala
 * @version 18.09.2023
 * 
 */

public class Multipli {
    public static void main(String[] args){
        int argomento = Integer.parseInt(args[0]);
        if(argomento % 5 == 0){
            System.out.print(argomento+" è un multiplo di 5.");
        }else{
            System.out.print(argomento+" non è un multiplo di 5.");
        }
    }
}

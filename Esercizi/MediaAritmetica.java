/**
 * programma che scrive al terminale la media
 * aritmetica dei tre argomenti che l'utente da.
 * @author Evan Sala
 * @version 06.09.2023
 * 
 */
public class MediaAritmetica{
    public static void main (String[] args){
        int somma = Integer.parseInt(args[0])+Integer.parseInt(args[1])+Integer.parseInt(args[2]);

        System.out.print("("+ args[0]+" + "+args[1]+" + "+args[2]+") /"+args.length+" = "+somma);

    }
}
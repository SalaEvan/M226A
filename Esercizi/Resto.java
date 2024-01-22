/**
 * programma che scrive al terminale 
 * il resto tra due diviioni
 * @author Evan Sala
 * @version 11.09.2023
 * 
 */

public class Resto{
    public static void main(String[] args){
        int risultato;
        int arg1 = Integer.parseInt(args[0]);
        int arg2 = Integer.parseInt(args[1]);
        risultato = arg1/arg2;
        System.out.println(risultato);
    }
}
/*
 * L'utente dovrà passare come argomenti le varie note e pesi. 
 * Il programma si occuperà di calcolare e stampare la nota finale.
 * @author Evan Sala
 * @version 11.08.2023
 */

public class TestModulo{
    public static void main(String[] args){
        double test1 = Double.parseDouble(args[0]);
        double test2 = Double.parseDouble(args[1]);
        double test3 = Double.parseDouble(args[2]);
        double test4 = Double.parseDouble(args[3]);
        double test5 = Double.parseDouble(args[4]);
        double p1 = Double.parseDouble(args[5]);
        double p2 = Double.parseDouble(args[6]);
        double nota = Math.pow((test1 * 0.10 + test2 * 0.15 + test3 * 0.20 + test4 * 0.25 + test5 * 0.3),(1+(p1+p2)));
        System.out.println(nota);
    }
}
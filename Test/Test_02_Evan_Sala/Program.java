/**
 * Porgramma che a dipendenza di ciò
 * che l'utente inserire viene generata 
 * una scachciera 
 * @author Evan Sala
 * @version 18.12.2023
 */

 public class Program{
   public static void main(String[] args){
      try{
         int righe = Integer.parseInt(args[0]);
         int colonne = Integer.parseInt(args[1]);
         String seleziona = args[2];
         Schacchiera chess = new Schacchiera(righe,colonne,seleziona);
         System.out.print(chess);
      }catch(NumberFormatException e){
         System.out.println("Valore inserito non valido!!");
      }
   }
 }
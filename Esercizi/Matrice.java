/**
 * Programma che vengono ricevuti due argomenti,
 * essi saranno la grandezza di una matrice che dovrà essere stampata,
 * al suo interno ci saranno numeri casuali tra 0 fino al primo argomento.
 * 
 * @author Evan Sala
 * @version 09.10.2023
 * 
 */

public class Matrice {
    public static void main(String[] args){
        try{
            int argomento1 = Integer.parseInt(args[0]);
            int argomento2 = Integer.parseInt((args[1]));
            int numero;
            int[][] matrice = new int [argomento1][argomento2];
            for(int i = 0; i < argomento1;i++){
                for(int j = 0; j < argomento2; j++){
                    numero = (int)(Math.random()*10);
                    if(numero <= argomento1){
                        matrice[i][j] = numero;
                    }else{
                        numero = (int)Math.random()*10;
                    }
                    System.out.print(matrice[i][j]);
                }
                System.out.println("");
            }
        }catch(NumberFormatException e){
            System.out.println("Valore non valido");
        }
        
    }
}

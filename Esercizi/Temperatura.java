/**
 * programma che scrive al terminale
 * la temperaura rilevata e rispetitvamente la media tra di esse
 * @author Evan Sala
 * @version 11.09.2023
 */

public class Temperatura{
    public static void main(String[] args){
        int temp1 = 10;
        int temp2 = 20;
        int temp3 = 22;
        int temp4 = 25;
        int temp5 = 28;
        int temp6 = 8;
        System.out.println("Temp 1 : "+ temp1);
        System.out.println("Temp 2 : "+ temp2);
        System.out.println("Temp 3 : "+ temp3);
        System.out.println("Temp 4 : "+ temp4);
        System.out.println("Temp 5 : "+ temp5);
        System.out.println("Temp 6 : "+ temp6);
        System.out.println("Media: "+ (temp1+temp2+temp3+temp4+temp5+temp6)/6);
        
    }
}
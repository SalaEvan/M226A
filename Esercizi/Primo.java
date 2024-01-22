import java.util.Scanner;
public class Primo {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Inserisci un numero intero positivo: ");
        int numero = Integer.parseInt(in.next());
        if(numero < 0){
            System.out.println("Numero non valido!!");
        }else{
            for(int i = numero; i > 0; i--){
                if(numero% i ==0 && i != numero || i != 0){
                    System.out.print(numero+" non è un numero primo!");
                    break;
                }else{
                    System.out.print(numero+" è un numero primo!");
                    break;
                }
            }
        }
    }
}

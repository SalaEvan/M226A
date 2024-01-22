import java.util.Scanner;
import java.util.InputMismatchException;

public class Program {

    public static void EsegueInformazioni(){
        Scanner in = new Scanner(System.in);
        System.out.print("Inserisci la grandezza del quadrato: ");
        int grandezza = in.nextInt();
        Square ret = new Square(grandezza);
        System.out.println(ret);
    }
    public static void main(String[] args){
        try{
            EsegueInformazioni();
            
        }catch(NumberFormatException e){
            System.out.println("ERRORE: Numeri inseriti non validi, RIPROVARE!! \n");
            EsegueInformazioni();
        }catch(InputMismatchException e){
            System.out.println("ERRORE: Numeri non inseriti, RIPROVARE!! \n");
            EsegueInformazioni();
        }
        
    }
}

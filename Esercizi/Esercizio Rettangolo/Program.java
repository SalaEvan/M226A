import java.util.Scanner;
import java.util.InputMismatchException;

public class Program {

    public static void EsegueInformazioni(){
        Scanner in = new Scanner(System.in);
        System.out.print("Inserisci la lunghezza del rettangolo: ");
        float lunghezza = in.nextFloat();
        System.out.print("Inserisci la altezza del rettangolo: "); 
        float altezza = in.nextFloat();
        Rettangolo ret = new Rettangolo(lunghezza,altezza);
        System.out.println("\n"+ret.DimensioneRettangolo());
        System.out.println(ret.StampaInformazioni()+"\n");
        ret.DisegnaRettangolo();
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

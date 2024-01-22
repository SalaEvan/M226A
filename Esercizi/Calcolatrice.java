import java.util.Scanner;
public class Calcolatrice {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Inserisci il primo numero: ");
        int numero1 = Integer.parseInt(in.next());
        System.out.print("Inserisci il secondo numero: ");
        int numero2 = Integer.parseInt(in.next());
        System.out.print("Inserisci l'operatore: ");
        String operatore = in.next();
        if(operatore.equals("*")){
            int somma = numero1*numero2;
            System.out.println(numero1+operatore+numero2+"=" +  somma);
        }else if(operatore.equals("+")){
            int somma = numero1+numero2;
            System.out.println(numero1+operatore+numero2+"=" +  somma);
        }else if(operatore.equals("-")){
            int somma = numero1-numero2;
            System.out.println(numero1+operatore+numero2+"=" + somma);
        }else{
            int somma = numero1/numero2;
            System.out.println(numero1+operatore+numero2+"=" + somma);
        }
        
    }
}

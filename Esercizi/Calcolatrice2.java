
import java.util.Scanner;    
/*
* programma che scrive al terminale il risultato
* dei valori che l'utente inserisce in base
* all'operatore scelto
*@Evan Sala
*/
public class Calcolatrice2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Inserisci il primo numero: ");
            double numero1 = scanner.nextDouble();
            System.out.print("Inserisci l'operatore (+, -, /, *): ");
            char operatore = scanner.next().charAt(0);
            System.out.print("Inserisci il secondo numero: ");
            double numero2 = scanner.nextDouble();
            double risultato = 0;
            boolean calcoloValido = true;

            switch (operatore) {
                case '+':
                    risultato = numero1 + numero2;
                    break;
                case '-':
                    risultato = numero1 - numero2;
                    break;
                case '*':
                    risultato = numero1 * numero2;
                    break;
                case '/':
                    if (numero2 != 0) {
                        risultato = numero1 / numero2;
                    } else {
                        System.out.println("Errore: Impossibile dividere per zero.");
                        calcoloValido = false;
                    }
                    break;
                default:
                    System.out.println("Errore: Operatore non valido.");
                    calcoloValido = false;
            }
            if (calcoloValido) {
                System.out.println("Risultato: " + risultato);
            }
        } catch (Exception e) {
            System.out.println("Errore: Input non valido. Assicurati di inserire numeri validi e un operatore corretto.");
        }
    }
}


import java.util.Scanner;
public class Linea {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Inserisci la lunghezza: ");
        int lunghezza = Integer.parseInt(in.next());
        System.out.print("Inserisci la direzione: ");
        int direzione = Integer.parseInt(in.next());
        if(direzione == 0){
            for(int i = 0; i < lunghezza; i++){
                System.out.println("* ");
            }
        }else{
            for(int i = 0; i < lunghezza; i++){
                System.out.print("* ");
            }
        }
    }
}

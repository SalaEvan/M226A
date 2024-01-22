package Esercizio_Cane;

public class Program {
    public static void main(String[] args) {
        Cane c = new Cane("Rintintin", "pastore", 300);
        System.out.println(c.getPeso());
        c.setPeso(15);
        System.out.println(c.getPeso());
        
    }
}

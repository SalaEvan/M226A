package Esercizio_Pokedex;

public class Program {
    public static void main(String[] args) {
        Pokedex pokedex1 = new Pokedex(5.0, "Rosso", 1, "Kanto", 32, 100);
        Pokedex pokedex2 = new Pokedex(6.0, "Blu", 2, "Johto", 64, 80);
        Pokedex pokedex3 = new Pokedex(7.0, "Verde", 3, "Hoenn", 128, 60);

        System.out.println("| Dimensione | Colore | Generazione | Regione | Memoria | Batteria |");
        System.out.println("|------------|--------|-------------|---------|---------|----------|");
        System.out.println("| " + pokedex1.getDimensione() + " | " + pokedex1.getColore() + " | " + pokedex1.getGenerazione() + " | " + pokedex1.getRegione() + " | " + pokedex1.getMemoria() + " | " + pokedex1.getBatteria() + " |");
        System.out.println("| " + pokedex2.getDimensione() + " | " + pokedex2.getColore() + " | " + pokedex2.getGenerazione() + " | " + pokedex2.getRegione() + " | " + pokedex2.getMemoria() + " | " + pokedex2.getBatteria() + " |");
        System.out.println("| " + pokedex3.getDimensione() + " | " + pokedex3.getColore() + " | " + pokedex3.getGenerazione() + " | " + pokedex3.getRegione() + " | " + pokedex3.getMemoria() + " | " + pokedex3.getBatteria() + " |");
    }
}

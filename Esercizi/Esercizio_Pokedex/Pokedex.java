package Esercizio_Pokedex;

public class Pokedex {
    private double dimensione;
    private String colore;
    private int generazione;
    private String regione;
    private int memoria;
    private int batteria;

    public Pokedex(double dimensione, String colore, int generazione, String regione, int memoria, int batteria) {
        this.dimensione = dimensione;
        this.colore = colore;
        this.generazione = generazione;
        this.regione = regione;
        this.memoria = memoria;
        this.batteria = batteria;
    }

    public void ricaricaPokedex() {
        System.out.println("La Pokedex è stata ricaricata.");
    }

    public void espandiMemoria() {
        System.out.println("La memoria della Pokedex è stata espansa.");
    }

    @Override
    public String toString() {
        return "Pokedex{" +
                "dimensione=" + dimensione +
                ", colore='" + colore + '\'' +
                ", generazione=" + generazione +
                ", regione='" + regione + '\'' +
                ", memoria=" + memoria +
                ", batteria=" + batteria +
                '}';
    }

    public double getDimensione() {
        return dimensione;
    }

    public void setDimensione(double dimensione) {
        this.dimensione = dimensione;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public int getGenerazione() {
        return generazione;
    }

    public void setGenerazione(int generazione) {
        this.generazione = generazione;
    }

    public String getRegione() {
        return regione;
    }

    public void setRegione(String regione) {
        this.regione = regione;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public int getBatteria() {
        return batteria;
    }

    public void setBatteria(int batteria) {
        this.batteria = batteria;
    }
}


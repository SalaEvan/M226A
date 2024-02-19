/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author evan.sala
 */
import java.util.*;
import java.io.*;

public class Player {
    public int point;
    /*
    * metodo che ritorna lo username
    * @return username
    */
    private String username;
    public String getUsername() {
        return username;
    }
    /*
    * inserire il valore alla variabile username
    * @param ussername valore che l'utente fornisce
    */
    public void setUsername(String username) {
        this.username = username;
    }
    /*
    * costruttore se l'uetne non inserisce niente
    */
    public Player (){
        username = "user";
    }
    /*
    * costruttore
    */
    public Player (String username){
        this.username = username;
        this.point = point;
    }
    /*
    * metodo ceh ritona il punteggio che ha effettuato l'utente
    * @return point
    */
    public int getScore(){
        return point;
    }
    /*
    * incrementa il punteggio dell'utente
    */
    public void IncrementPoint(){
        point+= 10;
    }
    /*
    * salva il giocatore nel file
    */
    public void savePlayerToFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("highscore.txt", true))) {
            writer.println(username + " " + point);
        } catch (IOException e) {
            System.err.println("Errore durante la scrittura del record di punteggio: " + e.getMessage());
        }
    }
    /*
    * legge il miglior giocatore dal file
    * return bestplayer se esiste se no non ritorna niente
    */
    public static String readBestPlayerFromFile() {
        try (Scanner scanner = new Scanner(new File("highscore.txt"))) {
            int maxScore = Integer.MIN_VALUE;
            String bestPlayer = "";

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(" ");
                String player = parts[0];
                int score = Integer.parseInt(parts[1]);

                if (score > maxScore) {
                    maxScore = score;
                    bestPlayer = player;
                }
            }

            return bestPlayer;
        } catch (FileNotFoundException e) {
            System.out.println("File non trovato.");
            return "";
        }
    }
    /*
    * stampa il miglior player in cui ha totalizzato 
    * il maggior numero di punteggio
    */
    public static void printBestPlayer() {
        try (Scanner scanner = new Scanner(new File("highscore.txt"))) {
            int maxScore = Integer.MIN_VALUE;
            String bestPlayer = "";

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(" ");
                String player = parts[0];
                int score = Integer.parseInt(parts[1]);

                if (score > maxScore) {
                    maxScore = score;
                    bestPlayer = player;
                }
            }
            System.out.print(Color.getReset()+"\n"+ "Miglior Punteggio --> ");
            System.out.print(Color.getBlue()+maxScore);
            System.out.print(Color.getReset()+" del giocatore: ");
            System.out.print(Color.getBlue()+ bestPlayer+"\n");
        } catch (FileNotFoundException e) {
            System.out.println("File non trovato.");
        }
    }
}

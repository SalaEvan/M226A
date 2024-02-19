/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 * 
 * Programma che riceve dal''utente la grandezza di una matrice
 * successivamente l'utente inserisc edelle cordinate che corrispondono
 * alla posizioine della matrice
 * all'interno della matrice ci stanno dei fiori
 * se l'utente li becca perde
 * 
 * @author evan.sala
 * @version 10.01.2024
 */
import java.util.*;

public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(Color.getCyan() + "Enter your username: ");
        String username = in.next();
        Player player = new Player(username);
        Table table = null;

        int dimension = 0;
        boolean validDimension = false;

        while (!validDimension) {
            try {
                System.out.println(Color.getCyan() + "Enter dimension: ");
                dimension = Integer.parseInt(in.next());

                if (dimension > 0) {
                    validDimension = true;
                } else {
                    System.out.println(Color.getRed() + "Inserisci una dimensione valida (almeno 1): ");
                }
            } catch (NumberFormatException e) {
                System.out.println(Color.getRed() + "Inserisci una dimensione valida: ");
            }
        }

        String difficulty = "";
        while (!difficulty.equals("facile") && !difficulty.equals("medio") && !difficulty.equals("difficile")) {
            System.out.println(Color.getCyan() + "Enter difficulty (facile, medio, difficile): ");
            difficulty = in.next().toLowerCase();

            if (!difficulty.equals("facile") && !difficulty.equals("medio") && !difficulty.equals("difficile")) {
                System.out.println(Color.getRed() + "Difficolta' inserita non valida!!");
            }
        }

        table = new Table(dimension, difficulty, player, 0, 0);

        boolean game = true;

        System.out.println("\n" + Color.getPurple() + "Welcome to Prato Fiorito" + "\n");
        Sound.play("Game.wav");

        Scanner value = new Scanner(System.in);

        while (game) {
            try {
                System.out.println("\n" +Color.getCyan() + "Enter the x coordinates: ");
                int row = Integer.parseInt(value.next());
                System.out.println(Color.getCyan() + "Enter the y coordinates: ");
                int column = Integer.parseInt(value.next());
                System.out.println();
                table.setRow(row);
                table.setColumn(column);
                table.modifyField();
                game = table.checkCondition();
            } catch (InputMismatchException e) {
                System.out.println(Color.getRed() + "Coordinate Inserite non valide!!");
                System.out.println(Color.getYellow() + "Riavvia il gioco");
                break;
            } catch (ArrayIndexOutOfBoundsException ae) {
                System.out.println("Valore inserito non valido!!");
            }
        }
        in.close();
        value.close();
    }
}




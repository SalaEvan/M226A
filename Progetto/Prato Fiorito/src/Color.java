/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * classe che contiene alcuni colori per il coloramento delle stringhe.
 * @author salae
 */
public class Color {
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_BLACK = "\u001B[30m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_WHITE = "\u001B[37m";
    private static final String ANSI_ORANGE = "\u001B[34m";
    
    /*
    * metodo che ritorna il colore di default
    * @return ANSI_RESET
    */
    public static String getReset() {
        return ANSI_RESET;
    }
    /*
    * metodo che ritorna il colore nero
    * @return ANSI_BLACK
    */
    public static String getBlack() {
        return ANSI_BLACK;
    }
    /*
    * metodo che ritorna il colore rosso
    * @return ANSI_RED
    */
    public static String getRed() {
        return ANSI_RED;
    }
    /*
    * metodo che ritorna il colore verde
    * @return ANSI_GREEN
    */
    public static String getGreen() {
        return ANSI_GREEN;
    }
    /*
    * metodo che ritorna il colore giallo
    * @return ANSI_YELLOW
    */
    public static String getYellow() {
        return ANSI_YELLOW;
    }
    /*
    * metodo che ritorna il colore blu
    * @return ANSI_BLUE
    */
    public static String getBlue() {
        return ANSI_BLUE;
    }
    /*
    * metodo che ritorna il colore viola
    * @return ANSI_PURPLE
    */
    public static String getPurple() {
        return ANSI_PURPLE;
    }
    /*
    * metodo che ritorna il colore azzurro
    * @return ANSI_CYAN
    */
    public static String getCyan() {
        return ANSI_CYAN;
    }
    /*
    * metodo che ritorna il colore bianco
    * @return ANSI_WHITE
    */
    public static String getWhite() {
        return ANSI_WHITE;
    }
    /*
    * metodo che ritorna il colore arancione
    * @return ANSI_ORANGE
    */
    public static String getOrange() {
        return ANSI_ORANGE;
    }
}

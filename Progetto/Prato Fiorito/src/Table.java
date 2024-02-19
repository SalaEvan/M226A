/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * 
 * @author evan.sala
 */
import java. util.*;

public class Table {
    private String flower = "* "; 
    private String hiddenCell ="# ";
    private String miss ="  "; 
    
    
    /*
    * metodo che ritorna la dimensione del campo.
    * @return dimension
    */
    private int dimension;
    public int getDimension() {
        return dimension;
    }
    /*
    * metodo che inserisce  la dimensione del campo.
    * @param dimension valore che l'utente fornisce.
    */
    public void setDimension(int dimension) {
        Scanner in = new Scanner(System.in);
        if(dimension < 8 && dimension > 0){
            System.out.println(Color.getRed()+"Dimensione inserita inferiore a 8!!");
            System.out.print(Color.getCyan() +"Enter dimension: ");
            dimension = Integer.parseInt(in.next());
        } 
        if(dimension < 0){
            System.out.println(Color.getRed()+"Dimensione inserita inferiore a 0!!");
            System.out.print(Color.getCyan() +"Enter dimension: ");
            dimension = Integer.parseInt(in.next());
        }
        this.dimension = dimension;
        
    }
    /*
    * metodo che ritorna la coordinata x.
    * @return row
    */
    private int row;
    public int getRow() {
        return row;
    }

    /*
    * metodo ceh inserisce la cordinata x.
    * @param row  valore che l'utente fornisce.
    */
    public void setRow(int row) {
        Scanner in = new Scanner(System.in);
        if(row < 1){
            System.out.println(Color.getRed()+"Valore inserito inferiore di 1");
            System.out.print(Color.getCyan() +"Enter the x coordinates: ");
            row = Integer.parseInt(in.next());
        } 
        if(row > dimension){
            System.out.println(Color.getRed()+"Valore inserito superiore alla dimensione");
            System.out.print(Color.getCyan() +"Enter the x coordinates: ");
            row = Integer.parseInt(in.next());
        }
        this.row = row-1;
    }
    /*
    * metodo che ritorna la coordinata y.
    * @return column
    */
    private int column;
    public int getColumn() {
        return column;
    }
    /*
    * metodo che inserisce il valore della coordinata y.
    * @param colum valore che l'utente fornisce
    */
    public void setColumn(int column) {
        Scanner in = new Scanner(System.in);
        if(column < 1){
            System.out.println(Color.getRed()+"Valore inserito inferiore di 1");
            System.out.print(Color.getCyan() +"Enter the y coordinates: ");
            column = Integer.parseInt(in.next());
        } 
        if(column > dimension){
            System.out.println(Color.getRed()+"Valore inserito superiore alla dimensione");
            System.out.print(Color.getCyan() +"Enter the y coordinates: ");
            column = Integer.parseInt(in.next());
        }
        this.column = column-1;
    }
    /*
    * metodo che ritorna la difficolta'.
    * @return difficulty
    */
    private String difficulty;
    public String getDifficulty() {
        return difficulty;
    }
    /*
    * metodo che inserisce la difficolta'.
    * @param difficulty valore che l'utente fornisce
    */
    public void setDifficult(String difficulty) {
        Scanner in = new Scanner(System.in);
        difficulty = difficulty.toLowerCase();
        if(difficulty.equals("facile" )|| 
                difficulty.equals("medio") || 
                difficulty.equals("difficile")){
            this.difficulty = difficulty;
            
        }else{
            System.out.println(Color.getRed()+"Difficola' inserita non valida !!");
            System.out.print(Color.getCyan() +"Enter difficolta': ");
            difficulty = in.next();
        }
        this.difficulty = difficulty;
        
        
    }
    
    private String [][] lawn;
    private String [][] hiddenLawn;
    Random rn = new Random();
    private int randomRow;
    private int randomColumn;
    private int mines;
    private Player plyr;
    private boolean fieldInitialized = false;
    /*
    * costruttore se non vengono passati parametri
    */
    public Table(){
        dimension = 8;
    }
    /*
    * costrutture 
    */
    public Table(int dimension, String difficulty, Player player, int row, int column){
        this.dimension = dimension;
        this.difficulty = difficulty;
        setMines();
        lawn = new String[dimension][dimension];
        hiddenLawn = new String[dimension][dimension];
        this.plyr = player;
        this.row = row;
        this.column = column;
        initializeField();
    }
    /*
    * a dipendenza della difficolta vengono settati quanti mine ha il prato
    */
    private void setMines(){
      mines = (int)Math.pow(dimension, 2);
        switch (difficulty) {
            case "facile":
                mines *= 0.15;
                break;
            case "medio":
                mines *= 0.25;
                break;
            case "difficile":
                mines *= 0.4;
                break;
            default:
                break;
        }
      
    }
    /*
    * creazione del prato che l'utente vede all'inizio
    */
    
    private void field(){
        for(int i = 0; i < dimension; i++){
            for( int j = 0; j < dimension; j++){
                lawn[i][j] = hiddenCell;
            }      
        }
    }
    /*
    * ceazione del prato con le mine in posizioni casuali
    */
    
    private void hiddenField() {
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                hiddenLawn[i][j] = miss;
            }
        }
        for (int count = 0; count < mines; count++) {
            randomRow = rn.nextInt(dimension);
            randomColumn = rn.nextInt(dimension);
            if (!hiddenLawn[randomRow][randomColumn].equals(flower)) {
                hiddenLawn[randomRow][randomColumn] = flower;
            }
        }
    }
    /*
    * si assicura di mantenere i valori precedenti
    */
    
    private void initializeField() {
        if (!fieldInitialized) {
            field();
            hiddenField();
            fieldInitialized = true;
        }
    }
    /*
    * verifica se l'utente  ha beccato un fiore, cosi
    * il ciclo while true viene terminato
    * @return check valore booleano per il ciclo while
    */
    public boolean checkCondition(){
        boolean check = true;
        if(hiddenLawn[row][column].equals(flower)){
            check = false;
        }
        return check;
    }
    /*
    * sostituisce in base alla coordinata inserita il campo che vede l'utente
    * con il campo che ci sono le mine
    */
    public void modifyField() {
        if (lawn[row][column].equals(miss)) {
            System.out.println(Color.getRed()+"Coordinate gia' inserite!!");
        } else if (hiddenLawn[row][column].equals(flower)) {
            lawn[row][column] = flower;
            printField();
            System.out.println("\n"+Color.getPurple()+"GAME OVER!!");
            System.out.println(Color.getGreen()+"Usernsame: "+plyr.getUsername());
            System.out.println(Color.getGreen()+"Score: "+ plyr.getScore());
            plyr.savePlayerToFile(); 
            Player.printBestPlayer();
        } else if (hiddenLawn[row][column].equals(miss)) {
            plyr.IncrementPoint();
            lawn[row][column] = hiddenLawn[row][column];
            printField();
        }
            
            
    }
    /*
    * printa il campo di gioco
    */
    public void printField() {
        for (String[] row : lawn) {
            for (String cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}


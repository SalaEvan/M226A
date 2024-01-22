/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * 
 * @author evan.sala
 */
public class Table {
    private String flower = "\\u1F33C "; 
    private String hiddenCell ="? ";
    private String miss ="\\u2700 "; 
    // Getter e Setter  delle variabili dimension, row, column
    private int dimension;
    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }
    
    private int row;
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }
    
    private int column;
    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
    private String [][] field = new String[dimension][dimension];
    
    public Table(){
        dimension = 8;
    }
    public Table(int dimension){
        this.dimension = dimension;
    }
    
}

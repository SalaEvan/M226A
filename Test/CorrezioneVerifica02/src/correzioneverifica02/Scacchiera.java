package correzioneverifica02;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author evan.sala
 */
import java.util.*;
public class Scacchiera {
    //attributi della clase chacchiera
    private int righe;
    private int colonne;
    private String selezione;
    private String [][]scacchiera = new String[righe][colonne];
    private String coloreDispari;
    private String colorePari;
    private String [] alfabeto = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    Random colore = new Random();

    /*
     * ritorna il parametro righe
     */
    public int getRighe(){
        return righe;
    }
    /*
     * verifica se il numero inserito per 
     * le righe è valido
     */
    public void setRighe(int righe){
        if(righe == 0){
            righe = 5;
        }
        if(righe > 50 && righe < 4){
            System.out.println("Valore inserito superiore 50 opp inferiore 4");
            System.out.print("Valore default = 5");
            righe = 5;
        }else{
            this.righe = righe;
        }

    }
    /*
     * ritorna il paramentro colonne
     */
    public int getColonne(){
        return colonne;
    }
    /*
     * verifica se il numero inserito per 
     * le colonne è valido
     */
    public void setColonne(int colonne){
        if(colonne == 0){
            colonne = 5;
        }
        if(colonne > 50 && colonne < 4){
            System.out.println("Valore inserito superiore 50 opp inferiore 4");
            System.out.print("Valore default = 5");
            colonne = 5;
        }else{
            this.colonne = colonne;
        }
        
    }
    /*
     * ritorna selezione
     */
    public String getSelezione(){
        return selezione;
    }
    /*
     *  verifica quale indicizazzione scegliere 
     */
    public void setSelezione(String selezione){
        if(selezione.equals("")){
            selezione = "2";
        }else{
            int temp = Integer.parseInt(selezione);
            if(temp > 2){
                selezione  ="2";
            }
            this.selezione = selezione;
        }
    }
    // Costruttore di default
    public Scacchiera(){
        righe = 5;
        colonne = 5;
        selezione = "2";
    }
    // costruttore
    public Scacchiera(int righe,int colonne, String selezione){
        setRighe(righe);
        setColonne(colonne);
        setSelezione(selezione);
    }
    
}

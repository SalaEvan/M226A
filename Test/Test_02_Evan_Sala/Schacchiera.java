/*
 * classe che genera la schiacchiera
 */
import java.util.*;
public class Schacchiera{
    //attributi della clase chacchiera
    private int righe;
    private int colonne;
    private String selezione;
    private String [][]schiacchiera = new String[righe][colonne];
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
    public Schacchiera(){
        righe = 5;
        colonne = 5;
        selezione = "2";
    }
    // costruttore
    public Schacchiera(int righe,int colonne, String selezione){
        this.righe = righe;
        this.colonne = colonne;
    }
    /*
     * prende randomicamente un colore per 
     * le celle dispari e pari
     */
    public void colore(){
        int selezionaColoreX = colore.nextInt(1,4);
        int selezionaColoreY = colore.nextInt(1,4);
        switch (selezionaColoreX){
            case 1:
                coloreDispari = "B";
                break;
            case 2:
                coloreDispari = "N";
                break;
            case 3:
                coloreDispari = "R";
                break;

        }
        switch (selezionaColoreY){
            case 1:
                colorePari = "B";
                break;
            case 2:
                colorePari = "N";
                break;
            case 3:
                colorePari = "R";
                break;

        }
    }
    /*
     * crea la schiacchiera con i valori ch l'utente ha inserito
     * nelle celle viene inserito la posizione 
     * e il colore randomicamente scelto
     * colore fatto uno si e uno no come scacchi
     */
    public String creazioneScacchiera(){
        int count = 0;
        for(int i = 0; i < righe;i++){
            for(int j = 0; j < colonne; j++){
                if(righe == 0 || colonne == 0){
                    if(selezione.equals(1)){
                        schiacchiera[righe][colonne]= (str)(count+1);
                    }else{
                        if(count >26){
                            count = 0;
                        }
                        schiacchiera[righe][colonne]= alfabeto[count];
                    }
                }
                if(righe%2 != 0 || colonne%2 != 0){
                    schiacchiera[righe][colonne] = coloreDispari+schiacchiera[righe][0]+schiacchiera[0][colonne];
                }else{
                    schiacchiera[righe][colonne] = colorePari+schiacchiera[righe][0]+schiacchiera[0][colonne];
                }
            }
            count++;
        }
    }
    /*
     * modifica il contenuto della schachciera se contiene la lettera "a"
     */
    public String modificaScacchiera(){
        int count = 0;;
        for(int i = 0; i < righe;i++){
            for(int j = 0; j < colonne; j++){
                String chess = schiacchiera[righe][colonne];
                for(int l = 0; i < chess.length;l++){
                    if(chess[l] = "a"){
                        if( righe%2 != 0 || colonne%2 != 0){
                            chess[l] = coloreDispari+"-"+schiacchiera[0][colonne];
                            schiacchiera[righe][colonne] =chess[l];
                        }else{
                            chess[l] = colorePari+"-"+schiacchiera[0][colonne];
                            schiacchiera[righe][colonne] =chess[l];
                        }
                        
                    }
                }
            }
        }
    }
    @Override
    public String toString() {
        String stampa ="";
        for(int i = 0; i < righe;i++){
            for(int j = 0; j < colonne; j++){
                stampa = schiacchiera[righe][colonne];
            }
            stampa +="\n";
        }
        return stampa;
    }
}
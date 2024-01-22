import java.util.*;
public class PacNum{

    //attributi
    private int selezionaMatrice;
    private int dimensione;
    private int [][] matrice = new int [dimensione][dimensione];
    Random gen = new Random();
    private int randomX = gen.nextInt(0,matrice.length);
    private int randomY = gen.nextInt(0,matrice.length);
    private int value = gen.nextInt(1,5);

    //Getter e Setter per selezionaMatrice e dimensione
    public int GetSelezionaMatrice(){
        return selezionaMatrice;
    }
    public void SetSelezionaMatrice(int selezionaMatrice){
        if(selezionaMatrice < 1 || selezionaMatrice > 2){
            Scanner in = new Scanner(System.in);
            System.out.print("Valore inserito non valido selezionare [1] o [2], Riprovare !!");
            selezionaMatrice = in.nextInt();
        }
        this.selezionaMatrice = selezionaMatrice;
    }
    public int GetDimensione(){
        return dimensione;
    }
    public void SetDimensione(int dimensione){
        if(dimensione < 1){
            Scanner in = new Scanner(System.in);
            System.out.print("Valore inserito per la dimensione non valido, Riprovare!!");
            dimensione = in.nextInt();
        }
        this.dimensione = dimensione;
    }

    //Costruttori
    public PacNum(){
        dimensione = 0;
        selezionaMatrice = 1; 
    }
    public PacNum(int dimensione, int selezionaMatrice){
        this.SetSelezionaMatrice(selezionaMatrice);
        this.SetDimensione(dimensione);
    }

    // cambia la posizione in base al valore diverso dagli zero

    public void step(){
        int tempX = 0;
        int tempY = 0;
        switch(value){
            case 1:
                if(randomX == 0){
                    tempX = dimensione-1;
                }else{
                    tempX = randomX-1;
                }
                tempY = randomY;
                break;
            case 2:
                if(randomX == dimensione-1){
                    tempX = 0;
                }else{
                    tempX = randomX+1;
                }
                tempY = randomY;
                break;
            case 3:
                if(randomY == 0){
                    tempY = dimensione-1;
                }else{
                    tempY = randomY-1;
                }
                tempX = randomX;
                break;
            case 4:
                if(randomY == dimensione-1){
                    tempY = 0;
                }else{
                    tempY = randomY+ 1;
                }
                tempX = randomX;
                break;
        }
        matrice[tempX][tempY] = value;
        matrice[randomX][randomY] = 0;
    }
    /*
     * metodo che stampa la matrice
     */
    public void print(){
        for(int i = 0; i < matrice[0].length; i++){
            for(int j = 0; j < matrice[1].length; j++){
                System.out.print(matrice[i][j]);
            }
            System.out.println("");
        }
    }
    /*
     * metodo che popola randomicamente la matrice
     */
    public void populateRandom(){
        for(int i = 0; i < matrice[0].length; i++){
            for(int j = 0; j < matrice[1].length; j++){
                matrice[i][j] = gen.nextInt(1,5);
                System.out.print(matrice[i][j]);
            }
            System.out.println();
        }
    }
    /* 
     * metodo che popola con degli 0 la matrice 
     * e solo una cella randomicamente sia la posizione 
     * che il suo valore ( tra 1 e 4)
     */
    public void populate(){
        for(int i = 0; i < matrice[0].length; i++){
            for(int j = 0; j < matrice[1].length; j++){
                matrice[i][j] = 0;
                if(i == randomX && j == randomY){
                    matrice[i][j] = value;
                    System.out.print(matrice[i][j]);
                }
                System.out.println();
            }
        }
    }
}
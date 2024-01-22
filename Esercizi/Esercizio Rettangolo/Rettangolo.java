
public class Rettangolo {
    public float lunghezza;
    public float altezza;

    public Rettangolo(){     
        lunghezza = 0;
        altezza = 0;
    }

    public Rettangolo(float lunghezza, float altezza){     
        this.lunghezza = lunghezza;
        this.altezza = altezza;

    }
    
    public float CalcolaArea(){
        float area = lunghezza*altezza;
        return area;
    }
    
    public float CalcolaPerimetro(){
        float perimetro = (lunghezza*2)+(altezza*2);
        return perimetro;
    }
    
    public void DisegnaRettangolo(){
        for(float i = 0; i < lunghezza; i++){
            for(float j = 0; j < altezza; j++){
                System.out.print("* ");
            } 
            System.out.print("\n");
        }
    }
    
    public String DimensioneRettangolo(){
        String dimensioneRet = "Dimensione: "+lunghezza +" X "+altezza;
        return dimensioneRet;
    }
    
    public String StampaInformazioni(){
        String informazioni = "Area: "+ CalcolaArea() +"\n"+"Perimetro: "+ CalcolaPerimetro();
        return informazioni;
    }
}

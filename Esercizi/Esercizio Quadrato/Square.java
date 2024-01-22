
public class Square {
    public int side;

    public Square(){     
        side = 0;
    }

    public Square(int side){     
        this.side = side;
    }
    
    public int getArea(){
        int area = (int)Math.pow(side,2);
        return area;
    }
    
    public int getPerimetro(){
        int perimetro = side * 4;
        return perimetro;
    }
    
    public String Draw(){
        String quadrato ="";
        for(float i = 0; i < side; i++){
            for(float j = 0; j < side; j++){
                if (i == 0 || i == side - 1 || j == 0 || j == side - 1) {
                    quadrato +="* ";
                } else {
                    quadrato +="  ";
                }
                
            } 
            quadrato +="\n";
        }
        return quadrato;
    }
    
    public String getDimension(){
        String dimensioneRet = "Dimensione: "+side +" X "+side;
        return dimensioneRet;
    }
    
    public String StampaInformazioni(){
        String informazioni = "Area: "+ getArea() +"\n"+"Perimetro: "+ getPerimetro();
        return informazioni;
    }
    @Override
    public String toString() {
        String info = StampaInformazioni();
        String dimension = getDimension();
        String quadrato = Draw();
        return "\n"+dimension +"\n"+ info+"\n\n"+quadrato;
    }
}


public class ArrayPrimi {
    public static void main(String[] args){
        int [] numero = {2,5,4,6,8,7,9};
        for(int i = 0; i < numero.length; i++){
            if(numero[i]%2 !=0 && numero[i]%2 !=numero[i]){
                System.out.print(numero[i]);
            }
        }
    }
}


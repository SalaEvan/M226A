public class ArrayNumeri {
    public static void main(String[]args){
        int [] numero = {2,5,4,6,8,7,9,0,7,9,0,96,4};
        int count = 0;
        for(int i = 0; i < numero.length; i++){
            if(numero[i] == 0){
                count++;
            }
        }
        System.out.println("Lo zero è presente"+ count);
    }
}

public class ConfrontaStringhe {
    public static void main(String[] args) {
        String temp;
        String [] array = new String[args.length]; 
        for(int i = 0; i < args.length; i++){
            array[i] = args[i];
        } 
        for(int i = 0; i < args.length; i++ ) {
            for(int j = i; j < args.length; j++) {
                if(array[i].length() < array[j].length()) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                 }
             }
         }
        for(String s : args){
            System.out.print(s + " ");
        }
    }
}
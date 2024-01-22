public class TrovaVocali {
    public static void main(String[] args){
        String testo = "doraemon";
        char[] vocali = new char[testo.length()];
        for(int i = 0; i <testo.length();i++){
            if(testo.charAt(i) == 'a' || testo.charAt(i) == 'e' || testo.charAt(i) == 'i' || testo.charAt(i) == 'o' || testo.charAt(i) == 'u'){
                if(testo.charAt(i) != vocali[i]){
                    vocali[i] = testo.charAt(i);
                }
                
            }
        }
        for(int j = 0; j <vocali.length;j++){
            System.out.print(vocali[j]);
        }
    }
    

}

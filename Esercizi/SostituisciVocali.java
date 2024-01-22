public class SostituisciVocali {
    public static void main(String[] args){
        String testo = "doraemon";
        char argomento1 = args[0].charAt(0);
        char argomento2 = args[1].charAt(0);
        char[] vocali = new char[testo.length()];
        for(int i = 0; i <testo.length();i++){
            vocali[i] = testo.charAt(i);
        }
        for(int i = 0; i <vocali.length;i++){
            if(vocali[i] == argomento1){
                vocali[i] = argomento2;
            }
            System.out.print(vocali[i]);
        }
    }
}

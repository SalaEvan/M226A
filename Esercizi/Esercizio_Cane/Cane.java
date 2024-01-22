package Esercizio_Cane;

public class Cane {
    private String nome;
    private String razza;
    private int peso;
    private boolean pulci;

    public Cane(String nome, String razza, int peso){
        this.nome = nome;
        this.razza = razza;
        this.peso = peso;
        setPeso(peso);
    }
    public String getNome(){
            return nome;
        }
    public String getRazza(){
        return razza;
    }
    public int getPeso(){
        return peso;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setRazza(String razza){
        this.razza = razza;
    }
    public void setPeso(int peso){
        if(peso >0){
            this.peso = peso;
        }
    }
    public boolean isPulci() {
        return pulci;
    }
    public void setPulci(boolean pulci) {
        this.pulci = pulci;
    }
    public boolean hasPulci(){
        return pulci;
    }

}

package atividade;

public class Automovel {


    int roda;
    String cor;

    public  Automovel (String cor, int roda){
        this.cor=cor;
        this.roda=roda;
    }

    public int getRoda() {
        return roda;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setRoda(int roda) {
        this.roda = roda;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "cor:"+this.cor+"rodas:"+this.roda;
    }
}

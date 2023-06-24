package P;

public class Cliente extends Pessoas{


    private double ValorDivida;
    private int anoNas;



    public Cliente (String nome , int idade , double valor , int ano){
        super(nome,idade);
        this.anoNas = ano;
        this.ValorDivida= valor;

    }

    public double getValorDivida() {
        return ValorDivida;
    }

    public void setAnoNas(int anoNas) {
        this.anoNas = anoNas;
    }

    public int getAnoNas() {
        return anoNas;
    }

    public void setValorDivida(double valorDivida) {
        ValorDivida = valorDivida;
    }


    @Override
    public String toString() {

       return super.toString()+ "\nValor da divida:"+this.ValorDivida+ "\n Ano de nascimento"+this.anoNas;
    }
}

package P;

public class Vendendor extends Empregado {

    private  double valorVendas;


    private  int quantVendas;



    public Vendendor (String nome , int idade , double salario ,
                      String matri, double valorVendas , int quantVendas){

        super(nome,idade,salario,matri);
        this.quantVendas= quantVendas;
        this.valorVendas = valorVendas;
    }


    public double getValorVendas() {
        return valorVendas;
    }

    public int getQuantVendas() {
        return quantVendas;
    }

    public void setQuantVendas(int quantVendas) {
        this.quantVendas = quantVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }


    @Override
    public String toString() {

        return super.toString() + "\nvalor das vendas :"+ this.valorVendas + "\nquantidade das vendas:"+ this.quantVendas;
    }

}

package eexec2;

public class Cliente extends Pessoa {



    private double valordivida;
    private int anonascimento;

    public Cliente(String nome , String idade , String sexo){
        super(nome,idade,sexo);
    }

    public double getValordivida() {
        return valordivida;
    }

    public int getAnonascimento() {
        return anonascimento;
    }

    public void setAnonascimento(int anonascimento) {
        this.anonascimento = anonascimento;
    }

    public void setValordivida(double valordivida) {
        this.valordivida = valordivida;
    }

    @Override
    public String toString() {
        return super.toString()+"\nvalor de divida "+getValordivida()+"\n Ano nascimento:"+getAnonascimento();
    }
}
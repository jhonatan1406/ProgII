package P;

public abstract class Empregado extends Pessoas {



    private double salario;
    private String mstricula;


    public Empregado (String nome , int idade , double salario , String matri){
        super(nome,idade);
        this.mstricula= matri;
        this.salario= salario;


    }

    public double getSalario() {
        return salario;
    }

    public void setMstricula(String mstricula) {
        this.mstricula = mstricula;
    }

    public String getMstricula() {
        return mstricula;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {


        return super.toString() + "\nmatricula:" + this.mstricula + "\n salario:"+this.salario;

    }
}

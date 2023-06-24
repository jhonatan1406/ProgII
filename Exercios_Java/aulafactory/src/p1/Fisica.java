package p1;

public class Fisica extends  Pessoa{

    String cpf;

    protected Fisica (String nome, String end, String cpf){
        super(nome,end);
        this.cpf=cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return super.toString()+"\ncpf:"+this.cpf;
    }
}

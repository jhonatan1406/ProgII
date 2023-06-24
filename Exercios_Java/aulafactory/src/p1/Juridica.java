package p1;

public class Juridica extends Pessoa {


    int cnpj;


    protected   Juridica (String nome, String end, int cnpj){
        super(nome,end);
        this.cnpj=cnpj;

    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return super.toString()+"\n cnpj:"+this.cnpj;
    }
}

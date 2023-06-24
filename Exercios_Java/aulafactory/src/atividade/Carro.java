package atividade;

public class Carro extends Automovel {


    int porta;

    public  Carro (String cor , int rodas ){
        super(cor,rodas);

    }

    @Override
    public String toString() {
        return "AUTOMOVEL IGUAL A CARRO\n"+super.toString()"\n";
    }
}

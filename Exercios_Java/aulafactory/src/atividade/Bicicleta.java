package atividade;

public class Bicicleta extends  Automovel{

    int marcha ;

    public Bicicleta(String cor , int rodas){
        super(cor,rodas);
    }

    @Override
    public String toString() {
        return "AUTOMOVEL BICLETA\n"+ super.toString()"\n";
    }
}

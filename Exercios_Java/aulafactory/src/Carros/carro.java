package Carros;

import atividade.Carro;

public abstract class carro {


    protected  String montadora;

    public Carro(String  montadora){
        this.montadora=montadora;
    }

    public abstract  getNome();

    @Override
    public String toString() {
        return ""+this.montadora+"Modelo:";
    }
}

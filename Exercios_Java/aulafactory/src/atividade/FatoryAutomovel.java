package atividade;

import java.util.ArrayList;
import java.util.Scanner;

public class FatoryAutomovel {
    public  static  ArrayList Cria (String cor , int rodas){
        ArrayList<Automovel> listaAutomvel = new ArrayList<Automovel>();
        if (rodas == 4){
            Automovel a1= new Carro(cor,rodas);
            listaAutomvel.add(a1);
            return listaAutomvel;
        } else if (rodas==2){
            Automovel b1 = new Bicicleta(cor,rodas);
            listaAutomvel.add(b1);
            return listaAutomvel;

        }
        else {
            return  null;

        }

    }


}

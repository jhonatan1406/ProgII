package questao02;

import java.util.ArrayList;

public class controlador {


    public static void main (String [] args){


        ArrayList<CartaoWeb> listaCartao = new ArrayList<CartaoWeb>();

        Natal n1 = new Natal("jose");
        Aniversario A1= new Aniversario("maria");
        DiasDosNamorados D1= new DiasDosNamorados("jhon");

        listaCartao.add(n1);
        listaCartao.add(D1);
        listaCartao.add(A1);

        for(CartaoWeb L : listaCartao){
            L.showMessage();
        }




    }
}

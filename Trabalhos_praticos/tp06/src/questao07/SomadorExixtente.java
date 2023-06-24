package questao07;

import java.util.List;

public class SomadorExixtente {
    public  int somaLista(List<Integer> lista){
        int resultado=0;
        for (int i: lista){
            resultado+=i;
            return resultado;
        }
    }
}

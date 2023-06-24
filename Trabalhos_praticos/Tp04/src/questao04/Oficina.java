package questao04;

import java.util.Random;

public class Oficina {




    public  Veiculo proximo(){
        Random R = new Random();
        int  num = R.nextInt(2);
        if(num==0){
            return new Automovel();
        }
        else{
            return new Bicicleta();
        }
    }
    public void manutencao (Veiculo v){
        v.ajustar();
        v.limpar();
        v.listarVerificacoes();
    }

}

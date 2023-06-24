package questao04;
import java.util.Random;
public class Automovel extends Veiculo {

    @Override
    public void listarVerificacoes(){

        System.out.println("Verificando componentes do automovel");
    }


    @Override
    public void ajustar (){
        System.out.println("Ajutando... AUtomovel");

    }

    @Override
    public void limpar(){
        System.out.println("Limpando... Automovel");
    }
    @Override
    public void Mudaroleo (){
        System.out.println("Mudou oleo..");
    }

}

package questao04;

public class Bicicleta extends Veiculo{


    @Override
    public  void listarVerificacoes(){
        System.out.println("Verificando componentes da Biciletaa");
    }


    @Override
    public  void ajustar (){
        System.out.println("Ajutando BIcicleta...");

    }

    @Override
    public void limpar(){
        System.out.println("Limpando Bicicleta...");
    }

    @Override
    public void Mudaroleo (){
        System.out.println("Mudou oleo..");
    }
}

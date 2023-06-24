package questao04;
import P1.Pessoa;
public class Teste {

    public static void main(String[] args) {
         Veiculo v1 = new Veiculo();
         Pessoa p1 = new Pessoa("jhon");
         p1.setS(Sexo.MASCULINO);













        Oficina o = new Oficina();
        Veiculo v;

        for(int i=0;i<4;i++){
            v=o.proximo();
            o.manutencao(v);
        }


    }
}

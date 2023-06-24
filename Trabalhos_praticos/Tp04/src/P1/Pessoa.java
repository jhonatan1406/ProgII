package P1;
import  questao04.*;
public class Pessoa implements Sexo {

   private  String nome;
   private Sexo s;

   public Pessoa (String nome ){
       this.nome=nome;

   }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Sexo getS() {
        return s;
    }

    public void setS(Sexo s) {
        this.s = s;
    }
}

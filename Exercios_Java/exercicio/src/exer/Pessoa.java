package exer;

public abstract class Pessoa  {


    private String nome;
    private  String idade;
    private  Sexo s;

    public Pessoa (String nome , Sexo s){
        this.nome=nome;
        this.s=s;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setS(Sexo s) {
        this.s = s;
    }

    public Sexo getS() {
        return s;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getIdade() {
        return idade;
    }
}

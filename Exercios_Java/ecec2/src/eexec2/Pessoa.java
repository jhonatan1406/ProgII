package eexec2;

public abstract class Pessoa {

    private String nome;
    private String idade;
    private String s;



    public Pessoa (String nome , String idade , String s){
        this.nome=nome;
        this.idade=idade;
        this.s=s;


        }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getIdade() {
        return idade;
    }

    public void setS(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }


    @Override
    public String toString (){
        return "\nNomw:"+getNome()+"\n Idade"+getIdade()+"Sexo:"+getS();
    }
}

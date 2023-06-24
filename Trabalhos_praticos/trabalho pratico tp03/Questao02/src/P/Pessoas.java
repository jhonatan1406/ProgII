package P;

public abstract class Pessoas {


    private String nome;
    private  int idade;

    public Pessoas (String nome , int i){

        this.idade= i;
        this.nome= nome;

    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    ]

    public String getNome() {
        return nome;
    }


    @Override
    public String toString() {
        return "\nnome:"+this.nome+"\nidade"+this.idade;
    }
}

package questão0203;

public abstract  class Pessoa implements Comparavel {

    private  String nome;
    private int idade ;

    public String getNome() {
        return nome;
    }

    public Pessoa (String nome , int idade){

        this.nome=nome;
        this.idade=idade;
    }



    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public int comparar (Object o){


        if (this.idade ==  ((Pessoa) o).idade) {
            return 0;
        }
        else if (this.idade < ((Pessoa) o).idade){
            return -1;
        }

        else  {
            return 1;
        }
    }


}


public  abstract  class Animais {

    private String nome;


    public Animais (String nome ){
        this.nome=nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "\nnome:"+getNome();
    }
}

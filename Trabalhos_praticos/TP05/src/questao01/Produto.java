package questao01;

public class Produto {


    private String nome;
    private double preco;
    private int id;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "\nNome:"+this.nome+"\nPreço:"+this.preco+"\nID:"+this.id;
    }
}

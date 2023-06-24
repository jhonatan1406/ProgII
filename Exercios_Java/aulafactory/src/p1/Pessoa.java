package p1;

public class Pessoa {
    String nome ;
    String end;

    protected Pessoa (String nome , String end){
        this.nome=nome;
        this.end=end;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "\nNome:"+this.nome+"\nEndereço:"+this.end;
    }
}

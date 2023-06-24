package questao02;

public abstract class CartaoWeb {

    private String destinatario;

    public CartaoWeb(String destinatario){
        this.destinatario=destinatario;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    // implementação na classe filha
    public abstract  void showMessage();



    @Override
    public String toString() {
        return " Destinatario:"+this.destinatario;
    }
}

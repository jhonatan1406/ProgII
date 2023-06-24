package questao02;

public class Aniversario extends CartaoWeb {

    public Aniversario(String destinatario){
        super(destinatario);
    }



    @Override
    public void showMessage() {

        System.out.println(super.toString());
        System.out.println("comemorando Aniversario");


    }
}

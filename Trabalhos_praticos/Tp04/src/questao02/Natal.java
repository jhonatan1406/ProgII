package questao02;

public class Natal extends CartaoWeb {

    public Natal(String Destinatario){
        super(Destinatario);
    }
    @Override
    public void showMessage() {

        System.out.println(super.toString());
        System.out.println("comemorando Natal");
    }


}


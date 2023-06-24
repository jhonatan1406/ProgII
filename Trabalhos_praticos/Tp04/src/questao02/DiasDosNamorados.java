package questao02;

public class DiasDosNamorados extends CartaoWeb{

    public DiasDosNamorados(String destinatario){
        super(destinatario);
    }

    @Override
    public void showMessage() {

        System.out.println(super.toString());
        System.out.println("comemorando dia dos namorados");


    }
}

package questao03;

public class Formass {

    private  String forma;
    public  Formass (String formas){
        this.forma= GeometricaFactory.Forma(formas);
    }

    public String getForma() {
        return this.forma;
    }
}

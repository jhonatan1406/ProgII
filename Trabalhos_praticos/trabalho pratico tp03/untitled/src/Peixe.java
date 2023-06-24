

public class Peixe extends Animais{


    private String TipoHabitat;
    private  double peso;



    public Peixe (String nome , String tipo , double peso){
        super(nome);
        this.peso=peso;
        this.TipoHabitat=tipo;

    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setTipoHabitat(String tipoHabitat) {
        TipoHabitat = tipoHabitat;
    }

    public String getTipoHabitat() {
        return TipoHabitat;
    }

    @Override
    public String toString() {

        return super.toString()+"\nTipohbaitat:"+getTipoHabitat()+ "\npeso:"+getPeso();
    }
}

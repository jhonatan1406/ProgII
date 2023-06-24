package P;

public class gerente extends Empregado{
    private String nomegerencia;



    public gerente (String nome , int idade  , double sala, String matri, String nomegerencia){
        super(nome,idade,sala,matri);
        this.nomegerencia=nomegerencia;
    }

    public String getNomegerencia() {
        return nomegerencia;
    }

    public void setNomegerencia(String nomegerencia) {
        this.nomegerencia = nomegerencia;
    }


    @Override
    public String toString() {

       return super.toString() + "\nnome gerencia:" + this.nomegerencia;
    }
}

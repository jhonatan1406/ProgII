
public  class Cachorro extends Animais {


    private  String raca;
    private double peso;


    public  Cachorro (String nome ,String raca ,double peso ){

        super(nome);
        this.peso=peso;
        this.raca=raca;



    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }




    @Override
    public String toString(){
        return super.toString()+"\nraça:"+ this.raca + "\npeso:"+ this.peso;
    }
}

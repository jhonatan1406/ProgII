package questao03;

public class Number {

    private  int numero;


    public Number(int num){
        this.numero=num;
    }
    public int getNumero(){
        return numero;
    }
    public void setNumero(){
        this.numero=numero;
    }

    @Override
    public String toString() {
        return "toString: saida de dados";
    }

    @Override
    public int hashCode() {
        return 404;
    }


    public boolean equals(int numero) {
        if(numero==this.numero){
            return true;
        }
        else {
            return false;
        }
    }
}

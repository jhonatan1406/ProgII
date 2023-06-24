package questao02;

public class IncrementalSingleton {

    private static int cont =0;
    private  static  IncrementalSingleton instancia =null;
    private static int numero;
    private  IncrementalSingleton (){}


    public static int getNumero() {
        return numero;
    }

    public static  IncrementalSingleton GetInstancia(){
        if(instancia ==null){
            instancia= new IncrementalSingleton();
            numero= cont ++;
        }

        return instancia;
    }

    @Override
    public String toString() {
        return  "Incremental:"+this.numero;
    }
}

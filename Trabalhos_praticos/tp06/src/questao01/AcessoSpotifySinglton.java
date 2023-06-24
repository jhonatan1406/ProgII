package questao01;

public class AcessoSpotifySinglton {


    public  static AcessoSpotifySinglton instancia= null ;
    private AcessoSpotifySinglton(){}
    public static AcessoSpotifySinglton getInstancia(){
        if ( instancia== null){
            instancia=new AcessoSpotifySinglton();
        }
        return instancia;
    }


}

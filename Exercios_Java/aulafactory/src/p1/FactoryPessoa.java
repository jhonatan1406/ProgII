package p1;

public class FactoryPessoa {

    public static  Pessoa cria(){
        String tipopessoa = "111.111.111.11";
        if(tipopessoa.length()==12){
            Pessoa p1= new Fisica("jhon", "rua tal","213.123.123.11");
            return p1;
        }
        return  null;
    }
}

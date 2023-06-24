package Adapter;

public class ADapterTomada extends  TomadaDoisPinos{

    private  TomadadeTresPinos tomadatres;

    public ADapterTomada(TomadadeTresPinos trespinoss) {
        this.tomadatres=trespinoss;
    }

    @Override
    public  void LigarNaTomadaDoisPino(){

        tomadatres.LIgarnaTomadadeTrespinos();
    }
}

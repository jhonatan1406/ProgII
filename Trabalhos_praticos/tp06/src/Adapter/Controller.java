package Adapter;

import java.util.ArrayList;

public class Controller {
    public static void main(String[] args) {

        TomadaDoisPinos doispinos = new TomadaDoisPinos();
        TomadadeTresPinos trespinoss = new TomadadeTresPinos();
        ADapterTomada ada = new ADapterTomada(trespinoss);

        ArrayList<TomadaDoisPinos> listadeTomadas = new ArrayList<>();
        listadeTomadas.add(doispinos);
        listadeTomadas.add(ada);



    }
}

package questao01;
import java.io.OutputStream;
import java.util.ArrayList;

import static java.lang.System.out;
public class Container {
    private ArrayList<Form> Formulario =new ArrayList<>();
    public void addForm(Form f){
        Formulario.add(f);
    }

    public void print(OutputStream o) throws Exception{
        for(Form f: Formulario){
            out.write(f.toString().getBytes());
        }
    }

}

package questao01;

public class Contralador {
    public static void main (String []args) throws Exception {
        Container f= new Container();

        for(int i=0;i<10;i++) {
            f.addForm(new Form(i));
        }
        f.print(System.out);
    }
}

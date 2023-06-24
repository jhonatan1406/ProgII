package questao02;

public class testeIncremental {

    public static void main(String[] args) {
        for (int i=0; i<10;i++){
            IncrementalSingleton inc = IncrementalSingleton.GetInstancia();
            System.out.println(inc);
        }


    }
}

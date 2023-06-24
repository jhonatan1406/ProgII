package questão0203;

public class Teste {
    public static void main(String[] args) {

        Pessoa a1 = new Rica("jhon", 21);
        Pessoa a2 = new Pobre("Bob", 23);

        a1.comparar(a2);
        System.out.println(a1.comparar(a2));

        if(a1.comparar(a2)==0){
            System.out.println("Idade igual");
        }
        else if(a1.comparar(a2)==-1){
            System.out.println("Idade menor");
        }
        else if(a1.comparar(a2)==1){
            System.out.println("Idade maior");
        }



    }
}

package questao04;

public class TesteExecption {

    public static void main(String[] args) {
        System.out.println("Incio do main ");
        metado1();
        System.out.println("Fim do main");
    }

    static  void metado1(){
        System.out.println("incio do metado ");
        metado2();
        System.out.println("fim metado1");
    }
    static void metado2(){
        System.out.println("INcio metado2");
        int[] array = new int[10];
        for (int i =0 ; i <15;i++){
            array[i]=i;
            System.out.println(i);
        }
        System.out.println("Fim metado 2");
    }

}

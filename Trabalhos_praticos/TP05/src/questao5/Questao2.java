package questao5;

import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("eu sei dividir ");
        System.out.println("inform o valor :");
        int x= teclado.nextInt();
        System.out.println("informe o segundo valor: ");
        int y=teclado.nextInt();
        double r = (x/y);
        System.out.println("O resultado da divisão é :"+r);
    }
}

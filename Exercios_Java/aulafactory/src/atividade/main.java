package atividade;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {


        Scanner ler = new Scanner(System.in)caarr


        ArrayList<ArrayList> listaautomovel= new ArrayList<ArrayList>();
        for (int i =0; i<5;i++) {
            System.out.println("Digite a cor do automovel:");
            String cor= ler.next() ;
            System.out.println("Digite quantidade de rodas:");
            int rodas= ler.nextInt();
            listaautomovel.add(FatoryAutomovel.Cria(cor,rodas));
        }
        System.out.println(listaautomovel);


    }
}

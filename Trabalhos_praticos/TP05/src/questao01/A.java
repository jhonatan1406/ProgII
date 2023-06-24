package questao01;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A {
    public static void main(String[] args) {

        Set<String> Listanome = new HashSet<String>();

        Scanner ler = new Scanner(System.in);
        for (int i=0; i<3;i++){
            System.out.println(i+":Digite o nome:");
            Listanome.add(ler.nextLine());
        }

        System.out.println("Digite um que queira remover:");
        String removernome=ler.nextLine();

        if (Listanome.contains(removernome) ){
            Listanome.remove(removernome);
        }
        else{
            System.out.println("Nome não existe na lista");
        }
        System.out.println("deseja remover todos os nome ? digite 1");
        int p = ler.nextInt();

        if(p==1){
            Listanome.clear();
        }


    }
}
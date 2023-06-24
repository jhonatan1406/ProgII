package questao01;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B {

    public static void main(String[] args) {

        Set<Produto> Listaproduto = new HashSet<Produto>();
        Scanner ler = new Scanner(System.in);

        for(int i=0 ; i<3 ; i++){
            System.out.println("-----Produto "+(i+1)+"----------");
            Produto p= new Produto();
            System.out.println("Digite o nome do produto:");
            p.setNome(ler.nextLine());
            System.out.println("Digite o preço do produto:");
            p.setPreco(ler.nextDouble());
            System.out.println("O ID do produto:");
            p.setId(ler.nextInt());
            Listaproduto.add(p);
            for (Produto r: Listaproduto) {
                if(r.getId()==p.getId())
                    System.out.println("Nome já contem na lista ");
                break;

            }


            ler.nextLine();
        }
        for (Produto k: Listaproduto) {
            System.out.println(k);

        }


    }
}

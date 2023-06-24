package trabalho;
import java.util.Scanner;
public class Questão02 {
	
	public static void main (String[] args) {
		
		Scanner ler = new Scanner(System.in);
		String nome[][]= new String[50][21];
		int i;
		int  estoque[]= new int[50],estoqueideal[]= new int[50],quantcompra[]= new int[50];
		
		
		for(i=0;i<3;i++) {
			System.out.println("Nome:");
			nome[i]=ler.nextLine();
			System.out.println("Quantidade em estoque:");
			estoque[i]=ler.nextInt();
			System.out.println("Estoque ideal");
			estoqueideal[i]=ler.nextInt();
		}
		for(i=0;i<3;i++) {
			System.out.println("Planta"+nome[i]);
			
			quantcompra[i]=estoqueideal[i]-estoque[i];
			
			System.out.println("quantidade a comprar"+quantcompra[i]);
		}
		
		
		
	}

}

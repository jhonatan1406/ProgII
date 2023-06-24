package seila;
import java.util.Scanner;
public class Principal {
	
	public static void main (String[] args) {
		ListaAdjacencia lista = new ListaAdjacencia();
		Scanner ler= new Scanner (System.in);
		int num=0;
		lista.fazmat();
		lista.imprimemat();
		System.out.print("Digite o vertice que queira saber:");
		num= ler.nextInt();
		
		lista.compara(num);
		
		ler.close();
	}
	
	
	
}



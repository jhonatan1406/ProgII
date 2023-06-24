package principal;
import java.util.Scanner;

public class Questao01 {
	
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		
		float pes, maos ,patologia;
		int quantpe[]= new int[5],quantmao[]= new int[5] ,quantpat[]= new int[5];
		float salario[]= new float[5];
		
		int i=0;
		
		
		System.out.println("Tabela de preços:");
		System.out.println("preço do pe:");
		pes=ler.nextFloat();
		System.out.println("preço da mao:");
		maos=ler.nextFloat();
		System.out.println("preço da patologia:");
		patologia=ler.nextFloat();
		
		for(i=1;i<=5;i++) {
			System.out.println("Manicure"+i);
			System.out.println("Quantas pes:");
			quantpe[i]=ler.nextInt();
			System.out.println("Quantas maos:");
			quantmao[i]=ler.nextInt();
			System.out.println("Serviços patologicos:");
			quantpat[i]=ler.nextInt();
			salario[i]=((quantpe[i]*pes)+(quantmao[i]*maos)+(quantpat[i]*patologia));
			salario[i]=salario[i]/2;
			System.out.println("Salario a receber "+salario[i]);
		}
	
	}

}

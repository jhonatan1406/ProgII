package trabalho;
import java.util.Scanner;
public class Questão05 {
	public static void main (String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int matriz[][]=new int[3][3];
		int i,j;
		
		for(i=0;i<matriz.length;i++) {
			for(j=0;j<matriz[i].length;j++) {
				System.out.println("digite:");
				matriz[i][j]=ler.nextInt();
			}
		}
		for(i=2;i>=0;i--) {
			System.out.print(matriz[i][0]+" ");
		}
		System.out.println();
		
		for(i=2;i>=0;i--) {
			System.out.print(matriz[i][1]+" ");
		}
		System.out.println();
		
		for(i=2;i>=0;i--) {
			System.out.print(matriz[i][2]+" ");
		}
		System.out.println();


		
		
		
		
		
		
		
	}
}

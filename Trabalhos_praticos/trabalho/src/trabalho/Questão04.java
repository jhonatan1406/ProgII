package trabalho;
import java.util.Scanner;
public class Questão04 {
	
	
	public static void main (String[] args) {
		
		Scanner ler = new Scanner(System.in);
		float valor[][] = new float[12][4];
		float totalmes[]=new float[12],totalano=0;
		int i,j;
		
				
		for(i=0;i<12;i++) {		
			for(j=0;j<4;j++)
				System.out.println( "digite:" );
				valor[i][j]=ler.nextFloat();
				
		}
		for(i=0;i<valor.length;i++) {
			for(j=0;j<valor[i].length;j++) {
				totalmes[i]=totalmes[i]+valor[i][j];
				
			}
			System.out.println("total mes "+i+":"+totalmes[i]);
		}
		for(i=0;i<valor.length;i++) {
			for(j=0;j<valor[i].length;j++) {
				System.out.println("total semana:"+valor[i][j]);
			}
		}
		for(i=0;i<valor.length;i++) {
			for(j=0;j<valor[i].length;j++) {
				totalano=totalano+totalmes[i];
			}
		}
		System.out.println("total ano :"+totalano);
				
				
	}

}

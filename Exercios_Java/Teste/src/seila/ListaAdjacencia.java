package seila;

public class ListaAdjacencia {
public int mat[][]=new int[5][5];
	
	public void fazmat () {
		int i,j;
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++) {
				this.mat[i][j]=1;
				if(i==j) {
					this.mat[i][j]=0;
				}
				
			}
		}
		this.mat[0][2]=0;
		this.mat[0][3]=0;
		this.mat[2][0]=0;
		this.mat[2][4]=0;
		this.mat[3][0]=0;
		this.mat[4][2]=0;
	}
		public void imprimemat () {
			for(int i=0;i<5;i++) {
				for(int j=0;j<5;j++) {
					System.out.print(this.mat[i][j]+" ");
				}
				System.out.print("\n");
			}
		}


	
	
	public void compara(int numerover) {
			for(int j=0;j<5;j++) {
				if(this.mat[numerover-1][j]==1) {
					System.out.println((numerover)+" é vizinho na posição "+(j+1));;
				}
			
			
		}
		
		
	}
}

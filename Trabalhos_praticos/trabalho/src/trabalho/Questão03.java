package trabalho;
import java.util.Scanner;
public class Questão03 {
	int fib(int n){
	    if(n<2){
	        return 1;
	    }
		else{
	            
	        return fib(n-1) + fib(n-2);
	 
	    }
	    
	}
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		int n=0;
	    
	    n=ler.nextInt();
	   System.out.println(fib(n));
	    
	    for(int i=0; i<20; i++){
	        System.out.println(fib(i));
	    }
	}
}

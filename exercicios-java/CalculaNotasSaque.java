/******************************************************************************

 lista de exercícios.

*******************************************************************************/
import java.util.Scanner;
public class CalculaNotasSaque
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
		System.out.println("valor do saque: ");
		int saque = ler.nextInt();
	
		    int nota_100 = saque / 100;
		    saque = saque % 100;
		    
		    int nota_50 = saque / 50;
		    saque = saque % 50;
		    
		    int nota_20 = saque / 20;
		    saque = saque % 20;
		     
		    int nota_5 = saque / 5;
		    int moeda_1 = saque % 5;
		    
		  System.out.println("notas de 100: " + nota_100);
		  System.out.println("Notas de  50: " + nota_50);
	      System.out.println("Notas de  20: " + nota_20);
		  System.out.println("Notas de   5: " + nota_5);
		  System.out.println("moedas de  1: " + moeda_1);
		    
        ler.close();
		    
		    
		
	}
}

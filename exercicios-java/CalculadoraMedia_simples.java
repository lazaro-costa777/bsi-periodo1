/******************************************************************************

 lista de exercicios.

*******************************************************************************/

import java.util.Scanner;
public class Media_tres_numeros
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
		System.out.println("entre com três números inteiros:");
		 int n1 = ler.nextInt();
		 int n2 = ler.nextInt();
		 int n3 = ler.nextInt();
		 
		 double media = (double) (n1 + n2+ n3) / 3;
		
		System.out.print("a média dos números fornecidos é:" + media);
		
	  ler.close();	
		 
	}
}

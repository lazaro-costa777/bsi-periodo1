/******************************************************************************

 lista de exercícios.

*******************************************************************************/
import java.util.Scanner;

public class TrocaVariaveis
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    
		System.out.println("entre com dois números inteiros: ");
		int n1 = ler.nextInt();
		int n2 = ler.nextInt();
		
		System.out.println("// ANTES DA TROCA //");
		System.out.println("n1 = " + n1 + " | n2 = " + n2);
		
		int troca = n1;
		n1 = n2;
		n2 = troca;
		
		System.out.println("// DEPOIS DA TROCA //");
		System.out.println("n1 = " + n1 + " | n2 = " + n2);
		
		ler.close();
	}
}

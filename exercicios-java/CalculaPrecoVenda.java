/******************************************************************************

 lista de exercícios.

*******************************************************************************/
import java.util.Scanner;

public class CalculaPrecoVenda
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    
		System.out.println(" entre com o preço da compra: ");
		double precocompra = ler.nextDouble();
		System.out.print(" agora entre com a porcentagem de lucro desejado (em %): ");
		double porc_lucro = ler.nextDouble();
		
		double lucro = precocompra * ( porc_lucro / 100.0);
		double preco_final = precocompra + lucro;
		
		System.out.printf(" o preço final será de: %.1f", preco_final);
		
		ler.close();
	}
}

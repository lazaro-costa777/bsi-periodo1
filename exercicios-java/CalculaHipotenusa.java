/******************************************************************************

 lista de exercícios.

*******************************************************************************/
import java.util.Scanner;

public class CalculaHipotenusa
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    
		System.out.print("entre com o primeiro cateto: ");
		double cat1 = ler.nextDouble();
		System.out.print("entre com o segundo cateto: ");
		double cat2 = ler.nextDouble();
		
		// calculo da hipotenusa: raiz quadrada de (cateto1² + cateto2² ). para efetuar a raiz quadrada usamos ( math.sqrt()).
		
		double hipotenusa = Math.sqrt((cat1 * cat1) + (cat2 * cat2));
		
		// usamos ( (printf) e ( %.2f)  ) para deixar apenas 2 casas decimais após a vírgla.
		
		System.out.printf("o valor da hipotenusa do seu triangulo é: %.2f " , hipotenusa);
		
		ler.close();
	}
}

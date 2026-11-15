/******************************************************************************

 lista de exercícios.

*******************************************************************************/
import java.util.Scanner;
public class ConverteTemperatura
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    
		System.out.println("entre com a temperatura em celcius: ");
		double celcius = ler.nextDouble();
		
		double fahrenheit = ((celcius * 180.0) / 100.0) + 32;
		
		System.out.printf("A temperatura em fahrenheit é: %.2f ", fahrenheit);
		
		ler.close();
	}
}

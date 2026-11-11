/******************************************************************************

  Lista de exercicio
  
  *******************************************************************************/
  
  import java.util.Scanner;
  
public class Main
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    
		System.out.println("entre com os coeficientes :");
		  double a = ler.nextDouble();
		  double b = ler.nextDouble();
		  double c = ler.nextDouble();
		  
		  double delta = (b * b)- (4 * a * c);
		  
		System.out.print("delta vale :" + delta);
	
	   ler.close();	
	}
}

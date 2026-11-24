/******************************************************************************

lista de exercícios.

*******************************************************************************/
import java.util.Scanner;
public class RaizesEquacaoSegundoGrau
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    
		System.out.println("Entre com o coeficiente a: ");
		 double a = ler.nextDouble();
		System.out.println("Entre com o coeficiente b: ");
	   	 double b = ler.nextDouble();
		System.out.println("Entre com o coeficiente c: ");
		 double c = ler.nextDouble();
		
		if( a == 0){
		    System.out.print("A sua equação não é de segundo grau ('a' precisa ser diferente de 0).");
		}else{
		    double delta = (b * b) - (4 * a * c);
		    
		   if( delta < 0){
		       System.out.print("Não existem raizes reais.");
		   }else if( delta == 0){
		       
		       double raiz = -b / (2 * a);
		       System.out.printf("Raiz única: %.2f\n", raiz);
		       
		   }else{
		       double raizdelta = Math.sqrt(delta);
		       double raiz1 = (-b + raizdelta) / (2 * a);
		       double raiz2 = (-b - raizdelta) / (2 * a);
		       
		       System.out.printf("1º raiz: %.2f\n", raiz1);
		       System.out.printf("2º raiz: %.2f\n", raiz2);
		   }
		    
		}
		
		ler.close();
	}
}

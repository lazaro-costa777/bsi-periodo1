/******************************************************************************

 lista de exercícios.

*******************************************************************************/
import java.util.Scanner;
public class SomatorioSerie
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
		System.out.println("entre com um número inteiro positivo qualquer: ");
		 int n = ler.nextInt();
		System.out.println("Agora entre com um numero real qualquer:");
		 double x = ler.nextDouble();
		 double soma = x;
		 
		 if(n > 0){
		 
		 for(int i = 2; i <= n; i++){
		     long fatorial = 1;
		     
		     for(int cont = 1; cont <= ((i + i) - 1); cont++){
		         fatorial = fatorial * cont;
		     }
		    soma = soma + ((i * x) / fatorial); 
		 }
		 System.out.printf(" Resultado: %.4f\n" , soma);
		 }else{
		     
		     System.out.println("por favor o número inteiro precisa ser positivo.");
		 }
		 
		 ler.close();
	}
}

/******************************************************************************

4. Faça um algoritmo para ler 100 números inteiros e em seguida escrever os 
 números com valor acima da média de todos os números lidos.

*******************************************************************************/
import java.util.Scanner;
public class AcimaDaMedia
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    int[] numeros = new int[100];
	    double total = 0;
	    
	    for(int i = 0; i < numeros.length; i++){
		System.out.println("Entre com o " + (i + 1) + "º número: ");
		numeros[i] = ler.nextInt();
		 total = total + numeros[i];
	   }
	    double media = total / numeros.length;
	    
	    System.out.println("Média de todos os números: " + media);
	    System.out.println(" // NÚMEROS MAIORES QUE A MÉDIA DE TODOS OS NÚMEROS //\n\n");
	    for(int i = 0; i < numeros.length; i++){
	        if(numeros[i] > media){
	            System.out.println(numeros[i]);
	        }
	   }
	     ler.close();
	}
}

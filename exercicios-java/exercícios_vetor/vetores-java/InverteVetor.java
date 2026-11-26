/******************************************************************************

6. Faça um algoritmo para ler um vetor com 100 números inteiros e em seguida inverte
 os elementos deste vetor trocando os elementos com índices equidistantes.

*******************************************************************************/
import java.util.Scanner;
public class InverteVetor
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    int[] vetor = new int[100];
	    int[] vetor2 = new int[vetor.length];
	    
	    for(int i = 0; i < vetor.length; i++){
	        System.out.println("entre com o " + (i + 1) + "º número: ");
	        vetor[i] = ler.nextInt();
	    }
	    for(int i = vetor2.length - 1; i >= 0; i--){
	        vetor2[i] = vetor[(vetor.length - 1) - i];
	    }
	    System.out.println("ORDEM INVERTIDA DOS ELEMENTOS NO VETOR\n\n");
	     for(int i = 0; i < vetor.length; i++){
	         System.out.println("vetor[" + i + "]: " + vetor2[i]); 
	   }
	     ler.close();
	     
	}
}

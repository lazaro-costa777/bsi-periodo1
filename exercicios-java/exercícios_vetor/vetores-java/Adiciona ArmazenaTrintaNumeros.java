/******************************************************************************
1. Faça um algoritmo para ler e armazenar um conjunto de 30 números inteiros.


*******************************************************************************/
import java.util.Scanner;
public class Adiciona ArmazenaTrintaNumeros
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	     int numeros[] = new int[30];
	     
	     for(int i = 0; i < numeros.length; i++){
	         
	         System.out.println("entre com o "+ (i+ 1) + "º numero inteiro: ");
	         numeros[i] = ler.nextInt();
	         
	     }
	    System.out.println("\n Números armazenados no vetor: \n");
	    for(int i = 0; i < numeros.length; i++){
	        System.out.println("vetor[" + i + "] = " + numeros[i]);
	        
	        
	    }
	    
	    ler.close();
	}
}

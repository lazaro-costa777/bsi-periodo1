/******************************************************************************

 3. Faça um algoritmo para ler dois vetores com no máximo 50 elementos, as quantidades
 de elementos a serem lidos de cada vetor também serão lidas. Caso estas quantidades sejam 
 iguais gere um vetor formado pela soma dos dois vetores lidos. O vetor soma é formado pela 
 soma dos elementos de mesmos índices dos vetores somados.

*******************************************************************************/
import java.util.Scanner;
public class SomaVetores.java
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    int[] v1 = new int[50];
	    int[] v2 = new int[50];
	    
		System.out.println("entre com a quantidade de elementos para o 1º vetor (max 50):");
		int qtd = ler.nextInt();
		if( qtd <= 0 || qtd > 50){
		    System.out.println("por favor, entre com uma quantidade válida. ");
		    ler.close();
		    return;
		}
		
		System.out.println(" entre com a quantidade de elementos para o 2º vetor (max 50)");
		int qtd2 = ler.nextInt();
		if( qtd2 <= 0 || qtd2 > 50){
		    System.out.println(" por favor, entre com uma quantidade válida.");
		    ler.close();
		    return;
		}
		
		System.out.println("// PREENCHIMENTO DO 1º VETOR //\n");
		for(int i = 0; i < qtd; i++){
		    System.out.println("v1[" + i + "]: ");
		    v1[i] = ler.nextInt(); 
		}
		
		System.out.println("// PREENCHIMENTO DO 2º VETOR//\n");
		 for(int i = 0; i < qtd2; i++){
		    System.out.println("v2[" + i + "]: ");
		    v2[i] = ler.nextInt(); 
		 }
		
		if( qtd == qtd2){
		    int[] v3 = new int[qtd];
		    System.out.println("// VETOR SOMA //\n");
		     for(int i = 0; i < qtd; i++){
		         v3[i] = v1[i] + v2[i];
		         System.out.println("v3[" + i + "]: " + v3[i]);
		         
		     }
		}else{
		    System.out.println("\nAs quantidades são diferentes; não é possível gerar o vetor soma.");
		}
		   
		   ler.close(); 
	}
}

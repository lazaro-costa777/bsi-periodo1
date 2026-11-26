/******************************************************************************

5. Faça um algoritmo para ler dois vetores com 100 elementos cada e em seguida
 colocar seus elementos alternadamente num terceiro vetor.

*******************************************************************************/
import java.util.Scanner;
public class IntercalaVetores
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    int[] v1 = new int[100];
	    int[] v2 = new int[100];
	    int[] v3 = new int[v1.length + v2.length];
	    
	    System.out.println("PREENCHER O PRIMEIRO VETOR \n");
	    for(int i = 0; i < v1.length; i++){
		System.out.println("entre com o " + (i + 1) + "º número: ");
		 v1[i] = ler.nextInt();
	    }
	    
	     System.out.println("PREENCHER O SEGUNDO VETOR \n");
	    for(int i = 0; i < v2.length; i++){
		System.out.println("entre com o " + (i + 1) + "º número: ");
		 v2[i] = ler.nextInt();
	    }
	    
	    int posv1 = 0;
	    int posv2 = 0;
	    for(int i = 0; i < v3.length; i++){
	        if( i % 2 == 0){
	            v3[i] = v1[posv1];
	            posv1++;
	        }else{
	            v3[i] = v2[posv2];
	            posv2++;
	         }
	    }
	   System.out.print("TODOS OS VALORES ALTERNADOS\n\n");
	   for(int i = 0; i < v3.length; i++){
	  System.out.println(v3[i]);
	  }
	    ler.close();
	}
}

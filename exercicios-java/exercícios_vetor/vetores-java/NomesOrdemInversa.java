/******************************************************************************

2. Faça um algoritmo para ler um valor inteiro positivo N e em seguida ler N
 nomes de alunos de uma turma e escrevê-los na ordem inversa que foram lidos.
 O valor N será no máximo 50;

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    
	    System.out.print("Entre com a quantidade de alunos (max 50): ");
	    int n = ler.nextInt();
	    
	    if( n <= 0 || n > 50){
	        System.out.println("número inválido.");
	        ler.close();
	        return;
	    }
	    
	    ler.nextLine();
	    String[] alunos = new String[n];
	    
	    for(int i = 0; i < n; i++){
	        System.out.println("entre com o " + (i + 1) + "º nome: ");
	        alunos[i] = ler.nextLine();
	    }
		
		System.out.println("\n // LISTA DE ALUNOS // \n");
		for(int j = (n - 1); j >= 0; j--){
		    
		    System.out.println((j + 1) + "º aluno: " + alunos[j]);
		}
	     
	     ler.close();	
	}
}

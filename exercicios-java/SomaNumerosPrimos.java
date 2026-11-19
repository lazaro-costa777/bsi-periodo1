/******************************************************************************

 lista de exercícios.

*******************************************************************************/
import java.util.Scanner;
public class SomaNumerosPrimos
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    int soma = 0;
	    
	    for( int i = 1; i <= 10; i++) {
	        System.out.println("entre com o " + i + "º numero:");
	        int numero = ler.nextInt();
	        int cont = 0;
	        
	        for( int j = 1; j <= numero; j++) {
	          if(numero % j == 0){
	              cont++;
	          }  
	       }
	       
	        if(cont == 2){
	           soma = soma + numero;
	           
	          }  
	        }
	        
	         
	    if(soma != 0){
	    System.out.println("a soma dos números primos é : " + soma);
	    }else{
	        System.out.println(" nenhum número primo encontrado.");
	    }
	    
	    ler.close();
	}
}

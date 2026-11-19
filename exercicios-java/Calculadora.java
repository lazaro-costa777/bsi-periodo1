/******************************************************************************

  lista de exercícios.

*******************************************************************************/
import java.util.Scanner;
public class Calculadora
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    char operacao;
	  
	  do {  
		System.out.println("     // CALCULADORA // \n");
		System.out.println("      SOMAR       (+)");
		System.out.println("      SUBTRAIR    (-)");
		System.out.println("      MULTIPLICAR (*)");
		System.out.println("      DIVIDIR     (/)");
		System.out.println("      sair        (0)");
		operacao = ler.next().charAt(0);
		
		if (operacao == '0') {
		    
		    System.out.println(" calculadora encerrada.");
		    break;
		}
		
		if ( operacao != '+' && operacao != '-' && operacao != '*' && operacao != '/') {
		    
		    System.out.println(" informaçao invalida");
		    
		} else {
		    
		    System.out.println("entre com os dois números desejados: ");
		    double num1 = ler.nextDouble();
		    double num2 = ler.nextDouble();
		    double resultado;
		    
		    switch (operacao) {
		        case '+': 
		            resultado = num1 + num2;
		            System.out.println("resultado: " + resultado);
		            break;
		            
		        case '-':
		            resultado = num1 - num2;
		            System.out.println("resultado:\n "+ resultado);
		            break;
		            
		       case '*':
		           resultado = num1 * num2;
		           System.out.println("resultado: \n" + resultado);
		           break;
		           
		       case '/': 
		           if (num2 != 0) {
		               
		               resultado = num1 / num2;
		               System.out.println("resultado: \n" + resultado);
		               
		           }else{
		               
		               System.out.println(" lamento, o divisor deve ser diferente de 0.");
		               
		           }
		              break;
		        }
		}
		}while (true);
		
		ler.close();
	}
}


/******************************************************************************

 lista de exercícios.

*******************************************************************************/
import java.util.Scanner;

public class TempoFilaBanco
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
	    
		System.out.println(" // HORARIO DE ENTRADA // \n");
	   System.out.print(" Entre com a hora: ");
	    int hora_entrada = ler.nextInt();
	    System.out.print(" Entre com os minutos: ");
	    int minuto_entrada = ler.nextInt();
	    
	    System.out.println(" // HORARIO DE SAIDA // \n");
	    System.out.print("Entre com a hora: ");
	    int hora_saida = ler.nextInt();
	    System.out.print(" Entre com os minutos: ");
	    int minuto_saida = ler.nextInt();
	    
	    // conversao das horas em minutos 
	    
	    int total_entrada = (hora_entrada * 60) + minuto_entrada;
	    int total_saida = (hora_saida * 60) + minuto_saida;
	    
	    // calculo de permanência em minutos
	    
	    int permanencia_totalminuto = total_saida - total_entrada;
	    
	    // conversao
	    
	    int permanencia_hora = permanencia_totalminuto / 60;
	    int permanencia_minuto = permanencia_totalminuto % 60;
	    
	    // resultado
	    
	    System.out.printf("O seu tempo de permanência na fila foi de: %d:%02d\n " , permanencia_hora,permanencia_minuto);
	    
	    
	    ler.close();
	    	    
	}	    
	    
	    
}

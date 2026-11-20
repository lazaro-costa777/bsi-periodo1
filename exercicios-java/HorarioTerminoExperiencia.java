/******************************************************************************

 lista de exercícios.

*******************************************************************************/
import java.util.Scanner;
public class HorarioTerminoExperiencia
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);
		System.out.println(" // HORÁRIO ENTRADA // \n");
	    System.out.println("Digite a hora: ");
	     int h_entrada = ler.nextInt();
	    System.out.println("Digite os minutos: ");
	     int m_entrada = ler.nextInt();
	    System.out.println("Digite os segundos: ");
	     long s_entrada = ler.nextLong();
	     
	    System.out.println(" \n// TEMPO DE DURAÇÃO \n//");
	    System.out.println("Digite os segundos de duração: ");
	     long s_duracao = ler.nextLong();
	     
	     long conversao_h = h_entrada * 3600;
	     long conversao_m = m_entrada * 60;
	     long total_s = conversao_h + conversao_m + s_entrada + s_duracao;
	     
	     long h_termino = (total_s / 3600) % 24;
	     long resto_t = total_s % 3600;
	     long m_termino = (resto_t / 60);
	     long s_termino = resto_t % 60;
	     
	    System.out.println("// TÉRMINO // \n");
	    System.out.printf("%02d:%02d:%02d\n", h_termino , m_termino , s_termino);
	     
	     
	    ler.close();
	    
	}
	
}

/******************************************************************************

Exercício vetor.

*******************************************************************************/

import java.util.Scanner;

public class MenuVetor {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] v = new int[50];
        int qtd = 0;
        byte operacao;

        do {
            System.out.println("###########################");
            System.out.println("MENU VETOR");
            System.out.println("###########################");
            System.out.print("MENU \n"
                    + "1 - Preencher Vetor \n"
                    + "2 - Listar Vetor \n"
                    + "3 - Sair \n"
                    + "Digite a opção desejada: ");
            operacao = ler.nextByte();

            switch (operacao) {
                case 1:
                    System.out.print("Entre com o tamanho do vetor (<=50): ");
                     qtd = ler.nextInt();
                     if(qtd > 50 || qtd <= 0){
                         System.out.println("Tamanho inválido! Informe um valor entre 1 e " + v.length + ".");
                         
                     }else{
                    for (int i = 0; i < qtd; i++) {
                        System.out.print("Digite o valor para a posição [" + i + "]: ");
                        v[i] = ler.nextInt();
                    }
                    System.out.println("Vetor preenchido com sucesso!");
                     }
                    break;

                case 2: 
                    if(qtd == 0){
                        System.out.println("O vetor ainda está vazio. Use a opção 1 primeiro.");
                    }else{
                    System.out.println("--- Elementos do Vetor ---");
                    for (int i = 0; i < qtd; i++) {
                        System.out.println("Posição [" + i + "] = " + v[i]);
                    }
                    }
                    break;

                case 3:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }

            System.out.println();
        } while (operacao != 3);

        ler.close();
    }
}

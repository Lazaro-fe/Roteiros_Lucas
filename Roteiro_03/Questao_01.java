// package Roteiro_03;
import java.util.Scanner;

public class Questao_01 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor_disponível_caixa = 2500;
        int opcao;

        while (true) {
            System.out.println("\n====== BANCO 24 HORAS ======");
            System.out.println("1 - Exibir saldo disponível no caixa eletrônico");
            System.out.println("2 - Realizar Saque");
            System.out.println("3 - Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 3) {
                System.out.println("Saindo do Sistema... Obrigado por utilizar o caixa 24 horas!");
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.println("\n===== SALDO DISPONÍVEL NO CAIXA ELETRÔNICO =====");
                    System.out.print("Saldo disponível no caixa eletrônico: " +valor_disponível_caixa);
                    System.out.println();
                    break;
                case 2:

                    System.out.println("\n===== ÁREA DE SAQUE BANCARIO =====");

                    System.out.println("Digite a quantidade de dinheiro que você deseja sacar: ");
                    double valor_de_saque = sc.nextDouble();

                    if (valor_de_saque <= 10 || valor_de_saque % 10 != 0) {
                        System.out.println("Erro : Valor Inválido");
                    } else if (valor_de_saque > valor_disponível_caixa){
                        System.out.println("Erro: Valor de saque digitado não corresponde ao valor existente no caixa eletrônico!");
                    } else {
                        valor_disponível_caixa -= valor_de_saque;
                        System.out.println("\n== SAQUE FINAL ==");
                        System.out.println("Quantidade de dinheiro sacado: " +valor_de_saque);
                        System.out.println("Quantidade de dinheiro disponível no caixa eletrônico: " +valor_disponível_caixa);
                        System.out.println("Retire as cédulas na boca do caixa eletrônico!!");
                    }
                    break;
                default:
                    System.out.println("Opção Inválida!!!\nTente Novamente!!");
                    break;
            }
        }
        sc.close();
    }
}
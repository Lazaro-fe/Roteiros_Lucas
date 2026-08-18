// package Roteiro_03;

import java.util.Scanner;

public class Questao_05 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        double saldo_disponivel = 3000;

        int saque_de_dinheiro;

        System.out.println("\n==== CAIXA ELETRÔNICO ====");
        System.out.println("Saldo disponível no caixa eletrônico: R$" +saldo_disponivel);
        
        System.out.println("Quanto dinheiro você deseja sacar: ");
        saque_de_dinheiro = sc.nextInt();



        if (saque_de_dinheiro > saldo_disponivel) {
            System.out.println("ERRO: Saldo indisponível no caixa eletrônico");
        } else if (saque_de_dinheiro <= 0 || saque_de_dinheiro % 10 != 0) {
            System.out.println("ERRO: O valor do saque deve ser múltiplos de 10");
        } else {
            int valor_total_do_saque = saque_de_dinheiro;
            
            int nota_de_100 = valor_total_do_saque / 100;
            valor_total_do_saque = valor_total_do_saque % 100;
            
            int nota_de_50 = valor_total_do_saque / 50;
            valor_total_do_saque = valor_total_do_saque % 50;
            
            int nota_de_20 = valor_total_do_saque / 20;
            
            valor_total_do_saque = valor_total_do_saque % 20;
            int nota_de_10 = valor_total_do_saque / 10;

            System.out.println("\n==== SAQUE TOTAL ====");

            if (nota_de_100 > 0) {
                System.out.println("Notas de 100 necessárias : " + nota_de_100);
            }

            if (nota_de_50 > 0) {
                System.out.println("Notas de 50 necessárias: " + nota_de_50);
            }

            if (nota_de_20 > 0) {
            System.out.println("Notas de 20 necessárias: " + nota_de_20);
            }

            if (nota_de_10 > 0) {
            System.out.println("Notas de 10 necessárias: " + nota_de_10);
            }

            saldo_disponivel -= saque_de_dinheiro;
            System.out.println("Novo Saldo disponível no caixa: R$" + saldo_disponivel);
        }
        sc.close();
    }
}

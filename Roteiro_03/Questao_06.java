// package Roteiro_03;

import java.util.Scanner;

public class Questao_06 {
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numero_1;
        int numero_2;
        String operacao;

        System.out.println("Digite o 1° número: ");
        numero_1 = sc.nextInt();

        System.out.println("Digite o 2° número: ");
        numero_2 = sc.nextInt();

        sc.nextLine();

        System.out.println("Digite a operação que deseja realizar: ");
        operacao = sc.nextLine();


        if (operacao.equals("+")) {
            int soma = numero_1 + numero_2;
            System.out.println("\n=== RESULTADO DA OPERAÇÃO ===");
            System.out.println("O 1° número: " + numero_1);
            System.out.println("A operação escolhida: " + operacao);
            System.out.println("O 2° número: " + numero_2);
            System.out.println("O Resultado " + soma);
        } else if (operacao.equals("-")) {
            int subtracao = numero_1 - numero_2;
            System.out.println("\n=== RESULTADO DA OPERAÇÃO ===");
            System.out.println("O 1° número: " + numero_1);
            System.out.println("A operação escolhida: " + operacao);
            System.out.println("O 2° número: " + numero_2);
            System.out.println("O Resultado " + subtracao);
        } else if (operacao.equals("*")) {
            int multiplicacao = numero_1 * numero_2;
            System.out.println("\n=== RESULTADO DA OPERAÇÃO ===");
            System.out.println("O 1° número: " + numero_1);
            System.out.println("A operação escolhida: " + operacao);
            System.out.println("O 2° número: " + numero_2);
            System.out.println("O Resultado " + multiplicacao);
        } else if (operacao.equals("/")) {
            int divisao = numero_1 / numero_2;
            System.out.println("\n=== RESULTADO DA OPERAÇÃO ===");
            System.out.println("O 1° número: " + numero_1);
            System.out.println("A operação escolhida: " + operacao);
            System.out.println("O 2° número: " + numero_2);
            System.out.println("O Resultado " + divisao);
        } else {
            System.out.println("Operação Inválida!\nTente digitar uma operação existente no programa (+, -, * e /)");
        }

        sc.close();
    }
}

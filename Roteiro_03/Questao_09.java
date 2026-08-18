// package Roteiro_03;

import java.util.Scanner;

public class Questao_09 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double salario;
        int numero_de_dependentes;
        String classe;
        double imposto;
        double desconto_sobre_imposto;
        double imposto_total;


        System.out.print("Digite quanto você ganha de salário: R$");
        salario = sc.nextDouble();

        System.out.print("Quantos depedentes você possui em sua residência, além de você?");
        numero_de_dependentes = sc.nextInt();

        sc.nextLine();

        System.out.print("Qual a classe em que você está inserido? (A, B, C ou D)");
        classe = sc.nextLine();

        if (classe.equalsIgnoreCase("A")) {
            imposto = 0;
            System.out.println("\n==== CALCULANDO IMPOSTO ====");
            System.out.println("Classe : " +classe);
            System.out.println("Você é isento de imposto!!");
            System.out.println("Imposto: " + imposto);
            System.out.println("Número de dependentes: " + numero_de_dependentes);
            System.out.println("Salário: " +salario);
        } else if (classe.equalsIgnoreCase("B")){
            imposto = salario * 0.05;
            desconto_sobre_imposto = numero_de_dependentes * 15;
            imposto_total = imposto - desconto_sobre_imposto;
            System.out.println("\n==== CALCULANDO IMPOSTO ====");
            System.out.println("Classe : " +classe);
            System.out.println("Imposto á pagar: R$" + imposto_total);
            System.out.println("Salário: R$" + salario);
            System.out.println("Número de dependentes: " + numero_de_dependentes);
            System.out.println("Desconto sobre o imposto cobrado: R$" + desconto_sobre_imposto);
        } else if (classe.equalsIgnoreCase("C")) {
            imposto = salario * 0.10;
            desconto_sobre_imposto = numero_de_dependentes * 15;
            imposto_total = imposto - desconto_sobre_imposto;
            System.out.println("\n==== CALCULANDO IMPOSTO ====");
            System.out.println("Classe : " +classe);
            System.out.println("Imposto á pagar: R$" + imposto_total);
            System.out.println("Salário: R$" + salario);
            System.out.println("Número de dependentes: " + numero_de_dependentes);
            System.out.println("Desconto sobre o imposto cobrado: R$" + desconto_sobre_imposto);
        } else if (classe.equalsIgnoreCase("D")) {
            imposto = salario * 0.15;
            desconto_sobre_imposto = numero_de_dependentes * 15;
            imposto_total = imposto - desconto_sobre_imposto;
            System.out.println("\n==== CALCULANDO IMPOSTO ====");
            System.out.println("Classe : " +classe);
            System.out.println("Imposto á pagar: R$" + imposto_total);
            System.out.println("Salário: R$" + salario);
            System.out.println("Número de dependentes: " + numero_de_dependentes);
            System.out.println("Desconto sobre o imposto cobrado: R$" + desconto_sobre_imposto);
        }
        sc.close();
    }
}

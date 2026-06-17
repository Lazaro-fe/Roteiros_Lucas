// package Roteiro_03;
import java.util.Scanner;

public class Questao_03 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade;
        String dia_da_semana;
        double preco_total_do_ingresso;

        System.out.println("Digite a sua idade: ");
        idade = sc.nextInt();

        sc.nextLine();

        System.out.println("Digite o dia da semana: (Ex: Segunda, Terça, Quarta, Quinta, Sexta, Sábado e Domingo)");
        dia_da_semana = sc.nextLine();

        double preco_base;

        if (idade <= 11) {
            preco_base = 15.0;
        } else if (idade <= 59) {
            preco_base = 30.0;
        } else {
            preco_base = 20;
        }

        if (dia_da_semana.equals("Quarta") || dia_da_semana.equals("quarta")) {
            preco_total_do_ingresso = preco_base / 2;
            System.out.println("\n==== CINEMA DE CANNES ====");
            System.out.println("Idade : " + idade);
            System.out.println("Dia da Semana : " + dia_da_semana);
            System.out.println("Preço Base do ingresso : " + preco_total_do_ingresso);
        } else {
            System.out.println("\n==== CINEMA DE CANNES ====");
            System.out.println("Idade : " +idade);
            System.out.println("Dia da Semana : " + dia_da_semana);
            System.out.println("Preço Base do ingresso : " + preco_base);
        }
        sc.close();
    }
}
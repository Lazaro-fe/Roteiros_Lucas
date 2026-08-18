// package Roteiro_03;

import java.util.Scanner;

public class Questao_07 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int dia_da_semana;
        int mes_do_ano;
        int ano;

        System.out.print("Digite o dia em que você se encontra:");
        dia_da_semana = sc.nextInt();

        System.out.print("Digite o mês do ano em que você se encontra: ");
        mes_do_ano = sc.nextInt();

        System.out.print("Digite o mes do ano em que você se encncontra: ");
        ano = sc.nextInt();

        int tipo_de_personalidade = (dia_da_semana + mes_do_ano + ano) % 4;

        if (tipo_de_personalidade == 0) {
            System.out.println("\n=== RESULTADO ===");
            System.out.println("Tipo de personalidade: Discreto");
            System.out.println("Resultado: " +tipo_de_personalidade);
        } else if (tipo_de_personalidade == 1) {
            System.out.println("\n=== RESULTADO ===");
            System.out.println("Tipo de personalidade: Amoroso");
            System.out.println("Resultado: " +tipo_de_personalidade);
        } else if (tipo_de_personalidade == 2) {
            System.out.println("\n=== RESULTADO ===");
            System.out.println("Tipo de personalidade: Tímido");
            System.out.println("Resultado: " +tipo_de_personalidade);
        } else {
            System.out.println("\n=== RESULTADO ===");
            System.out.println("Tipo de personalidade: Namorador");
            System.out.println("Resultado: " +tipo_de_personalidade);
        }

        sc.close();
    }
}

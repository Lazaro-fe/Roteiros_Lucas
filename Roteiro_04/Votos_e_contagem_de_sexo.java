package Roteiro_04;

import java.util.Scanner;

public class Votos_e_contagem_de_sexo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sexo;
        int opniao = 0;
        int votos_contra = 0;
        int votos_a_favor = 0;
        int votos_dos_que_nao_sabem = 0;
        int total_de_entrevistados = 8;
        int homens_a_favor = 0;

        System.out.println("\n===== Qual é sua opnião sobre a guerra do Iraque? =====");
        System.out.println("1 - A FAVOR");
        System.out.println("2 - CONTRA");
        System.out.println("3 - NÃO TENHO OPNIÃO SOBRE");
        System.out.println("");
        System.out.println();

        for(int fa = 1; fa <= total_de_entrevistados; fa++){
            System.out.println("Digite seu sexo: ");
            sexo = sc.next();

            System.out.println("Digite sua opnião baseada nos números apresentados na tabela: ");
            opniao = sc.nextInt();

            if (sexo.equalsIgnoreCase("M") && opniao == 1) {
                homens_a_favor++;
            }

            switch (opniao) {
                case 1:
                    votos_a_favor++;
                    System.out.println("--> Você votou a favor Guerra do Iraque!");
                    break;
                case 2:
                    votos_contra++;
                    System.out.println("--> Você votou contra a Guerra do Iraque!");
                    break;
                case 3:
                    votos_dos_que_nao_sabem++;
                    System.out.println("--> Você não tem opnião sobre o tema!");
                    break;
                default:
                    System.out.println("Digite os números que estão na tabela (1, 2 e 3) ");
                    break;
            }
        }

        double Porcentagem_de_homens_a_favor_da_guerra = ((double) homens_a_favor / homens_a_favor) * 100;

        System.out.println("\n===== RESULTADO DA ENTREVISTA =====");
        System.out.println("Números de pessoas a favor da guerra: " + votos_a_favor);
        System.out.println("Números de pessoas contra a guerra: " + votos_contra);
        System.out.println("Números que não possuem opnião sobre a guerra: " + votos_dos_que_nao_sabem);
        System.out.println("Percentual de homens a favor da guerra: " + Porcentagem_de_homens_a_favor_da_guerra);
        sc.close();
    }
}
package Roteiro_04;

import java.util.Scanner;

public class Eleicao_de_pessoas {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int canditato_jao = 0;
        int canditato_mario = 0;
        int voto_branco = 0;
        int voto_nulo = 0;
        int opção_de_voto = 0;

        while (true) {
            System.out.println("\n==== ELEIÇÃO ====");
            System.out.println("1 - Jão do Bar");
            System.out.println("2 - Mario ");
            System.out.println("3 - Branco");
            System.out.println("4 - Voto Nulo");
            System.out.println("5 - Encerrando votação");
            System.out.println();
            System.out.print("Digite a sua opção de voto: ");
            opção_de_voto = sc.nextInt();
            sc.nextLine();

            if (opção_de_voto == 5) {
                System.out.println("Encerrando a Eleição!!\nEspere para as próximas eleições");
                break;
            }

            switch (opção_de_voto) {
                case 1:
                    canditato_jao++;
                    System.out.println("--> Você votou no Jão do bar");
                    break;
                case 2:
                    canditato_mario++;
                    System.out.println("--> Você votou no Mario");
                    break;
                case 3:
                    voto_branco++;
                    System.out.println("--> Você votou Branco");
                    break;
                default:
                    voto_nulo++;
                    System.out.println("--> Você votou Nulo");
                    break;
            }
        }

        System.out.println("\n===== RESULTADO DAS ELEIÇÕES =====");
        System.out.println("Quantidade de votos para Jão do Bar: " + canditato_jao);
        System.out.println("Quantidade de votos para Mario: " + canditato_mario);
        System.out.println("Quantidade de votos no Branco: " + voto_branco);
        System.out.println("Quantidade de votos no Nulo: " + voto_nulo);
        sc.close();
    }
}
package Roteiro_04;

import java.util.Scanner;

public class Nova_votacao {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao_de_voto_eleicao = 0;
        double canditato_joana = 0;
        double canditato_eduardo = 0;
        double voto_branco = 0;
        double voto_nulo = 0;
        double total_de_eleitores = 12;

        System.out.println("\n===== ELEIÇÃO =====");
        System.out.println("1 - Candidata Joana");
        System.out.println("2 - Candidato Eduardo");
        System.out.println("3 - Voto em Branco");
        System.out.println("Qualquer outro número será considerado voto nulo");
        System.out.println();

            for (int vo = 0; vo <= total_de_eleitores; vo++){
                System.out.print("Digite a sua opção de voto: ");
                opcao_de_voto_eleicao = sc.nextInt();

                switch (opcao_de_voto_eleicao) {
                case 1:
                    canditato_joana++;
                    System.out.println("--> Você votou na Candidata Joana!");
                    break;
                case 2:
                    canditato_eduardo++;
                    System.out.println("--> Você votou no Candidato Eduardo!");
                    break;
                case 3:
                    voto_branco++;
                    System.out.println("--> Você votou Branco!");
                    break;
                default:
                    voto_nulo++;
                    System.out.println("--> Seu voto foi redirecionado para o nulo!");
                    break;
                }
            }

        double percentual_dos_votos_brancos = (voto_branco / total_de_eleitores) * 100;
        double percentual_dos_votos_nulos = (voto_nulo / total_de_eleitores) * 100;

        System.out.println("\n====== RESULTADO DAS ELEIÇÕES ======");
        System.out.println("Quantidade de votos para a candidata Joana: " + canditato_joana);
        System.out.println("Quantidade de votos para o candidato Eduardo: " + canditato_eduardo);
        System.out.println("Percentual de votos Brancos: " + percentual_dos_votos_brancos);
        System.out.println("Percentual de votos Nulos: " + percentual_dos_votos_nulos);

        sc.close();
    }
}
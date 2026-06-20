package Roteiro_10;
import java.util.Scanner;

public class Organizacao_de_vetor_de_forma_crescente_e_decrescente {
    
    public static void ordenarVetor(int[] vetor_para_ordenar, int tipo_de_ordenacao) {
        int limite_do_laco_externo = 10;
        int indice_externo = 0;
        int indice_interno;
        int variavel_temporaria_de_troca_entre_os_numeros_do_vetor;

        while (indice_externo < limite_do_laco_externo) {
            indice_interno = 0;
            
            while (indice_interno < (limite_do_laco_externo - 1)) {
                
                if (tipo_de_ordenacao == 1) {
                    if (vetor_para_ordenar[indice_interno] > vetor_para_ordenar[indice_interno + 1]) {
                        variavel_temporaria_de_troca_entre_os_numeros_do_vetor = vetor_para_ordenar[indice_interno];
                        vetor_para_ordenar[indice_interno] = vetor_para_ordenar[indice_interno + 1];
                        vetor_para_ordenar[indice_interno + 1] = variavel_temporaria_de_troca_entre_os_numeros_do_vetor;
                    }
                } else if (tipo_de_ordenacao == 2) {
                    if (vetor_para_ordenar[indice_interno] < vetor_para_ordenar[indice_interno + 1]) {
                        variavel_temporaria_de_troca_entre_os_numeros_do_vetor = vetor_para_ordenar[indice_interno];
                        vetor_para_ordenar[indice_interno] = vetor_para_ordenar[indice_interno + 1];
                        vetor_para_ordenar[indice_interno + 1] = variavel_temporaria_de_troca_entre_os_numeros_do_vetor;
                    }
                }

                indice_interno = indice_interno + 1;
            }
            indice_externo = indice_externo + 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor_dos_numeros = new int[10];
        int localizacao_dos_numeros_do_vetor = 0;

        System.out.println("=== PREENCHIMENTO DO VETOR PARA ORDENAÇÃO ===");
        while (localizacao_dos_numeros_do_vetor < 10) {
            System.out.print("Digite o número para a posição " + localizacao_dos_numeros_do_vetor + ": ");
            vetor_dos_numeros[localizacao_dos_numeros_do_vetor] = sc.nextInt();
            localizacao_dos_numeros_do_vetor = localizacao_dos_numeros_do_vetor + 1;
        }

        int escolha_de_opcao;
        System.out.println("\n=== ESCOLHA O TIPO DE ORDENAÇÃO ===");
        System.out.println("1 -> Ordem crescente");
        System.out.println("2 -> Ordem decrescente");
        System.out.print("Sua escolha: ");
        escolha_de_opcao = sc.nextInt();

        if (escolha_de_opcao == 1 || escolha_de_opcao == 2) {
            ordenarVetor(vetor_dos_numeros, escolha_de_opcao);

            System.out.println("\n=== VETOR ORDENADO ===");
            int impressao_de_vetor = 0;
            while (impressao_de_vetor < 10) {
                System.out.println("Posição " + impressao_de_vetor + ": " + vetor_dos_numeros[impressao_de_vetor]);
                impressao_de_vetor = impressao_de_vetor + 1;
            }
        } else {
            System.out.println("Opção inválida! Você deve digitar 1 ou 2.");
        }

        sc.close();
    }
}

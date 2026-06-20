package Roteiro_08;
import java.util.Scanner;

public class Vetor_com_dez_valores_armazenados {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetores_de_numeros_armazenados = new int[10];

        int quantidade_de_numeros_que_serao_inseridos = 0;

        System.out.println("\n== PREENCHENDO O VETOR ==");
        while (quantidade_de_numeros_que_serao_inseridos < 10) {
            System.out.print("Digite o " + (quantidade_de_numeros_que_serao_inseridos + 1) + "° número inteiro no vetor: ");
            int numeros_digitados = sc.nextInt();

            if (numeros_digitados % 1 != 0) {
                System.out.println("Não é permitido adicionar números fracionários no vetor!");
                continue;
            }

            int numero_presente_dentro_do_vetor = 0;
            for(int os = 0; os < quantidade_de_numeros_que_serao_inseridos; os++){
                if (vetores_de_numeros_armazenados[os] == numeros_digitados) {
                    numero_presente_dentro_do_vetor = 1;
                }
            }

            if (numero_presente_dentro_do_vetor == 1) {
                System.out.println("Esse número já foi inserido no vetor, tente adicionar outro número!");
            } else {
                vetores_de_numeros_armazenados[quantidade_de_numeros_que_serao_inseridos] = numeros_digitados;
                quantidade_de_numeros_que_serao_inseridos++;
            }
        }

        System.out.println("\n== ORDENANDO O VETOR ==");
        for(int ui = 0; ui < 10; ui++){
            for(int gui = 0; gui < 9; gui++){
                if (vetores_de_numeros_armazenados[gui] > vetores_de_numeros_armazenados[gui + 1]) {
                    int troca_os_numeros_de_posicao = vetores_de_numeros_armazenados[gui];
                    vetores_de_numeros_armazenados[gui] = vetores_de_numeros_armazenados[gui + 1];
                    vetores_de_numeros_armazenados[gui + 1] = troca_os_numeros_de_posicao;
                }
            }
        }

        System.out.println("\n== VETOR ORDENADO ==");
        for(int lo = 0; lo < 10; lo++){
            System.out.println(vetores_de_numeros_armazenados[lo] + " | ");
        }
        System.out.println();

        System.out.println("\n== CALCÚLO ==");
        int calculo_inicial = 0;
        for(int dis = 0; dis < 5; dis++){
            calculo_inicial = calculo_inicial + (vetores_de_numeros_armazenados[dis] * vetores_de_numeros_armazenados[9 - dis]);
        }
        System.out.println("O resultado desse cálculo: " + calculo_inicial);

        System.out.println("\n== MÉDIA E OS VALORES ABAIXO DA MÉDIA ==");
        double calcular_media_por_meio_da_soma = 0;
        for(int wek = 0; wek < 10; wek++){
            calcular_media_por_meio_da_soma = calcular_media_por_meio_da_soma + vetores_de_numeros_armazenados[wek];
        }
        double valor_da_media_dos_valores_dentro_do_vetor = calcular_media_por_meio_da_soma / 10;
        System.out.println("A média dos valores dentro do vetor é: " +valor_da_media_dos_valores_dentro_do_vetor);

        int valores_que_estao_abaixo_da_media_dos_numeros_nos_vetores = 0;
        for(int hug = 0; hug < 10; hug++){
            if (vetores_de_numeros_armazenados[hug] < valor_da_media_dos_valores_dentro_do_vetor) {
                valores_que_estao_abaixo_da_media_dos_numeros_nos_vetores++;
            }
        }
        System.out.println("Quantidade de números que estão abaixo da média: " +valores_que_estao_abaixo_da_media_dos_numeros_nos_vetores);

        System.out.println("\n=== PESQUISA PELO VALOR ===");
        System.out.print("Digite um número para pesquisar a posição em que ele se encontra: ");
        int numero_pesquisado = sc.nextInt();
        int posicao_dos_numeros_encontrados = 0;
        for (int kiz = 0; kiz < 10; kiz++) {
            if (vetores_de_numeros_armazenados[kiz] == numero_pesquisado) {
                posicao_dos_numeros_encontrados = kiz + 1;
                break;
            }
        }
        System.out.println("Posição do número no vetor: " + posicao_dos_numeros_encontrados);

        System.out.println("\n=== ELIMINAÇÃO DE ELEMENTO ===");
        System.out.print("Digite um número para ser eliminado do vetor: ");
        int numero_que_sera_excluido = sc.nextInt();
        int numero_exclusao = -1;
        
        for (int jop = 0; jop < 10; jop++) {
            if (vetores_de_numeros_armazenados[jop] == numero_que_sera_excluido) {
                numero_exclusao = jop;
                break;
            }
        }
        
        if (numero_exclusao == -1) {
            System.out.println("O número digitado não existe no vetor!");
        } else {
            for (int fer = numero_exclusao; fer < 9; fer++) {
                vetores_de_numeros_armazenados[fer] = vetores_de_numeros_armazenados[fer + 1];
            }
            vetores_de_numeros_armazenados[9] = -1;
            
            System.out.print("O VETOR APÓS A EXCLUSÃO DO NÚMERO: ");
            for (int tiv = 0; tiv < 10; tiv++) {
                System.out.print(vetores_de_numeros_armazenados[tiv] + " | ");
            }
            System.out.println();
        }
        sc.close();
    }
}
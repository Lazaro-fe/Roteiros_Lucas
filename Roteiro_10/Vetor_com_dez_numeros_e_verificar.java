package Roteiro_10;
import java.util.Scanner;

public class Vetor_com_dez_numeros_e_verificar {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor_de_numeros_para_verificacao = new int[10];
        int indice_dos_numeros_presentes_no_vetor = 0;

        int quantidade_de_numeros_pares_no_vetor = 0;
        int quantidade_de_numeros_impares_no_vetor = 0;
        int quantidade_de_numeros_maiores_que_cinquenta_presentes_no_vetor = 0;

        System.out.println("=== PREENCHIMENTO DO VETOR ===");
        while (indice_dos_numeros_presentes_no_vetor < 10) {
            System.out.print("Digite o número para a posição " + indice_dos_numeros_presentes_no_vetor + ": ");
            vetor_de_numeros_para_verificacao[indice_dos_numeros_presentes_no_vetor] = sc.nextInt();
            
            if (vetor_de_numeros_para_verificacao[indice_dos_numeros_presentes_no_vetor] % 2 == 0) {
                quantidade_de_numeros_pares_no_vetor = quantidade_de_numeros_pares_no_vetor + 1;
            } else {
                quantidade_de_numeros_impares_no_vetor = quantidade_de_numeros_impares_no_vetor + 1;
            }

            if (vetor_de_numeros_para_verificacao[indice_dos_numeros_presentes_no_vetor] > 50) {
                quantidade_de_numeros_maiores_que_cinquenta_presentes_no_vetor = quantidade_de_numeros_maiores_que_cinquenta_presentes_no_vetor + 1;
            }

            indice_dos_numeros_presentes_no_vetor = indice_dos_numeros_presentes_no_vetor + 1;
        }

        System.out.println("\n=== RESULTADOS DA ANÁLISE ===");
        System.out.println("Quantidade de valores pares: " + quantidade_de_numeros_pares_no_vetor);
        System.out.println("Quantidade de valores ímpares: " + quantidade_de_numeros_impares_no_vetor);
        System.out.println("Quantidade de valores maiores que 50: " + quantidade_de_numeros_maiores_que_cinquenta_presentes_no_vetor);

        sc.close();
    }
}

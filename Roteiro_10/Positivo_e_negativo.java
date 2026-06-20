package Roteiro_10;
import java.util.Scanner;

public class Positivo_e_negativo {
    
    public static void vericar_numeros_positivos_negativos_e_neutros(int[] vetor_para_analise_de_numeros) {
        int quantidade_de_numeros_positivos_em_um_vetor = 0;
        int quantidade_de_numeros_negativos_em_um_vetor = 0;
        int quantidade_de_numeros_zeros_em_um_vetor = 0;
        int indice_dos_numeros_presentes_dentro_do_vetor = 0;

        while (indice_dos_numeros_presentes_dentro_do_vetor < 6) {
            if (vetor_para_analise_de_numeros[indice_dos_numeros_presentes_dentro_do_vetor] > 0) {
                quantidade_de_numeros_positivos_em_um_vetor = quantidade_de_numeros_positivos_em_um_vetor + 1;
            } else if (vetor_para_analise_de_numeros[indice_dos_numeros_presentes_dentro_do_vetor] < 0) {
                quantidade_de_numeros_negativos_em_um_vetor = quantidade_de_numeros_negativos_em_um_vetor + 1;
            } else {
                quantidade_de_numeros_zeros_em_um_vetor = quantidade_de_numeros_zeros_em_um_vetor + 1;
            }
            indice_dos_numeros_presentes_dentro_do_vetor = indice_dos_numeros_presentes_dentro_do_vetor + 1;
        }

        System.out.println("\n=== RELATÓRIO DO VETOR ===");
        System.out.println("Números positivos: " + quantidade_de_numeros_positivos_em_um_vetor);
        System.out.println("Números negativos: " + quantidade_de_numeros_negativos_em_um_vetor);
        System.out.println("Números zeros: " + quantidade_de_numeros_zeros_em_um_vetor);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetores_de_numeros_positivos_negativos_e_neutros = new int[6];
        int indice_dos_numeros_presentes_dentro_do_vetor = 0;

        System.out.println("=== PREENCHIMENTO DO VETOR ===");
        while (indice_dos_numeros_presentes_dentro_do_vetor < 6) {
            System.out.print("Digite um número inteiro para a posição " + indice_dos_numeros_presentes_dentro_do_vetor + ": ");
            vetores_de_numeros_positivos_negativos_e_neutros[indice_dos_numeros_presentes_dentro_do_vetor] = sc.nextInt();
            indice_dos_numeros_presentes_dentro_do_vetor = indice_dos_numeros_presentes_dentro_do_vetor + 1;
        }

        vericar_numeros_positivos_negativos_e_neutros(vetores_de_numeros_positivos_negativos_e_neutros);

        sc.close();
    }
}

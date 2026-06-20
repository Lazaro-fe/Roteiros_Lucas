package Roteiro_10;
import java.util.Scanner;

public class Media_de_aluno {
    
    public static double calcular_media_dos_alunos(double[] vetor_para_calculo_de_media_dos_alunos) {
        double soma_das_notas_dos_alunos = 0;
        int posicao_em_que_as_notas_estao_encontradas = 0;

        while (posicao_em_que_as_notas_estao_encontradas < 8) {
            soma_das_notas_dos_alunos = soma_das_notas_dos_alunos + vetor_para_calculo_de_media_dos_alunos[posicao_em_que_as_notas_estao_encontradas];
            posicao_em_que_as_notas_estao_encontradas = posicao_em_que_as_notas_estao_encontradas + 1;
        }

        double valor_da_media = soma_das_notas_dos_alunos / 8.0;
        return valor_da_media;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] vetor_de_notas = new double[8];
        int posicao_em_que_as_notas_estao_encontradas = 0;

        System.out.println("=== PREENCHIMENTO DAS NOTAS ===");
        while (posicao_em_que_as_notas_estao_encontradas < 8) {
            System.out.print("Digite a nota para a posição " + posicao_em_que_as_notas_estao_encontradas + ": ");
            vetor_de_notas[posicao_em_que_as_notas_estao_encontradas] = sc.nextDouble();
            posicao_em_que_as_notas_estao_encontradas = posicao_em_que_as_notas_estao_encontradas + 1;
        }

        double resultado_da_media = calcular_media_dos_alunos(vetor_de_notas);

        System.out.println("\n=== RESULTADO FINAL ===");
        System.out.println("A média calculada foi: " + resultado_da_media);

        if (resultado_da_media >= 7.0) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }

        sc.close();
    }
}
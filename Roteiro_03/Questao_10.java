// package Roteiro_03;

import java.util.Scanner;

public class Questao_10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double tempo_do_competidor;
        double tempo_minimo;
        double pontuacao;

        System.out.println("Digite qual o tempo do competidor: ");
        tempo_do_competidor = sc.nextDouble();

        System.out.println("Digite o tempo minimo: ");
        tempo_minimo = sc.nextDouble();

        double x = tempo_do_competidor - tempo_minimo;

        if (x < 3) {
            pontuacao = 100;
        } else if (x >= 3 && x <= 5) {
            pontuacao = 80;
        } else {
            pontuacao = 80 - (x - 5);
        }

        System.out.println("\n=== PONTUAÇÃO ===");
        System.out.println("Tempo do Competidor: " + tempo_do_competidor);
        System.out.println("Tempo Mínimo: " + tempo_minimo);
        System.out.println("Pontuação: " +pontuacao);

        sc.close();
    }
}
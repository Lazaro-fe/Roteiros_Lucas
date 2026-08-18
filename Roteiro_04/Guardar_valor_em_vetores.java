package Roteiro_04;

import java.util.Scanner;

public class Guardar_valor_em_vetores {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] vetor_numeros = new int[16];

        System.out.println("Digite 16 números inteiros: ");
        for(int x = 0; x < 16; x++){
            System.out.println("Posicão " +x+ " : ");
            vetor_numeros[x] = sc.nextInt();
        }

        for(int x = 0; x < 8; x++){
            int guardar_valor = vetor_numeros[x];

            vetor_numeros[x] = vetor_numeros[x + 8];

            vetor_numeros[x + 8] = guardar_valor;
        }

        System.out.println("\n====VETOR APÓS A TROCA DE POSIÇÕES ====");
        for (int i = 0; i < 16; i++) {
            System.out.print(vetor_numeros[i] + " ");
        }
        sc.close();
    }
}
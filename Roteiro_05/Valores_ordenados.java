package Roteiro_05;

import java.util.Scanner;

public class Valores_ordenados {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] vetor_de_numeros_a_serem_digitados = new int[10];

        System.out.println("\n=== Preenchendo o Vetor ===");
        for(int x = 0; x < 10; x++){
            System.out.print("Digite 10 números inteiros: ");
            vetor_de_numeros_a_serem_digitados[x] = sc.nextInt();
        }

        for(int conf = 0; conf < 10; conf++){
            for(int fi = 0; fi < 9; fi++){
                if (vetor_de_numeros_a_serem_digitados[fi] < vetor_de_numeros_a_serem_digitados[fi + 1]) {
                    int aux = vetor_de_numeros_a_serem_digitados[fi];
                    vetor_de_numeros_a_serem_digitados[fi] = vetor_de_numeros_a_serem_digitados[fi +1];
                    vetor_de_numeros_a_serem_digitados[fi + 1] = aux;
                }
            }
        }

        System.out.println("\n====== EXIBIDO VALORES ORDENADOS ======");
        for(int i = 0; i < 10; i++){
            System.out.println(vetor_de_numeros_a_serem_digitados[i] + "");
        }

        System.out.println();
        sc.close();
    }
}

package Roteiro_05;

import java.util.Scanner;

public class Menor_numero {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] vetor_de_numeros = new int[10];

        System.out.println("\n==== PREENCHENDO O VETOR ====");
        for(int x = 0; x < 10; x++){
            System.out.print("Digite o " + x + " número: ");
            vetor_de_numeros[x] = sc.nextInt();
        }

        int menor_valor_digitado = vetor_de_numeros[0];
        int posicao_vetor = vetor_de_numeros[0];

        for(int x = 0; x < 10; x++){
            if (vetor_de_numeros[x] < menor_valor_digitado) {
                menor_valor_digitado = vetor_de_numeros[x];
                posicao_vetor = x;
            }
        }

        sc.close();
        System.out.println("\n===== RESULTADO DOS NÚMEROS =====");
        System.out.println("O menor valor digitado: " +menor_valor_digitado);
        System.out.println("A posição do menor número é: " +posicao_vetor);
    }
}

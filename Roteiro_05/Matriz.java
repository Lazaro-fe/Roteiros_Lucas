package Roteiro_05;

import java.util.Scanner;

public class Matriz {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] matrix = new int[5][5];

        for(int i = 0; i < 5; i++){
            for(int g = 0; g < 5; g++){
                System.out.println("Digite um número para preencher a posição:  [" +i+ "] --- ["  +g+ "]");
                matrix[i][g] = sc.nextInt();
                sc.nextLine();
            }
        }

        int maior_numero = matrix[0][0];
        int menor_numero = matrix[0][0];

        int linha_maior_da_matrix = 0;
        int linha_menor_da_matrix = 0;

        int coluna_maior_da_matrix = 0;
        int coluna_menor_da_matrix = 0;

        for(int i = 0; i < 5; i++){
            for(int g = 0; g < 5; g++){

                if (matrix[i][g] > maior_numero) {
                    maior_numero = matrix[i][g];
                    linha_maior_da_matrix = i;
                    coluna_maior_da_matrix = g;
                }

                if(matrix[i][g] < menor_numero){
                    menor_numero = matrix[i][g];
                    linha_menor_da_matrix = i;
                    coluna_menor_da_matrix = g;
                }
            }
        }

        System.out.println("\n=== RESULTADO DA MATRIz ===");
        System.out.println("Maior Valor da Matriz:  " +maior_numero);
        System.out.println("Posição do Maior --> Linha:  " + linha_maior_da_matrix + " --- Coluna: " +coluna_maior_da_matrix);
        System.out.println("Menor Valor da Matriz: " + menor_numero);
        System.out.println("Posição do Menor Valor --> Linha:  " + linha_menor_da_matrix + " --- Coluna: " + coluna_menor_da_matrix);
        sc.close();
    }
}
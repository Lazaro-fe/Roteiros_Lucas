package Roteiro_07;
import java.util.Scanner;

public class Menor_valor_de_cada_linha {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix_geral = new int[4][3];

        for(int bro = 0; bro < 4; bro++){
            for(int fran = 0; fran < 3; fran++){
                System.out.print("Digite números para a posição [ " + bro + " ] [ " + fran + " ]: ");
                matrix_geral[bro][fran] = sc.nextInt();
            }
        }

        for(int uso = 0; uso < 4; uso++){
            int menor_valor_de_cada_linha_da_matriz = matrix_geral[uso][0];
            for(int sun = 0; sun < 3; sun++){
                if (matrix_geral[uso][sun] < menor_valor_de_cada_linha_da_matriz) {
                    menor_valor_de_cada_linha_da_matriz = matrix_geral[uso][sun];
                }
            }
            System.out.println("Os menores valores da linha " + uso + " é: " + menor_valor_de_cada_linha_da_matriz);
        }

        sc.close();
    }
}

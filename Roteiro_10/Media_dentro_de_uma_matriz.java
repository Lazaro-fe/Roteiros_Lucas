package Roteiro_10;
import java.util.Scanner;

public class Media_dentro_de_uma_matriz {
    public static void mostrarValoresAcimaDaMedia(int[][] matriz_de_medias) {
        double soma_de_todos_os_numeros_da_matriz = 0;
        int quantidade_de_numeros_dentro_da_matriz = 25;
        int linha_dentro_da_matriz = 0;
        int coluna_dentro_da_matriz;

        while (linha_dentro_da_matriz < 5) {
            coluna_dentro_da_matriz = 0;
            while (coluna_dentro_da_matriz < 5) {
                soma_de_todos_os_numeros_da_matriz = soma_de_todos_os_numeros_da_matriz + matriz_de_medias[linha_dentro_da_matriz][coluna_dentro_da_matriz];
                coluna_dentro_da_matriz = coluna_dentro_da_matriz + 1;
            }
            linha_dentro_da_matriz = linha_dentro_da_matriz + 1;
        }

        double media_de_notas_calculadas = soma_de_todos_os_numeros_da_matriz / quantidade_de_numeros_dentro_da_matriz;
        System.out.println("\nA média de todos os elementos da matriz é: " + media_de_notas_calculadas);
        System.out.println("Valores que estão ACIMA da média:");

        linha_dentro_da_matriz = 0;
        while (linha_dentro_da_matriz < 5) {
            coluna_dentro_da_matriz = 0;
            while (coluna_dentro_da_matriz < 5) {
                if (matriz_de_medias[linha_dentro_da_matriz][coluna_dentro_da_matriz] > media_de_notas_calculadas) {
                    System.out.println("Valor " + matriz_de_medias[linha_dentro_da_matriz][coluna_dentro_da_matriz] + " (Encontrado na Linha " + linha_dentro_da_matriz + ", Coluna " + coluna_dentro_da_matriz + ")");
                }
                coluna_dentro_da_matriz = coluna_dentro_da_matriz + 1;
            }
            linha_dentro_da_matriz = linha_dentro_da_matriz + 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz_de_notas = new int[5][5];
        int linha_dentro_da_matriz = 0;
        int coluna_dentro_da_matriz;

        System.out.println("\n=== PREENCHIMENTO DA MATRIZ ===");
        while (linha_dentro_da_matriz < 5) {
            coluna_dentro_da_matriz = 0;
            while (coluna_dentro_da_matriz < 5) {
                System.out.print("Digite o valor para a Linha " + linha_dentro_da_matriz + ", Coluna " + coluna_dentro_da_matriz + ": ");
                matriz_de_notas[linha_dentro_da_matriz][coluna_dentro_da_matriz] = sc.nextInt();
                coluna_dentro_da_matriz = coluna_dentro_da_matriz + 1;
            }
            linha_dentro_da_matriz = linha_dentro_da_matriz + 1;
        }

        mostrarValoresAcimaDaMedia(matriz_de_notas);

        sc.close();
    }
}

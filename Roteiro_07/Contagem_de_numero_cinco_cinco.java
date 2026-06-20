package Roteiro_07;
import java.util.Scanner;

public class Contagem_de_numero_cinco_cinco {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix_de_contagem = new int[4][3];

        for(int kia = 0; kia < 4; kia++){
            for(int pio = 0; pio < 3; pio++){
                System.out.print("Digite valores númericos para preencher as posições [ " + kia + " ] [ " + pio + " ]:");
                matrix_de_contagem[kia][pio] = sc.nextInt();
            }
        }

        int partes_da_matrizes_com_numero_cinco_cinco = 0;
        int linha_com_maior_numero_de_cinco_cinco = 0;

        for(int mun = 0; mun < 4; mun++){
            int contandor_de_numeros_cinco_cinco = 0;
            for(int en = 0; en < 3; en++){
                if (matrix_de_contagem[mun][en] == 55) {
                    contandor_de_numeros_cinco_cinco++;
                }
            }

            if (contandor_de_numeros_cinco_cinco > partes_da_matrizes_com_numero_cinco_cinco) {
                partes_da_matrizes_com_numero_cinco_cinco = contandor_de_numeros_cinco_cinco;
                linha_com_maior_numero_de_cinco_cinco = mun;
            }
        }
        System.out.println("A linha com valores iguais a 55 armazenados e a linha: " +linha_com_maior_numero_de_cinco_cinco);

        sc.close();
    }
}
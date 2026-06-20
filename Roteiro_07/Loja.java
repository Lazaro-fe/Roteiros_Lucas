package Roteiro_07;
import java.util.Scanner;

public class Loja {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] matriz_de_loja = new double[6][3];
        double faturamento_total_de_vendas_da_loja = 0;

        for(int gu = 0; gu < 6; gu++){
            System.out.println("Mercadoria " + (gu + 1) + " : ");

            System.out.print("Código dos Produtos: ");
            matriz_de_loja[gu][0] = sc.nextDouble();

            System.out.print("Quantidade de produtos vendidos: ");
            matriz_de_loja[gu][1] = sc.nextDouble();

            System.out.print("Preços: ");
            matriz_de_loja[gu][2] = sc.nextDouble();

            faturamento_total_de_vendas_da_loja = faturamento_total_de_vendas_da_loja + (matriz_de_loja[gu][1] * matriz_de_loja[gu][2]);
        }

        System.out.println("O faturamento total da loja nesse mês foi de: R$ " + faturamento_total_de_vendas_da_loja);
        sc.close();
    }
}
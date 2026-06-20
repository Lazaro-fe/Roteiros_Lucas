package Roteiro_07;
import java.util.Scanner;

public class Jogo_de_bingo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz_de_cartela_de_bingo = new int[3][3];

        System.out.println("\n=== PREENCHIMENTO DE CARTELA ===");
        int preenchendo_cartela_de_bingo_automaticamente = 1;
        for(int zi = 0; zi < 3; zi++){
            for(int wil = 0; wil < 3; wil++){
                matriz_de_cartela_de_bingo[zi][wil] = preenchendo_cartela_de_bingo_automaticamente;
                preenchendo_cartela_de_bingo_automaticamente++;
            }
        }

        System.out.print("\nSua cartela de bingo é:");
        for(int zi = 0; zi < 3; zi++){
            for(int wil = 0; wil < 3; wil++){
                System.out.print("[ " + matriz_de_cartela_de_bingo[zi][wil] + " ] ");
            }
            System.out.println();
        }

        int jogadas_certas_feitas_pelo_jogador = 0;
        int rodadas_necessarias_para_vencer = 0;

        System.out.println("\n== SORTEIO DOS NÚMEROS ==");
        while (jogadas_certas_feitas_pelo_jogador < 9) {
            System.out.println("Digite um número que você tem a intuição que foi sorteada: ");
            int palpite_de_numero_sorteado = sc.nextInt();
            rodadas_necessarias_para_vencer++;

            for(int qui = 0; qui < 3; qui++){
                for(int huj = 0; huj < 3; huj++){
                    if (matriz_de_cartela_de_bingo[qui][huj] == palpite_de_numero_sorteado) {
                        matriz_de_cartela_de_bingo[qui][huj] = -1;
                        jogadas_certas_feitas_pelo_jogador++;
                    }
                }
            }
        }

        System.out.println("\n== RESULTADO DO BINGO ==");
        System.out.println("BINGO!!");
        System.out.println("A quantidade de rodadas necessárias para vencer foram: " +rodadas_necessarias_para_vencer);

        System.out.println("\n== CARTELA FINAL DO BINGO ==");
        for(int jon = 0; jon < 3; jon++){
            for(int fig = 0; fig < 3; fig++){
                if(matriz_de_cartela_de_bingo[jon][fig] == -1) {
                    System.out.print("[ X ] ");
                } else {
                    System.out.print("[ " + matriz_de_cartela_de_bingo[jon][fig] + " ] ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
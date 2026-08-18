package Roteiro_04;

import java.util.Scanner;

public class Multiplos {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double numeros_multi;
        double contador_de_numeros = 0;
        double soma = 0;

        for(int d = 0; d <= 10; d++){
            System.out.print("Digite um número: ");
            numeros_multi = sc.nextInt();

            if (numeros_multi % 3 == 0 && numeros_multi != 0) {
                soma += numeros_multi;
                contador_de_numeros ++;
            }
        }

        if (contador_de_numeros > 0) {
            System.out.println("\n===== RESULTADO =====");
            double media = soma / contador_de_numeros;
            System.out.println("Quantidade de números múltiplos de 3 digitados: " +contador_de_numeros);
            System.out.println("A soma desses múltiplos: " +soma);
            System.out.println("A média dos múltiplos de 3 são: " +media);
        } else {
            System.out.println("Nenhum número múltiplo de 3 foi digitado!");
        }

        sc.close();
    }
}
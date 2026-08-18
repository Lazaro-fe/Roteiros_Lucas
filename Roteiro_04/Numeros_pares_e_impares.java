package Roteiro_04;

import java.util.Scanner;

public class Numeros_pares_e_impares {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numeros_pares_e_impares;

        for(int x = 0; x <= 10; x++){
            System.out.println("Digite um número: ");
            numeros_pares_e_impares = sc.nextInt();

            if (numeros_pares_e_impares % 2 == 0) {
                System.out.println("O número: " + numeros_pares_e_impares + " é Par");
            } else {
                System.out.println("O número " + numeros_pares_e_impares + " é Impar");
            }
        }
        sc.close();
    }
}
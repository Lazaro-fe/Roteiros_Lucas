package Roteiro_04;

import java.util.Scanner;

public class Soma_de_numeros {
    
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numeros;
        int soma = 0;

        for(int f = 0; f <=10 ; f++){
            System.out.println("Digite um número: ");
            numeros = sc.nextInt();
            soma += numeros;
        }

        System.out.println("Soma dos números: " +soma);
        sc.close();
    }
}

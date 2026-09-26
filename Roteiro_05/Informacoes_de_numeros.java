package Roteiro_05;

import java.util.Scanner;

public class Informacoes_de_numeros {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[15];
        
        for(int i = 0; i < 15; i++){
            System.out.print("Digite o " +i+ "° número: ");
            numeros[i] = sc.nextInt();
        }

        while (true) {
            System.out.println("\n=== INFORMAÇÕES SOBRE NÚMERO ===");
            System.out.println("1 - EXIBIR NÚMEROS PARES");
            System.out.println("2 - EXIBIR NÚMEROS IMPARES");
            System.out.println("3 - INFORMAR MÉDIA DE NÚMEROS");
            System.out.println("4 - ENCERRAR SISTEMA");
            System.out.println();
            System.out.print("Digite a opção desejada: ");
            int opção = sc.nextInt();

            switch (opção) {
                case 1:
                
                System.out.println("\n=== NÚMEROS PARES ===");
                for(int j = 0; j < 15; j++){
                    if (numeros[j] % 2 == 0) {
                        System.out.println(numeros[j] + " ");
                    }
                }

                    break;
                case 2:

                System.out.println("\n=== NÚMEROS IMPARES ===");
                for(int g = 0; g < 15; g++){
                    if (numeros[g] % 2 == 1) {
                        System.out.println(numeros[g] + "");
                    }
                }

                    break;
                case 3:

                    double soma = 0;

                    for(int i = 0; i < 15; i++){
                        soma += numeros[i];
                    }

                    double media = soma / numeros.length;

                    System.out.println("\n=== RESULTADOS ===");
                    System.out.println("Soma : " + soma);
                    System.out.println("Média: " +media);
                    break;
                case 4:

                    System.out.println("Saindo do Sistema!!\nObrigado...");
                    sc.close();
                  return;
                default:
                    break;
            }
        }
    }
}
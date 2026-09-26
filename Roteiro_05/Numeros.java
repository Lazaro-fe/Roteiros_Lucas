package Roteiro_05;

import java.util.Scanner;

public class Numeros {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros_digitados = new int[50];
        int quantidade_de_numeros_digitados = 0;

        while (true) {
            System.out.println("Caso deseje, terminar de escrever os números digite o número 0!");
            System.out.print("Digite a " +quantidade_de_numeros_digitados + "° número: ");
            int numero = sc.nextInt();

            if (numero == 0) {
                break;
            }

            numeros_digitados[quantidade_de_numeros_digitados] = numero;
            quantidade_de_numeros_digitados++;

            if (quantidade_de_numeros_digitados == 50) {
                System.out.println("Quantidade de números chegou ao limite do sistema!");
                System.out.println("Limite do Sistema é de: 50");
            }
        }

        while (true) {
            System.out.println("\n=== NÚMEROS ===");
            System.out.println("1 - QUANTIDADE DE NÚMEROS POSITIVOS");
            System.out.println("2 - QUANTIDADE DE NÚMEROS NEGATIVOS");
            System.out.println("3 - SOMA TOTAL DOS NÚMEROS");
            System.out.println("4 - EXIBIR VALORES NA ORDEM INVERSA");
            System.out.println("5 - SAINDO DO SISTEMA");
            System.out.println();
            System.out.print("Digite a opção desejada: ");
            int opcao_desejada = sc.nextInt();

            if (opcao_desejada == 5) {
                System.out.println("Saindo do Sistema...");
                break;
            }

            switch (opcao_desejada) {
                case 1:

                    int numeros_positivos = 0;

                    for(int j = 0; j < quantidade_de_numeros_digitados; j++){
                        if (numeros_digitados[j] > 0) {
                            numeros_positivos++;
                        }
                    }

                    System.out.println("\n=== NÚMEROS POSITIVOS ===");
                    System.out.println("Números Positivos: " + numeros_positivos);
                    
                    break;
                case 2:

                    int numeros_negativos = 0;

                    for(int f = 0; f < quantidade_de_numeros_digitados; f++){
                        if (numeros_digitados[f] < 0) {
                            numeros_negativos ++;
                        }
                    }

                    System.out.println("\n=== NÚMEROS NEGATIVOS ===");
                    System.out.println("Números Negativos: " + numeros_negativos);

                    break;
                case 3:

                    int soma = 0;
                    for(int i = 0; i < 5; i++){
                        soma += numeros_digitados[i];
                    }

                    System.out.println("\n=== SOMA DOS NÚMEROS ===");
                    System.out.println("Soma : " + soma);

                    break;
                case 4:

                    System.out.println("\n=== EXIBINDO VALORES NA ORDEM INVERSA ===");
                    for(int i = quantidade_de_numeros_digitados - 1; i >= 0; i--){
                        System.out.println(numeros_digitados[i]);
                    }
                    break;
                default:
                    System.out.println("Opção Inválida!!\nTente Novamente!!");
                    break;
            }
        }
        sc.close();
    }
}
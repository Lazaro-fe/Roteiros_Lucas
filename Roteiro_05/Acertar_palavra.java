package Roteiro_05;

import java.util.Scanner;

public class Acertar_palavra {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            String palavra;
        
        System.out.print("Digite uma palavra: ");
        palavra = sc.nextLine();

        while (true) {
            System.out.println("\n==== VERIFICAÇÃO DE LETRAS ====");
            System.out.println("1 - DIGITAR A LETRA");
            System.out.println("2 - SAIR");
            System.out.println("Dica : Digite a letra correspondente a palavra digitada!");
            System.out.println();
            System.out.println("Digite sua opção: ");
            int opção = sc.nextInt();

            switch (opção) {
                case 1:
                    
                    System.out.println("Digite uma letra: ");
                    char entrada_de_letra = sc.next().charAt(0);

                    boolean letra_pertence_a_palavra = false;

                    for(int i = 0; i < palavra.length(); i++){
                        if(palavra.charAt(i) == entrada_de_letra){
                            letra_pertence_a_palavra = true;
                            break;
                        }
                    }

                    if (letra_pertence_a_palavra) {
                        System.out.println("A letra : " + entrada_de_letra + " pertence a palavra :" +palavra);
                    } else {
                        System.out.println("A letra: " + entrada_de_letra + " não pertence a palavra : " + palavra);
                    }

                    break;
                case 2:
                    System.out.println("Encerrando Sistema!!\nObrigado....");
                    sc.close();
                    return;
                default:
                    System.out.println("Inválido!\nTente digitar 1 ou 2!");
                    break;
            }
        }
    }
}
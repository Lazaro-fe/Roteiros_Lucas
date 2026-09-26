package Roteiro_05;

import java.util.Scanner;

public class Contador_de_vogais {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra_digitada = "";

        menu_de_palavras:
        while (true) {
            System.out.println("\n===== CONTADOR DE VOGAIS DE UMA PALAVRA =====");
            System.out.println("1 - Digitar uma nova palavra");
            System.out.println("2 - Informar o número de vogais da palavra");
            System.out.println("3 - Sair do Sistema");
            System.out.println();
            System.out.print("Digite a opção que deseja: ");
            int opção = sc.nextInt();

            sc.nextLine();

            switch (opção) {
                case 1:
                    System.out.print("Digite uma palavra: ");
                    palavra_digitada = sc.nextLine();
                    System.out.println("Palavra registrada com sucesso!!");
                    break;

                case 2:

                    if(palavra_digitada.length() == 0){
                        System.out.println("Nenhuma palavra foi digitada ainda!\nDigite uma palavra primeiro para que essa função trabalhe!");
                    } else {
                        int vogais_encontradas = 0;

                        for(int i = 0; i < palavra_digitada.length(); i++){
                            char vogais_em_letra = palavra_digitada.charAt(i);

                            if (vogais_em_letra == 'a' || vogais_em_letra == 'A' || vogais_em_letra == 'e' || vogais_em_letra == 'E' || vogais_em_letra == 'i' || vogais_em_letra == 'I' || vogais_em_letra == 'o' || vogais_em_letra == 'O' || vogais_em_letra == 'u' || vogais_em_letra == 'U') {
                                vogais_encontradas++;
                            }
                        }

                        System.out.println("A palavra " + palavra_digitada + " possui : " + vogais_encontradas + " Vogais");
                    }
                    break;

                case 3:
                    System.out.println("Encerrando Programa....");
                    sc.close();
                    break menu_de_palavras;
                default:
                    System.out.println("Opção inválida!\nDigite uma opção entre 1 a 3!");
                    break;
            }
        }
    }
}
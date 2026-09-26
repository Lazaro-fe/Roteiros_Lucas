package Roteiro_05;

import java.util.Scanner;

public class Decodificador_de_mensagem {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        String mensagem;

        while (true) {
            System.out.println("\n==== CODIFICADOR DE MENSAGENS ====");
            System.out.println("1 - CODIFICAR MENSAGEM");
            System.out.println("2 - DECODIFICAR MENSAGEM");
            System.out.println("3 - SAIR DO SISTEMA");
            System.out.println();
            System.out.println("Digite a opção desejada: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:

                    System.out.print("Digite uma mensagem: ");
                    mensagem = sc.nextLine();

                    String mensagem_codificada = "";
                    
                    for(int i = 0; i < mensagem.length(); i++){
                        char caractere_mensagem = mensagem.charAt(i);

                        char letra_nova = (char) (caractere_mensagem + 8);

                        mensagem_codificada = mensagem_codificada + letra_nova;

                    }
                    System.out.println("\n=== RESULTADO DE MENSAGEM CODIFICADA ===");
                    System.out.println("Mensagem Codificada: " +mensagem_codificada);
                    break;
                case 2:

                    System.out.print("Digite uma mensagem: ");
                    mensagem = sc.nextLine();

                    String mensagem_decodificada = "";

                    for(int h = 0; h < mensagem.length(); h++){
                        char carctere_codificado = mensagem.charAt(h);

                        char caractere_original_mensagem = (char) (carctere_codificado - 8);

                        mensagem_decodificada = mensagem_decodificada + caractere_original_mensagem;
                    }

                    System.out.println("\n=== MENSAGEM DECODIFICADA ===");
                    System.out.println("Mensagem Decodificada: " +mensagem_decodificada);
                    break;
                case 3:
                    System.out.println("Saindo do Sistema!!\nObrigado...");
                    sc.close();
                    return;
                default:
                    break;
            }
        }
    }
}
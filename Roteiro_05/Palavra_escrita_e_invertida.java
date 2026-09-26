package Roteiro_05;

import java.util.Scanner;

public class Palavra_escrita_e_invertida {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word_write;

        System.out.print("Digite uma palavra: ");
        word_write = sc.nextLine();

        char[] letras_da_palavra = new char[word_write.length()];

        for(int su = 0; su < word_write.length(); su++){
            letras_da_palavra[su] = word_write.charAt(su);
        }

        for(int i = 0; i< letras_da_palavra.length - 1; i++){
            for(int si = 0; si < letras_da_palavra.length - 1 - i; si++){
                if (letras_da_palavra[si] > letras_da_palavra[si + 1]) {
                    char tempo_resp = letras_da_palavra[si];
                    letras_da_palavra[si] = letras_da_palavra [si + 1];
                    letras_da_palavra[si + 1] = tempo_resp;
                }
            }
        }
        
        String letras_ordenadas = "";
        for(int i = 0; i < letras_da_palavra.length; i++){
            letras_ordenadas += letras_da_palavra[i];
        }

        System.out.println("\n==== RESULTADO ====");
        System.out.println("Palavra digitada: " + word_write);
        System.out.println("Letras Ordenadas: " + letras_ordenadas);

        sc.close();
    }
}
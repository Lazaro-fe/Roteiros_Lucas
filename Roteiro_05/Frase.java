package Roteiro_05;

import java.util.Scanner;

public class Frase {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        String frase_invertida = "";
        String palavra_Atual = "";

        System.out.print("Digite uma frase: ");
        frase = sc.nextLine();

        for(int pa = frase.length(); pa >= 0; pa++){
            char phrase = frase.charAt(pa);

            if (phrase == ' ') {
                frase_invertida += palavra_Atual + " ";
                palavra_Atual = " ";
            } else {
                palavra_Atual = phrase + palavra_Atual;
            }
        }

        frase_invertida += palavra_Atual;

        System.out.println("\n===== RESULTADO =====");
        System.out.println("Frase digitada: " + frase);
        System.out.println("Frase Invertida: " + frase_invertida);
        sc.close();
    }
}
package Roteiro_05;

import java.util.Scanner;

public class Palavra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra;
        String palavra_invertida = "";

        System.out.print("Digite uma palavra: ");
        palavra = sc.nextLine();

        for(int pa = palavra.length() - 1; pa >= 0; pa--){
            palavra_invertida += palavra.charAt(pa);
        }

        System.out.println("\n==== MOSTRANDO RESULTADO ====");
        System.out.println("Palavra digita: " + palavra);
        System.out.println("Palavra invertida: " + palavra_invertida);
        sc.close();
    }
}
// package Roteiro_03;
import java.util.Scanner;

public class Questao_04 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double renda_anual;
        double imposto;

        System.out.println("Digite a sua renda anual: R$");
        renda_anual = sc.nextDouble();

        System.out.println("\n=== CALCULO DE IMPOSTO ===");

        if (renda_anual <= 20000) {
            System.out.println("Você está isento de imposto!");
            imposto = 0;
            System.out.println("Imposto: R$" +imposto);
        } else if (renda_anual <= 40000) {
            imposto = (renda_anual - 20000) * 0.10;
            System.out.println("Imposto à pagar: R$" +imposto);
        } else if (renda_anual <= 80000) {
            imposto = ((renda_anual - 40000) * 0.20) + (20000 * 0.10);
            System.out.println("Imposto à pagar: R$" +imposto);
        } else {
            imposto = ((renda_anual - 80000) * 0.30) + (40000 * 0.20) + (20000 * 0.10);
            System.out.println("Imposto à pagar: R$" +imposto);
        }

        sc.close();
    }
}

// package Roteiro_06;
import java.util.Scanner;

public class Identificar_numero {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero_digitado;

        System.out.print("Digite um número: ");
        numero_digitado = sc.nextInt();

        if (numero_digitado % 2 == 0) {
            System.out.println("O número " + numero_digitado + " é par!");
        } else {
            System.out.println("O número " + numero_digitado + " é impar!");
        }

        if (numero_digitado % 5 == 0) {
            System.out.println("O número " + numero_digitado + " é múltiplo de 5");
        } else {
            System.out.println("O número " + numero_digitado + " não é múltiplo de 5");
        }

        if (numero_digitado % 3 == 0) {
            System.out.println("O número " + numero_digitado + " é múltiplo de 3");
        } else {
            System.out.println("O número " + numero_digitado + " não é múltiplo de 3");
        }

        sc.close();
    }
}

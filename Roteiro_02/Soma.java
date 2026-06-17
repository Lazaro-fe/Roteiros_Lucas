import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double numero1;
        double numero2;

        System.out.println("Digite o 1º número:");
        numero1 = sc.nextDouble();

        System.out.println("Digite o 2º número:");
        numero2 = sc.nextDouble();

        double soma = numero1 + numero2;

        System.out.println("===== SOMA DOS NÚMEROS ====");
        System.out.println();
        System.out.println("O 1º número é:" +numero1);
        System.out.println("O 2º número é:" +numero2);
        System.out.println("A soma dos números é igual a: " +soma);

        sc.close();
    }
}

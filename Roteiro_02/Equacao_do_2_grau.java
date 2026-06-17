// package Roteiro_02;
import java.util.Scanner;

public class Equacao_do_2_grau {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int valor_de_a;
        int valor_de_b;
        int valor_de_c;

        System.out.println("\n=============================");
        System.out.println("        SOLICITANDO             ");
        System.out.println("================================");
        // SOLICITANDO O VALOR DO COEFICIENTE A
        System.out.println("Digite o valor do coeficiente a:");
        valor_de_a = sc.nextInt();

        // SOLICITANDO O VALOR DO COEFICIENTE B
        System.out.println("Digite o valor do coeficiente b:");
        valor_de_b = sc.nextInt();

        // SOLICITANDO O VALOR DO COEFICIENTE C
        System.out.println("Digite o valor do coeficiente c:");
        valor_de_c = sc.nextInt();

        double delta = valor_de_b * valor_de_b - (4 * valor_de_a * valor_de_c);

        if (valor_de_a == 0 ) {
            System.out.println("O coeficiente a não pode ser igual a 0");
        } else if (delta < 0) {
            System.out.println("A equação não possuí raízes reais");
        } else {
            double x1 = (-valor_de_b + Math.sqrt(delta)) / (2 * valor_de_a);
            double x2 = (-valor_de_b - Math.sqrt(delta)) / (2 * valor_de_a);

            System.out.println("==== RESULTADO FINAL ====");
            System.out.println("O valor do coeficiente a: " + valor_de_a);
            System.out.println("O valor do coeficiente b: " + valor_de_b);
            System.out.println("O valor do coeficiente c: " + valor_de_c);
            System.out.println("O valor de delta :" + delta);
            System.out.println("O resultado de x': " + x1);
            System.out.println("O resultado de x'': " + x2);
        }
        sc.close();
    }
}
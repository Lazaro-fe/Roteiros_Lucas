import java.util.Scanner;

public class Equacao_do_segundo_grau {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor_do_coeficiente_a;
        int valor_do_coeficiente_b;
        int valor_do_coeficiente_c;

        System.out.print("Digite o valor do coeficiente a: ");
        valor_do_coeficiente_a = sc.nextInt();

        System.out.print("Digite o valor do coeficiente b: ");
        valor_do_coeficiente_b = sc.nextInt();

        System.out.print("Digite o valor do coeficiente c: ");
        valor_do_coeficiente_c = sc.nextInt();

        if (valor_do_coeficiente_a == 0) {
            System.out.println("O valor de a deve ser diferente de 0!\nPois, só é considerada equação de 2° grau, quando o a é diferente de 0");
        } else {
            double calculo_de_delta = (valor_do_coeficiente_b * valor_do_coeficiente_b) - (4 * valor_do_coeficiente_a * valor_do_coeficiente_c);
            System.out.println("\n === VALOR DE DELTA");
            System.out.println("Valor de delta: " + calculo_de_delta);

            if (calculo_de_delta < 0) {
                System.out.println("A equação não possuí raízes reais (Pois o delta é negativo)!");
            } else if (calculo_de_delta == 0) {
                double valor_de_x = -valor_do_coeficiente_b / (2 * valor_do_coeficiente_a);
                System.out.println("Como o delta é zero, existe apenas uma raiz real!");
                System.out.println("Valor de x: " + valor_de_x);
            }
        }
    }
}
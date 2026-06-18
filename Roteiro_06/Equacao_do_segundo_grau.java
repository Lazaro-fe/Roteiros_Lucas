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
                System.out.println("Como o delta é zero, existe duas raizes reais!");
                System.out.println("Valor de x: " + valor_de_x);
            } else if (calculo_de_delta > 0) {
                
                double inicio_de_baskhara = 0.0;
                double fim_de_baskhara = calculo_de_delta;

                double verificar_a_precisao_do_calculo = 0.000001;
                double calculando_bhask = 0.0;

                while ((fim_de_baskhara - inicio_de_baskhara) > verificar_a_precisao_do_calculo) {
                    
                    calculando_bhask = (inicio_de_baskhara + fim_de_baskhara) / 2.0;

                    if ((calculando_bhask * calculando_bhask) > calculo_de_delta) {
                        fim_de_baskhara = calculando_bhask;
                    } else {
                        inicio_de_baskhara = calculando_bhask;
                    }
                }

                double final_do_calculo_de_bhaskhara = calculando_bhask;

                double valor_de_x_linha = (-valor_do_coeficiente_b + final_do_calculo_de_bhaskhara) / (2 * valor_do_coeficiente_a);
                double valor_de_x_duas_linha = (-valor_do_coeficiente_b - final_do_calculo_de_bhaskhara) / (2* valor_do_coeficiente_a);

                System.out.println("O valor de delta é maior que 0, dessa forma possui duas raizes reais e diferentes!");
                System.out.println("Valor de x': " + valor_de_x_linha);
                System.out.println("Valor de x'': " + valor_de_x_duas_linha);
            }
        }
        sc.close();
    }
}
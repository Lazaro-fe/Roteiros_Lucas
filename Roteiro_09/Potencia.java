import java.util.Scanner;

public class Potencia {
    
    public static int calculo_de_potencia (int valor_da_base_da_potencia, int valor_do_expoente_da_potencia){
        int resultado_de_calculo_da_potencia = 1;
        int contador_de_numeros_do_calculo = 0;

        while (contador_de_numeros_do_calculo < valor_do_expoente_da_potencia) {
            resultado_de_calculo_da_potencia = resultado_de_calculo_da_potencia * valor_da_base_da_potencia;
            contador_de_numeros_do_calculo = contador_de_numeros_do_calculo + 1;
        }
        return resultado_de_calculo_da_potencia;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador_dos_numeros_pares = 0;
        int valor_da_base;
        int valor_do_expoente;

        System.out.println("\n== CÁCULO DE POTÊNCIA ==");
        while (contador_dos_numeros_pares <= 6) {
            System.out.print("\nDigite o valor da base: ");
            valor_da_base = sc.nextInt();

            System.out.print("Digite o valor do expoente: ");
            valor_do_expoente = sc.nextInt();

            int resultado_final_da_potencia = calculo_de_potencia(valor_da_base, valor_do_expoente);

            System.out.println("O resultado da base: " + valor_da_base + " eleveado pelo expoente: " + valor_do_expoente + " é: " + resultado_final_da_potencia);

            contador_dos_numeros_pares = contador_dos_numeros_pares + 1;
        }

        sc.close();
    }
}

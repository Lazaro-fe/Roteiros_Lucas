import java.util.Scanner;

public class Verificacao_de_numero {

    public static int verificacao_do_numero(int numero){
            if (numero > 0) {
                return 1;
            } else if (numero < 0) {
                return -1;
            } else {
                return 0;
            }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor_digitado;

        System.out.print("Digite um número: ");
        valor_digitado = sc.nextInt();

        int resultado_da_vericacao_do_numero = verificacao_do_numero(valor_digitado);

        System.out.println("\n== VERIFICANDO O NÚMERO ==");
        if (resultado_da_vericacao_do_numero == 1) {
            System.out.println("O número digitado é positivo: " + resultado_da_vericacao_do_numero);
        } else if (resultado_da_vericacao_do_numero == -1) {
            System.out.println("O número digitado é negativo: " + resultado_da_vericacao_do_numero);
        } else {
            System.out.println("O número digitado é ZERO!");
        }

        sc.close();
    }
}

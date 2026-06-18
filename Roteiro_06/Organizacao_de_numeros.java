import java.util.Scanner;

public class Organizacao_de_numeros {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.print("Digite um número de três algorismos: ");
        numero = sc.nextInt();

        int primeiro_numero = numero / 100;

        int resultado_do_primeiro = numero % 100;

        int segundo_numero = resultado_do_primeiro / 10;

        int terceiro_numero = resultado_do_primeiro % 10;

        int troca_de_ordem_dos_numeros = (terceiro_numero * 100) + (segundo_numero * 10) + primeiro_numero;

        System.out.println("O número invertido: " + troca_de_ordem_dos_numeros);
        sc.close();
    }
}

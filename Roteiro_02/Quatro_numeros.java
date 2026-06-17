// package Roteiro_02;
import java.util.Scanner;

public class Quatro_numeros {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numero_1;
        int numero_2;
        int numero_3;
        int numero_4;

        System.out.println("Digite o 1º número:");
        numero_1 = sc.nextInt();

        System.out.println("Digite o 2º número:");
        numero_2 = sc.nextInt();

        System.out.println("Digite o 3º número: ");
        numero_3  = sc.nextInt();

        System.out.println("Digite o 4º número ");
        numero_4 = sc.nextInt();

        int resultado_dos_dois_primeiros = numero_1 * numero_2;
        
        int resultado_dos_dois_ultimos = numero_3 * numero_4;

        int soma_dos_resultados = resultado_dos_dois_primeiros * resultado_dos_dois_ultimos;


        System.out.println("====== RESULTADO FINAL ======");
        System.out.println();
        System.out.println("1º número: " +numero_1);
        System.out.println("2º número: " +numero_2);
        System.out.println("3º número: " +numero_3);
        System.out.println("4º número: " +numero_4);
        System.out.println("Resultado da multiplicação dos dois primeiros números: " +resultado_dos_dois_primeiros);
        System.out.println("Resultado da multiplicação dos dois últimos números: " +resultado_dos_dois_ultimos);
        System.out.println("A soma de ambos os resultados são: " +soma_dos_resultados);

        sc.close();
    }
}
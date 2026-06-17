// package Roteiro_02;
import java.util.Scanner;

public class Area_do_triangulo {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double base;
        double altura;

        System.out.println("Digite o valor da área: ");
        base = sc.nextDouble();

        System.out.println("Digite o valor da altura: ");
        altura = sc.nextDouble();

        double area_do_triangulo = base * altura;

        System.out.println("===== ÁREA DO TRIÂNGULO =====");
        System.out.println();
        System.out.println("O valor da base do triângulo: " +base);
        System.out.println("O valor da altura do triângulo: " +altura);
        System.out.println("A área do triângulo é igual a: " +area_do_triangulo);

        sc.close();
    }
}
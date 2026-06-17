// package Roteiro_02;
import java.util.Scanner;

public class latas_de_tinta {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double altura;
        double largura;

        System.out.println("\n=============================");
        System.out.println("        TINTAS BARREIRAS        ");
        System.out.println("===============================");
        System.out.println();


        System.out.println("Digite o valor da altura da parede (em metros): ");
        altura = sc.nextDouble();

        System.out.println("Digite o valor da largura da parede (em metros): ");
        largura = sc.nextDouble();

        double area = largura * altura;

        double corbetura_da_tinta_por_lata = 20.0;

        double latas_necessarias = area / corbetura_da_tinta_por_lata;

        System.out.println();

        System.out.println("\n====== RESULTADO DE PINTURA ======");
        System.out.println();
        System.out.println("A altura da parede mede (em metros): " + altura + "metros");
        System.out.println("A largura da parede mede (em metros): " + largura + "metros");
        System.out.println("A área da parede: " +area);
        System.out.println("Latas de tintas necessárias: " +latas_necessarias);

        sc.close();
    }
}
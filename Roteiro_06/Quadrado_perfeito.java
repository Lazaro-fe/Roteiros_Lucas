// package Roteiro_06;
import java.util.Scanner;

public class Quadrado_perfeito {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        
        System.out.print("Digite o número desejado: ");
        numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("O número " + numero + " não é um quadrado perfeito, pois é um número negativo");
        } else {
            boolean raiz_encontrada = false;

            for(int ju = 0; ju * ju <= numero; ju++){
                if (ju * ju == numero) {
                    raiz_encontrada = true;
                    System.out.println("O número" + numero + "é um quadrado perfeito!\nE sua raiz é " +ju);
                    break;
                }
            }

            if (!raiz_encontrada) {
                System.out.println("O número " + numero + " não é um quadrado perfeito!");
            }
        }
        sc.close();
    }
}
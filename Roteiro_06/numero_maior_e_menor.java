import java.util.Scanner;

public class numero_maior_e_menor {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero_de_contagem;
        int menor_numero = 0;

        for(int ju = 0; ju < 3; ju++){
            System.out.print("Digite o " + (ju + 1) + "° número: ");
            numero_de_contagem = sc.nextInt();

            if (ju == 0) {
                menor_numero = numero_de_contagem;
            } else {

                if (numero_de_contagem < menor_numero) {
                    menor_numero = numero_de_contagem;
                }
            }
        }

        System.out.println("\n== RESULTADOS ==");
        System.out.println("O menor número: " +menor_numero);

        sc.close();
    }
}

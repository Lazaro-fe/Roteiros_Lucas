import java.util.Scanner;

public class numero_maior_e_menor {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero_de_contagem;

        for(int ju = 0; ju < 3; ju++){
            System.out.print("Digite o" + ju + "° número");
            numero_de_contagem = sc.nextInt();
        }
    }
}

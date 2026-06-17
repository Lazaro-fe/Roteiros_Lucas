import java.util.Scanner;

public class Acesso {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String login = "acesso";
        String senha = "6RX37";

        System.out.print("Digite o login: ");
        String login_digitado = sc.nextLine();

        System.out.print("Digite a senha: ");
        String senha_digitad = sc.nextLine();

        if (login_digitado.equals(login) && senha_digitad.equals(senha)) {
            System.out.println("=== SEJA BEM-VINDO ===");
            System.out.println("Inicializando seu acesso!!");
        } else if (!login_digitado.equals(login) && !senha_digitad.equals(senha)) {
            System.out.println("O login e a senha estão incorretos");
        } else if (!login_digitado.equals(login) && senha_digitad.equals(senha)) {
            System.out.println("O login está incorreto!");
        } else if (login_digitado.equals(login) && !senha_digitad.equals(senha)) {
            System.out.println("A senha está incorreta!");
        }

        sc.close();
    }
}

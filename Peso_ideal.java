import java.util.Scanner;

public class Peso_ideal {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sexo;
        double altura;

        System.out.print("Digite o sexo que você se identifica (Homem ou Mulher): ");
        sexo = sc.nextLine();

        System.out.print("Digite a sua altura: ");
        altura = sc.nextDouble();

        if (sexo.equalsIgnoreCase("Homem")) {
            double pessoa_ideal_homem = 72.7 * altura - 58;
            System.out.println("\n=== RESULTADO ===");
            System.out.println("O sexo identificado: " + sexo);
            System.out.println("A altura: " + altura);
            System.out.println("Peso ideal: " +pessoa_ideal_homem);
        } else if (sexo.equalsIgnoreCase("Mulher")) {
            double pessoa_ideal_mulher = 62.1 * altura - 44.7;
            System.out.println("\n=== RESULTADO ===");
            System.out.println("O sexo identificado: " + sexo);
            System.out.println("A altura: " + altura);
            System.out.println("Peso ideal: " +pessoa_ideal_mulher);
        } else {
            System.out.println("Digite com qual sexo você se identifica (Homem ou Mulher)");
        }
        sc.close();
    }
}

import java.util.Scanner;

public class Mes {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dia_do_nascimento;
        int mes_do_nascimento;
        int ano_do_nascimento;

        int dia_atual;
        int mes_atual;
        int ano_atual;

        int idade_da_pessoa;

        System.out.println("=== DADOS DE NASCIMENTO ===");
        System.out.print("Digite o dia do nascimento: ");
        dia_do_nascimento = sc.nextInt();
        
        System.out.print("Digite o mês do nascimento: ");
        mes_do_nascimento = sc.nextInt();
        
        System.out.print("Digite o ano do nascimento: ");
        ano_do_nascimento = sc.nextInt();

        System.out.println("\n=== DATA ATUAL ===");
        System.out.print("Digite o dia de hoje: ");
        dia_atual = sc.nextInt();
        
        System.out.print("Digite o mês atual: ");
        mes_atual = sc.nextInt();
        
        System.out.print("Digite o ano atual: ");
        ano_atual = sc.nextInt();

        idade_da_pessoa = ano_atual - ano_do_nascimento;

        if (mes_atual < mes_do_nascimento) {
            idade_da_pessoa = idade_da_pessoa - 1; 
        } 
        else if (mes_atual == mes_do_nascimento) {
            if (dia_atual < dia_do_nascimento) {
                idade_da_pessoa = idade_da_pessoa - 1;
            }
        }

        System.out.println("\n=== RESULTADO ===");
        System.out.println("A idade exata da pessoa é: " + idade_da_pessoa + " anos.");

        sc.close();
    }
}

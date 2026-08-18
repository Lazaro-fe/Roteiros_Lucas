// package Roteiro_03;

import java.util.Scanner;

public class Questao_08 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int idade;
        String grupo_de_risco;

        System.out.println("Digite a sua idade: ");
        idade = sc.nextInt();

        if (idade < 17 || idade > 90) {
            System.out.println("Apenas pessoas entre 17 e 90 anos podem ter acesso ao seguro!\nTente novamente quando estiver nessa faixa etária");
        } else {

            sc.nextLine();

            System.out.println("Digite o grupo de em que você se enquadra (Baixo ou Alto): ");
            grupo_de_risco = sc.nextLine();

            if (idade >= 17 && idade <= 50) {
                if (grupo_de_risco.equalsIgnoreCase("Baixo")) {
                    System.out.println("Idade: " + idade);
                    System.out.println("Categoria: C1");
                } else if (grupo_de_risco.equalsIgnoreCase("Alto")) {
                    System.out.println("Idade: " + idade);
                    System.out.println("Grupo de Risco: C2");
                } else {
                    System.out.println("Grupo de Risco inválido!\nTente digitar um grupo que faça parte do sistema (Baixo ou Alto)");
                }
            } else if (idade >= 51 && idade <= 90) {
                if (grupo_de_risco.equalsIgnoreCase("Baixo")) {
                    System.out.println("Idade: " + idade);
                    System.out.println("Grupo de Risco: C3");
                } else if (grupo_de_risco.equalsIgnoreCase("Alto")) {
                    System.out.println("Idade : " + idade);
                    System.out.println("Grupo de Risco: C4");
                } else {
                    System.out.println("Grupo de Risco inválido!\\nTente digitar um grupo que faça parte do sistema (Baixo ou Alto)");
                }
            }
        }
        sc.close();
    }
}

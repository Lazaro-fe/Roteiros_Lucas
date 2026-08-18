package Roteiro_04;

import java.util.Scanner;

public class Pesquisa {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int idade;
        String sexo;

        int total_de_homens = 0;
        int homens_acima_de_22_anos = 0;

        int total_de_mulheres = 0;
        int soma_das_idades_das_mulheres = 0;

        int pesquisa_feita_com_alunos = 8;
        int menor_de_idade = 0;

        for(int en = 0; en <= pesquisa_feita_com_alunos; en++){
            System.out.println("Digite a sua idade: ");
            idade = sc.nextInt();

            System.out.println("Digite seu sexo (H ou M): ");
            sexo = sc.next();

            if (idade < 18) {
                menor_de_idade++;
            }

            if (sexo.equalsIgnoreCase("M")) {
                total_de_mulheres++;
                soma_das_idades_das_mulheres += idade;
            } else if (sexo.equalsIgnoreCase("H")) {
                total_de_homens++;
                if (idade >+ 22) {
                    homens_acima_de_22_anos++;
                }
            } else {
                System.out.println("Sexo Inválido!\nDigite um sexo que corresponde ao do sistema!");
            }

        }
        System.out.println("\n====== RESULTADOS DA PESQUISA ======");
        System.out.println("Pessoas com menor de 18 anos: " + menor_de_idade);

        if (total_de_mulheres > 0) {
            double media_das_idades_das_mulheres = (double) soma_das_idades_das_mulheres / total_de_mulheres;
            System.out.println("Média das idades das mulheres: " + media_das_idades_das_mulheres);
        } else {
            System.out.println("Média de idades das mulheres: 0");
        }

        if (total_de_homens > 0) {
            double Porcentagem_das_idades_dos_homens = ((double) homens_acima_de_22_anos / total_de_homens) * 100;
            System.out.println("Porcentagem de homens acima de 22 anos: " +Porcentagem_das_idades_dos_homens);
        } else {
            System.out.println("Porcentagem de homens acima de 22: 0");
        }
        sc.close();
    }
}
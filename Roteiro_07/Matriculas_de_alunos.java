package Roteiro_07;
import java.util.Scanner;

public class Matriculas_de_alunos {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] matriz_de_alunos_do_colegio = new double[6][4];

        for(int you = 0; you < 6; you++){
            System.out.println("\n== CADASTRANDO DADOS DO ALUNO" + (you + 1) + " == ");

            System.out.print("\nMatricula: ");
            matriz_de_alunos_do_colegio[you][0] = sc.nextDouble();

            System.out.print("\nSexo (1 - M / 2 - F): ");
            matriz_de_alunos_do_colegio[you][1] = sc.nextDouble();

            System.out.print("\nNúmero do curso: ");
            matriz_de_alunos_do_colegio[you][2] = sc.nextDouble();

            System.out.print("\nNota: ");
            matriz_de_alunos_do_colegio[you][3] = sc.nextDouble();
        }

        System.out.print("Digite um número para buscar o curso que deseja: ");
        double buscando_curso_necessario = sc.nextDouble();

        double maior_nota_dos_cursos = -1;
        double matricula_que_possui_a_maior_nota = -1;

        double soma_das_notas_dos_homens = 0;
        int contador_de_homens_cadastrados_nos_cursos = 0;

        for(int fui = 0; fui < 6; fui++){
            if (matriz_de_alunos_do_colegio[fui][2] == buscando_curso_necessario && matriz_de_alunos_do_colegio[fui][3] > maior_nota_dos_cursos) {
                maior_nota_dos_cursos = matriz_de_alunos_do_colegio[fui][3];
                matricula_que_possui_a_maior_nota = matriz_de_alunos_do_colegio[fui][0];
            }

            if (matriz_de_alunos_do_colegio[fui][1] == 1) {
                soma_das_notas_dos_homens = soma_das_notas_dos_homens + matriz_de_alunos_do_colegio[fui][3];
                contador_de_homens_cadastrados_nos_cursos++;
            }
        }

        if (maior_nota_dos_cursos != -1) {
            System.out.println("A matrícula com maior nota no curso: " + buscando_curso_necessario);
        } else {
            System.out.println("Nenhum aluno foi encontrado no registro!");
        }

        if (contador_de_homens_cadastrados_nos_cursos > 0) {
            double media_das_notas_dos_homens = soma_das_notas_dos_homens / contador_de_homens_cadastrados_nos_cursos;
            System.out.println("A média das notas dos homens é: " +media_das_notas_dos_homens);
        } else {
            System.out.println("Nenhum homem se inscreveu nos cursos cadastrados!");
        }

        sc.close();
    }
}

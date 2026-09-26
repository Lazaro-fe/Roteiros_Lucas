package Roteiro_07;
import java.util.Scanner;

public class Matriculas_de_alunos {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] matriz_de_alunos_do_colegio = new double[6][4];

        for(int i = 0; i < 6; i++) {
            System.out.println("\n== CADASTRANDO DADOS DO ALUNO " + (i + 1) + " == ");

            System.out.print("Matricula: ");
            matriz_de_alunos_do_colegio[i][0] = sc.nextDouble();

            System.out.print("Sexo (1 - M / 2 - F): ");
            matriz_de_alunos_do_colegio[i][1] = sc.nextDouble();

            System.out.print("Número do curso: ");
            matriz_de_alunos_do_colegio[i][2] = sc.nextDouble();

            System.out.print("Nota: ");
            matriz_de_alunos_do_colegio[i][3] = sc.nextDouble();
        }

        System.out.print("\nDigite o número do curso para buscar a maior nota: ");
        double buscando_curso_necessario = sc.nextDouble();

        double maior_nota_dos_cursos = -1;
        double matricula_que_possui_a_maior_nota = -1;

        double soma_das_notas_dos_homens = 0;
        int contador_de_homens_cadastrados_nos_cursos = 0;

        for(int i = 0; i < 6; i++) {
            // Verifica a maior nota do curso específico
            if (matriz_de_alunos_do_colegio[i][2] == buscando_curso_necessario && matriz_de_alunos_do_colegio[i][3] > maior_nota_dos_cursos) {
                maior_nota_dos_cursos = matriz_de_alunos_do_colegio[i][3];
                matricula_que_possui_a_maior_nota = matriz_de_alunos_do_colegio[i][0];
            }

            // Soma notas e conta a quantidade de homens (Sexo == 1)
            if (matriz_de_alunos_do_colegio[i][1] == 1) {
                soma_das_notas_dos_homens += matriz_de_alunos_do_colegio[i][3];
                contador_de_homens_cadastrados_nos_cursos++;
            }
        }

        System.out.println("\n--- RESULTADOS ---");

        // Exibe a matrícula com a maior nota do curso buscado
        if (maior_nota_dos_cursos != -1) {
            System.out.println("A matrícula com maior nota no curso " + (int)buscando_curso_necessario + " é a: " + (int)matricula_que_possui_a_maior_nota + " (Nota: " + maior_nota_dos_cursos + ")");
        } else {
            System.out.println("Nenhum aluno foi encontrado no curso registrado!");
        }

        // Exibe a média dos homens em todos os cursos
        if (contador_de_homens_cadastrados_nos_cursos > 0) {
            double media_das_notas_dos_homens = soma_das_notas_dos_homens / contador_de_homens_cadastrados_nos_cursos;
            System.out.println("A média das notas dos homens é: " + media_das_notas_dos_homens);
        } else {
            System.out.println("Nenhum homem se inscreveu nos cursos cadastrados!");
        }

        sc.close();
    }
}
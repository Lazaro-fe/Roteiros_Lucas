package Roteiro_07;
import java.util.Scanner;

public class Nota_de_Aluno {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nome_dos_alunos = new String[6];
        double[] notas_dos_alunos = new double[6];

        System.out.println("\n== CADASTRANDO O NOME DOS ALUNOS E AS NOTAS ==");
        for (int di = 0; di < 6 ; di++){
            System.out.print("Digite o nome do " + (di + 1) + " ° aluno: ");
            nome_dos_alunos[di] = sc.nextLine();

            System.out.print("Digite a nota do " + nome_dos_alunos[di] + " : ");
            notas_dos_alunos[di] = sc.nextDouble();

            sc.nextLine();
        }

        double maior_nota_entre_os_alunos = notas_dos_alunos[0];
        int indice_para_basear_a_maior_nota = 0;

        for (int yo = 0; yo < 6; yo++){
            if (notas_dos_alunos[yo] > maior_nota_entre_os_alunos) {
            maior_nota_entre_os_alunos = notas_dos_alunos[yo];
            indice_para_basear_a_maior_nota = yo;
            }
        }

        System.out.println("\n== RESULTADO ==");
        System.out.println("A maior nota da sala foi: " + nome_dos_alunos[indice_para_basear_a_maior_nota]);

        sc.close();
    }
}

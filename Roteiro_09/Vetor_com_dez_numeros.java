import java.util.Scanner;

public class Vetor_com_dez_numeros {

    public static int contando_a_quantidade_de_vezes_dentro_do_vetor(int numero_para_ser_encontrado, int limite_da_posicao_de_um_numero, int[] vetor_com_os_dez){
        int quantidade_de_vezes_que_um_numero_aparece = 0;
        int quantidade_de_vezes_da_posicao_do_numero = 0;

        while (quantidade_de_vezes_da_posicao_do_numero <= limite_da_posicao_de_um_numero) {
            if (vetor_com_os_dez[quantidade_de_vezes_da_posicao_do_numero] == numero_para_ser_encontrado) {
                quantidade_de_vezes_que_um_numero_aparece = quantidade_de_vezes_que_um_numero_aparece + 1;
            }
            quantidade_de_vezes_da_posicao_do_numero = quantidade_de_vezes_da_posicao_do_numero + 1;
        }

        return quantidade_de_vezes_que_um_numero_aparece;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor_de_numeros_dez = new int[10];
        int indice_dos_numeros = 0;

        System.out.println("\n== PREENCHENDO O VETOR ==");
        while (indice_dos_numeros < 10) {
            System.out.print("Digite o número para a posição " + indice_dos_numeros + " do vetor: ");
            vetor_de_numeros_dez[indice_dos_numeros] = sc.nextInt();
            indice_dos_numeros = indice_dos_numeros + 1;
        }

        System.out.println("\n== PROCURANDO DENTRO DO VETOR ==");
        int procurando_por_numero;
        int posicao_do_numero_que_deseja_procura;

        System.out.print("Digite o número que você deseja encontrar: ");
        procurando_por_numero = sc.nextInt();

        System.out.print("Digite até qual posição você quer buscar: ");
        posicao_do_numero_que_deseja_procura = sc.nextInt();

        if (posicao_do_numero_que_deseja_procura >= 10 || posicao_do_numero_que_deseja_procura < 0) {
            System.out.println("Posição limite inválida! A posição deve ser entre 0 e 9.");
        } else {
            int resultado_da_busca_dos_numeros = contando_a_quantidade_de_vezes_dentro_do_vetor(procurando_por_numero, posicao_do_numero_que_deseja_procura, vetor_de_numeros_dez);
            System.out.println("O número " + procurando_por_numero + " aparece " + resultado_da_busca_dos_numeros + " vez(es) até a posição " + posicao_do_numero_que_deseja_procura + ".");
        }

        sc.close();
    }
}

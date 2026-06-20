import java.util.Scanner;

public class Numeros_que_possuem_divisores {
    
    public static int contando_os_divisores_dos_numeros(int numeros_a_serem_investigados){
        int quantidade_dos_divisores_existentes = 0;
        int contador_de_numeros = 1;

        while (contador_de_numeros <= numeros_a_serem_investigados) {
            if (numeros_a_serem_investigados % contador_de_numeros == 0) {
                quantidade_dos_divisores_existentes = quantidade_dos_divisores_existentes + 1;
            }
            contador_de_numeros = contador_de_numeros + 1;
        }

        return quantidade_dos_divisores_existentes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero_que_sera_digitado;

        System.out.print("Digite um número: ");
        numero_que_sera_digitado = sc.nextInt();

        int total_de_divisores_encontrados_a_partir_do_numero_digitado = contando_os_divisores_dos_numeros(numero_que_sera_digitado);

        System.out.println("\n== QUANTIDADE DE DIVISORES ==");
        System.out.println("O número: " + numero_que_sera_digitado + " possuí " + total_de_divisores_encontrados_a_partir_do_numero_digitado + " divisores");

        sc.close();
    }
}
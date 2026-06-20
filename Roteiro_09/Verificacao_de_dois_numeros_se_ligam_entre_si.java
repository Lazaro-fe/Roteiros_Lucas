import java.util.Scanner;

public class Verificacao_de_dois_numeros_se_ligam_entre_si {
    
    public static int somar_divisores_exceto_ele_mesmo(int numero_para_operacao) {
        int soma_entre_os_divisores_dos_numeros = 0;
        int contador_dos_numeros = 1;

        while (contador_dos_numeros < numero_para_operacao) {
            if (numero_para_operacao % contador_dos_numeros == 0) {
                soma_entre_os_divisores_dos_numeros = soma_entre_os_divisores_dos_numeros + contador_dos_numeros;
            }
            contador_dos_numeros = contador_dos_numeros + 1;
        }

        return soma_entre_os_divisores_dos_numeros;
    }

    public static void testar_e_informar_se_sao_unidos(int numero_uno, int numero_dos, int soma_divisores_do_primeiro, int soma_divisores_do_segundo) {
        
        if ((soma_divisores_do_primeiro == numero_dos) || (soma_divisores_do_segundo == numero_uno)) {
            System.out.println("Os números " + numero_uno + " e " + numero_dos + " são números unidos!");
        } else {
            System.out.println("Os números " + numero_uno + " e " + numero_dos + " não são números unidos.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador_das_duplas_de_numeros = 1;
        int valor_numerico_do_primeiro_numero;
        int valor_numerico_do_segundo_numero;

        System.out.println("=== VERIFICADOR DE NÚMEROS UNIDOS ===");

        while (contador_das_duplas_de_numeros <= 5) {
            System.out.println("\n== DUPLA DE NÚMEROS " + contador_das_duplas_de_numeros + " ==");
            
            System.out.print("Digite o primeiro número da dupla: ");
            valor_numerico_do_primeiro_numero = sc.nextInt();

            System.out.print("Digite o segundo número da dupla: ");
            valor_numerico_do_segundo_numero = sc.nextInt();

            int soma_do_primeiro = somar_divisores_exceto_ele_mesmo(valor_numerico_do_primeiro_numero);
            int soma_do_segundo = somar_divisores_exceto_ele_mesmo(valor_numerico_do_segundo_numero);

            System.out.println("A soma dos divisores do primeiro número deu: " + soma_do_primeiro);
            System.out.println("A soma dos divisores do segundo número deu: " + soma_do_segundo);

            testar_e_informar_se_sao_unidos(valor_numerico_do_primeiro_numero, valor_numerico_do_segundo_numero, soma_do_primeiro, soma_do_segundo);

            contador_das_duplas_de_numeros = contador_das_duplas_de_numeros + 1;
        }

        sc.close();
    }
}
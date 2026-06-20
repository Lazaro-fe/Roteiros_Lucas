import java.util.Scanner;

public class Mostrando_divisores_de_um_numero {
    
    public static void mostrando_os_divisores_de_determinado_numero(int numero_a_ser_invertigados_sobre_os_divisores){
        int contador_de_numeros = 1;

        System.out.println("\n== LISTA DE DIVISORES DE UM NÚMERO ==");
        while (contador_de_numeros <= numero_a_ser_invertigados_sobre_os_divisores) {
            if (numero_a_ser_invertigados_sobre_os_divisores % contador_de_numeros == 0) {
                System.out.println("O número " + contador_de_numeros + " é um divisor de " + numero_a_ser_invertigados_sobre_os_divisores);
            }
            contador_de_numeros = contador_de_numeros + 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero_que_será_investigado;

        System.out.print("Digite um número: ");
        numero_que_será_investigado = sc.nextInt();

        mostrando_os_divisores_de_determinado_numero(numero_que_será_investigado);

        sc.close();
    }
}

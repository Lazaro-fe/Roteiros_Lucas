import java.util.Scanner;

public class Divisor {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num_one;
        int num_two;

        System.out.print("Digite o 1° número: ");
        num_one = sc.nextInt();

        System.out.print("Digite o 2° número: ");
        num_two = sc.nextInt();

        if (num_one % num_two == 0) {
            System.out.println("O número " + num_two + " divisor de " + num_one);
        } else {
            System.out.println("O número " + num_two + " não é divisor de " + num_one);
        }
        sc.close();
    }
}

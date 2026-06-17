import java.util.Scanner;

public class salario {
     public static void main(String[] args) {
        
      double salario_base;
      int horas_extras_trabalhadas;

      Scanner sc = new Scanner(System.in);

      System.out.println("\n=================================");
      System.out.println("          CALCULO DE SÁLARIO      ");
      System.out.println("=================================");

      System.out.println("Digite quanto é o seu piso salarial:");
      salario_base = sc.nextDouble();

      System.out.println("Quantas horas extras você trabalhou no mês?");
      horas_extras_trabalhadas = sc.nextInt();

      double valor_hora_de_trabalho = salario_base / 160;

      double valor_total_ganha_de_extras = valor_hora_de_trabalho * horas_extras_trabalhadas;

      double salario_total = salario_base + valor_total_ganha_de_extras;

      System.out.println("\n==== PAGAMENTO FINAL ====");
      System.out.println();
      System.out.println("O salário base da sua profissão é :" + salario_base);
      System.out.println("O valor da sua hora de trabalho é igual a:" +valor_hora_de_trabalho);
      System.out.println("O valor de horas extras trabalhadas: " +horas_extras_trabalhadas);
      System.out.println("Total recebido pelas horas extras:  " +valor_total_ganha_de_extras);
      System.out.println("O salário que você deve receber: " +salario_total);

      sc.close();
   }
}
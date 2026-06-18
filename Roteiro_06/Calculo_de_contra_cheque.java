import java.util.Scanner;

public class Calculo_de_contra_cheque {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double salario_bruto;
        double taxa_do_inss;
        double taxa_do_imposto_de_renda;
        double desconto_do_inss;
        double desconto_do_imposto_de_renda;
        double salario_liquido;

        System.out.print("Digite o valor do seu salário: R$ ");
        salario_bruto = sc.nextDouble();

        System.out.print("Digite a taxa do INSS (em porcentagem, ex: 10): ");
        taxa_do_inss = sc.nextDouble();

        System.out.print("Digite a taxa do Imposto de Renda (em porcentagem, ex: 5): ");
        taxa_do_imposto_de_renda = sc.nextDouble();

        System.out.println("\n=== EMISSÃO DE CONTRACHEQUE ===");

        desconto_do_inss = salario_bruto * (taxa_do_inss / 100);

        if (desconto_do_inss > 150.00) {
            desconto_do_inss = 150.00;
        }

        desconto_do_imposto_de_renda = (salario_bruto - desconto_do_inss) * (taxa_do_imposto_de_renda / 100);

        salario_liquido = salario_bruto - desconto_do_inss - desconto_do_imposto_de_renda;

        System.out.println("Salário Bruto: R$ " + salario_bruto);
        System.out.println("Desconto INSS: R$ " + desconto_do_inss);
        System.out.println("Desconto Imposto de Renda: R$ " + desconto_do_imposto_de_renda);
        System.out.println("Salário Líquido: R$ " + salario_liquido);

        sc.close();
    }
}

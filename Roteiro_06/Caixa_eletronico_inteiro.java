import java.util.Scanner;

public class Caixa_eletronico_inteiro {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int valor_disponivel_caixa = 2500; 
        int opcao;

        while (true) {
            System.out.println("\n====== BANCO 24 HORAS ======");
            System.out.println("1 - Exibir saldo disponível no caixa eletrônico");
            System.out.println("2 - Realizar Saque");
            System.out.println("3 - Sair");
            System.out.println();
            System.out.print("Digite a opção desejada: ");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 3) {
                System.out.println("Saindo do Sistema... Obrigado por utilizar o caixa 24 horas!");
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.println("\n===== SALDO DISPONÍVEL NO CAIXA ELETRÔNICO =====");
                    System.out.print("Saldo disponível no caixa eletrônico: " + valor_disponivel_caixa);
                    System.out.println();
                    break;
                
                case 2:
                    System.out.println("\n===== ÁREA DE SAQUE BANCARIO =====");

                    System.out.print("Digite a quantidade de dinheiro que você deseja sacar (entre 1 e 500 reais): ");
                    int valor_de_saque = sc.nextInt();

                    if (valor_de_saque < 1 || valor_de_saque > 500) {
                        System.out.println("Erro: Valor Inválido. Saques permitidos apenas entre 1 e 500 reais.");
                    } else if (valor_de_saque > valor_disponivel_caixa){
                        System.out.println("Erro: Valor de saque digitado não corresponde ao valor existente no caixa eletrônico!");
                    } else {
                        
                        valor_disponivel_caixa -= valor_de_saque;

                        
                        int resto_de_dinheiro = valor_de_saque;

                        int notas_de_50_reais = resto_de_dinheiro / 50;
                        resto_de_dinheiro = resto_de_dinheiro % 50;

                        int notas_de_10_reais = resto_de_dinheiro / 10;
                        resto_de_dinheiro = resto_de_dinheiro % 10;

                        int notas_de_5_reais = resto_de_dinheiro / 5;
                        resto_de_dinheiro = resto_de_dinheiro % 5;

                        int notas1 = resto_de_dinheiro;

                        System.out.println("\n== SAQUE FINAL ==");
                        System.out.println("Quantidade de dinheiro sacado: " + valor_de_saque);
                        
                        System.out.println("Distribuição das notas:");
                        if (notas_de_50_reais > 0) {
                            System.out.println(notas_de_50_reais + " nota(s) de 50 reais");
                        }
                        if (notas_de_10_reais > 0) {
                            System.out.println(notas_de_10_reais + " nota(s) de 10 reais");
                        }
                        if (notas_de_5_reais > 0) {
                            System.out.println(notas_de_5_reais + " nota(s) de 5 reais");
                        }
                        if (notas1 > 0) {
                            System.out.println(notas1 + " nota(s) de 1 real");
                        }

                        System.out.println("Quantidade de dinheiro disponível no caixa eletrônico: " + valor_disponivel_caixa);
                        System.out.println("Retire as cédulas na boca do caixa eletrônico!!");
                    }
                    break;
                
                default:
                    System.out.println("Opção Inválida!!!\nTente Novamente!!");
                    break;
            }
        }
        sc.close();
    }
}

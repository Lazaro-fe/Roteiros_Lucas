import java.util.Scanner;

public class Cidades {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] matriz_de_cidades_e_seus_ddds = new String[6][2];

        System.out.println("\n== REALIZANDO CADASTRO DAS CIDADES E DE SEUS DDDs ==");
        for(int cid = 0; cid < 6; cid++){
            
            System.out.println("Digite o nome da cidade " + (cid + 1) + " : ");
            matriz_de_cidades_e_seus_ddds[cid][0] = sc.next();

            System.out.println("Digite o DDD da cidade" + (cid + 1) + " : ");
            matriz_de_cidades_e_seus_ddds[cid][1] = sc.next();
        }

        String buscando_cidade = "";
        while (!buscando_cidade.equals("fim")) {
            System.out.print("Digite o nome da cidade que você gostaria de achar: ");
            buscando_cidade = sc.next();

            if (buscando_cidade.equals("fim")) {
                System.out.println("Saindo da busca por cidades!");
                break;
            }

            boolean encontrando_cidade = false;
            for(int ui = 0; ui < 6; ui++){
                if (matriz_de_cidades_e_seus_ddds[ui][0].equals(buscando_cidade)) {
                    System.out.print("O DDD da cidade: " + buscando_cidade + " e " +matriz_de_cidades_e_seus_ddds[ui][1]);
                    encontrando_cidade = true;
                    break;
                }
            }

            if (encontrando_cidade == false) {
                System.out.println("A cidade digitada não foi encontrada!");
            }
        }
        sc.close();
    }
}
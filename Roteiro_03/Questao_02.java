// package Roteiro_03;
import java.util.Scanner;

public class Questao_02 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double peso;
        double altura;

        System.out.println("Digite o quanto você pesa:  (em kg)");
        peso = sc.nextDouble();

        System.out.println("Digite a sua altura: (em metros)");
        altura = sc.nextDouble();

        double calculo_imc = peso / (altura *altura);

        if (calculo_imc < 18.5) {
            System.out.println("\n=== DADOS DE IMC ===");
            System.out.println("Peso: " +peso+ " kg ");
            System.out.println("Altura: " +altura+ "metros");
            System.out.println("Abaixo do peso!");
        } else if (calculo_imc <= 18.5 && calculo_imc < 25) {
            System.out.println("\n=== DADOS DE IMC ===");
            System.out.print("Peso: " +peso+ " kg ");
            System.out.println("Altura: " +altura+ "metros");
            System.out.println("Peso Nromal!");
        } else if (calculo_imc <= 25 && calculo_imc < 30) {
            System.out.println("\n=== DADOS DE IMC ===");
            System.out.print("Peso: " +peso+ " kg ");
            System.out.println("Altura: " +altura+ "metros");
            System.out.println("Sobrepeso!");
        } else if (calculo_imc >= 30) {
            System.out.println("\n=== DADOS DE IMC ===");
            System.out.print("Peso: " +peso+ " kg ");
            System.out.println("Altura: " +altura+ "metros");
            System.out.println("Sobrepeso!");
        } else {
            System.out.println("Opção Inválida!\nDigite as informações que se pede!");
        }

        sc.close();
    }
}
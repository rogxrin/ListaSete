// Vinicius Garcia Silva / Ciência Da Computação.

import java.util.Scanner;

public class ListaSeteNDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine().toUpperCase();

        String nomeReverso = new StringBuilder(nome).reverse().toString();

        System.out.println("Nome reverso: " + nomeReverso);
    }
}

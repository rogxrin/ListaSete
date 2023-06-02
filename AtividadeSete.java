// Vinicius Garcia Silva / Ciência Da Computação.

import java.util.Scanner;

public class AtividadeSete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira string: ");
        String string1 = scanner.nextLine();

        System.out.print("Digite a segunda string: ");
        String string2 = scanner.nextLine();

        System.out.println("Conteúdo da primeira string: " + string1);
        System.out.println("Comprimento da primeira string: " + string1.length());

        System.out.println("Conteúdo da segunda string: " + string2);
        System.out.println("Comprimento da segunda string: " + string2.length());

        if (string1.length() == string2.length()) {
            if (string1.equals(string2)) {
                System.out.println("As duas strings possuem o mesmo comprimento e são iguais no conteúdo.");
            } else {
                System.out.println("As duas strings possuem o mesmo comprimento, mas são diferentes no conteúdo.");
            }
        } else {
            System.out.println("As duas strings possuem comprimentos diferentes.");
        }
    }
}

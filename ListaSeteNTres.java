// Vinicius Garcia Silva / Ciência Da Computação.

import java.util.Scanner;

public class ListaSeteNTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número do CPF (formato xxx.xxx.xxx-xx): ");
        String cpf = scanner.nextLine();

        if (validarCPF(cpf)) {
            System.out.println("CPF válido.");
        } else {
            System.out.println("CPF inválido.");
        }
    }

    public static boolean validarCPF(String cpf) {

        cpf = cpf.replace(".", "").replace("-", "");

        if (cpf.length() != 11 || cpf.matches("(\\d)\\1{10}")) {
            return false;
        }

        for (int i = 0; i < 2; i++) {
            int pesoInicial = 10 + i;
            int soma = 0;

            for (int j = 0; j < 9 + i; j++) {
                int digito = Character.getNumericValue(cpf.charAt(j));
                soma += digito * (pesoInicial - j);
            }

            int resto = soma % 11;
            int digitoVerificador = (resto < 2) ? 0 : 11 - resto;

            if (digitoVerificador != Character.getNumericValue(cpf.charAt(9 + i))) {
                return false;
            }
        }

        return true;
    }
}

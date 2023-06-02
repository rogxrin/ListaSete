import java.util.Scanner;

public class ListaSeteNQuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva um número até 99: ");
        int numero = scanner.nextInt();

        if (numero < 0 || numero > 99) {
            System.out.println("Número inválido. Digite um número entre 0 e 99.");
        } else {
            String numeroPorExtenso = NumeroExtenso(numero);
            System.out.println("Número escrito por extenso: " + numeroPorExtenso);
        }
    }

    public static String NumeroExtenso(int numero) {
        String[] unidades = {
                "", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove",
                "dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete",
                "dezoito", "dezenove"

        };

        String[] dezenas = {
                "", "", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"

        };

        if (numero == 0) {

            return "zero";
        }

        else if (numero <= 19) {

            return unidades[numero];
        } else {
            int unidade = numero % 10;
            int dezena = numero / 10;

            if (unidade == 0) {

                return dezenas[dezena];
            } else {

                return dezenas[dezena] + " e " + unidades[unidade];
            }
        }
    }
}

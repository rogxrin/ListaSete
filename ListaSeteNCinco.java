import java.util.Scanner;

public class ListaSeteNCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu número de celular: ");
        String numero = scanner.nextLine();

        numero = numero.replace("-", "");

        if (numero.length() == 8) {
            numero = "9" + numero;
        }

        System.out.println("Número corrigido: " + formatarNumero(numero));
    }

    public static String formatarNumero(String numero) {
        return numero.substring(0, 5) + "-" + numero.substring(5, 8);
    }
}

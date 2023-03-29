import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Insira o segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Insira o terceiro número: ");
        int numero3 = scanner.nextInt();

        int maiorNumero = numero1;

        if (numero2 > maiorNumero) {
            maiorNumero = numero2;
        }

        if (numero3 > maiorNumero) {
            maiorNumero = numero3;
        }

        System.out.println("O maior número é: " + maiorNumero);
    }
}

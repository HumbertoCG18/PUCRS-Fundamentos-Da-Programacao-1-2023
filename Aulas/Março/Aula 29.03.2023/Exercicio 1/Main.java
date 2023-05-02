import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Insira o primeiro número: ");
            int num1 = scanner.nextInt();

            System.out.print("Insira o segundo número: ");
            int num2 = scanner.nextInt();

            System.out.print("Insira o terceiro número: ");
            int num3 = scanner.nextInt();

            int maior = num1;

            if (num2 > maior) {
                maior = num2;
            }

            if (num3 > maior) {
                maior = num3;
            }

            System.out.println("O maior número é: " + maior);
        }
    }
}

package Exercicios.Lista_4;
import java.util.Scanner;

//Aula de maio 03.05.2023

public class Exercicio6{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite uma palavra: ");
            String palavra = scanner.nextLine().toLowerCase();

            boolean palindromo = true;

            for (int i = 0; i < palavra.length() / 2; i++) {
                if (palavra.charAt(i) != palavra.charAt(palavra.length() - 1 - i)) {
                    palindromo = false;
                    break;
                }
            }

            if (palindromo) {
                System.out.println("A palavra " + palavra + " é um palíndromo.");
            } else {
                System.out.println("A palavra " + palavra + " não é um palíndromo.");
            }
        }
    }
}

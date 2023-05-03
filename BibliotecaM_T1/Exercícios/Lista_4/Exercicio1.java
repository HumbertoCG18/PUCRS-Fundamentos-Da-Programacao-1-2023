package BibliotecaM_T1.Exercícios.Lista_4;
import java.util.Scanner;

public class Exercicio1{
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Digite uma frase: ");
            String frase = input.nextLine().toLowerCase();

            int qtdVogais = 0;

            for (int i = 0; i < frase.length(); i++) {
                char letra = frase.charAt(i);

                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                    qtdVogais++;
                }
            }

            System.out.println("A frase digitada possui " + qtdVogais + " vogais.");
        }
    }
}

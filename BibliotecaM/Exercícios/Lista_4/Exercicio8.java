package BibliotecaM.Exercícios.Lista_4;
import java.util.Scanner;

//Aula de maio 03.05.2023

public class Exercicio8{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite a frase que deseja criptografar: ");
            String frase = scanner.nextLine().toUpperCase();

            System.out.print("Digite o valor do deslocamento (entre 1 e 25): ");
            int deslocamento = scanner.nextInt();

            String fraseCriptografada = "";

            for (int i = 0; i < frase.length(); i++) {
                char letra = frase.charAt(i);

                if (letra >= 'A' && letra <= 'Z') {
                    letra = (char) ((letra - 'A' + deslocamento) % 26 + 'A');
                }

                fraseCriptografada += letra;
            }

            System.out.println("Frase criptografada: " + fraseCriptografada);
        }
    }
}

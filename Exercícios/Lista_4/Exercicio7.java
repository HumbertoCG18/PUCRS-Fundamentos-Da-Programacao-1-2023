package Exercícios.Lista_4;
import java.util.Scanner;

//Aula de maio 03.05.2023

public class Exercicio7{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um verbo terminado em AR: ");
            String verbo = scanner.nextLine().toLowerCase();

            String radical = verbo.substring(0, verbo.length() - 2);
            String[] pronomes = {"Eu", "Tu", "Ele", "Nós", "Vós", "Eles"};
            String[] terminacoes = {"o", "as", "a", "amos", "ais", "am"};

            for (int i = 0; i < pronomes.length; i++) {
                System.out.println(pronomes[i] + " " + radical + terminacoes[i]);
            }
        }
    }
}

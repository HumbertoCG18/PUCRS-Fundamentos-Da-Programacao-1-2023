package BibliotecaM_T1.Exercícios.Lista_4;
import java.util.Scanner;

public class Exercicio4{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um texto em letras maiúsculas: ");
            String textoMaiusculo = scanner.nextLine();
            String textoMinusculo = textoMaiusculo.toLowerCase();
            System.out.println("Texto em letras minúsculas: " + textoMinusculo);

            System.out.print("Digite um texto em letras minúsculas: ");
            String textoMinusculo2 = scanner.nextLine();
            String textoMaiusculo2 = textoMinusculo2.toUpperCase();
            System.out.println("Texto em letras maiúsculas: " + textoMaiusculo2);
        }
    }
}

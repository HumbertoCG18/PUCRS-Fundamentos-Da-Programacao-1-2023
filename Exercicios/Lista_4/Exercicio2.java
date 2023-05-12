package Exercicios.Lista_4;
import java.util.Scanner;

//Aula de maio 03.05.2023

public class Exercicio2{
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Digite uma frase: ");
            String frase = input.nextLine().toLowerCase();

            System.out.println("Digite uma palavra: ");
            String palavra = input.nextLine().toLowerCase();

            int qtdPalavras = 0;

            String[] palavras = frase.split(" ");

            for (int i = 0; i < palavras.length; i++) {
                if (palavras[i].equals(palavra)) {
                    qtdPalavras++;
                }
            }

            System.out.println("A palavra '" + palavra + "' apareceu " + qtdPalavras + " vezes na frase.");
        }
    }
}

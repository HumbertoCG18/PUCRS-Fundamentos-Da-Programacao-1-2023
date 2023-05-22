package Exercicios.Lista_6;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        int[] vetor = { 1, 2, 3, 4, 5, 6, 7 };

        exibirMenu(vetor);
    }

    public static void exibirMenu(int[] vetor) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("=== Menu de Posições ===");
            System.out.println("1. Exibir vetores");
            System.out.println("2. Escolher posição");
            System.out.println("3. Sair");
            System.out.println("========================");
            System.out.print("Escolha uma opção: ");

            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        exibirVetor(vetor);
                        break;
                    case 2:
                        escolherPosicao(vetor, scanner);
                        break;
                    case 3:
                        System.out.println("Saindo do programa.");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
            } else {
                System.out.println("Entrada inválida. Certifique-se de informar um número inteiro válido.");
                scanner.nextLine(); // Limpar a entrada inválida
                opcao = 0; // Definir opção inválida para continuar no loop
            }

            System.out.println();
        } while (opcao != 3);

        scanner.close();
    }

    public static void exibirVetor(int[] vetor) {
        System.out.println("========================");
        System.out.println("Vetores:");
        System.out.println();
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        System.out.println();
    }

    public static void escolherPosicao(int[] vetor, Scanner scanner) {
        int posicao;
        System.out.println("========================");
        System.out.print("Informe a posição a ser exibida: ");
        if (scanner.hasNextInt()) {
            posicao = scanner.nextInt();

            if (posicao >= 0 && posicao < vetor.length) {
                System.out.println("========================");
                System.out.println();
                System.out.println("Valor da posição " + posicao + ": " + vetor[posicao]);
            } 
            
            else {
                System.out.println("Posição inválida.");
            }
        } 
        
            else {
            System.out.println("Entrada inválida. Certifique-se de informar um número inteiro válido.");
        }

        scanner.nextLine(); // Limpar a quebra de linha
    }
}

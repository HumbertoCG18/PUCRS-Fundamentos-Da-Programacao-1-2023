package Exercícios.Lista_4;

//Aula de maio 03.05.2023

public class Exercicio3{
    public static void main(String[] args) {
        String palavra = "Java";
        int tamanho = palavra.length();

        for (int i = 0; i < tamanho * 2 - 1; i++) {
            if (i < tamanho) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(palavra.charAt(j));
                }
            } else {
                for (int j = 0; j < tamanho - (i - tamanho + 1); j++) {
                    System.out.print(palavra.charAt(j));
                }
            }
            System.out.println();
        }
    }
}

package Exercicios.Lista_6;

public class Exercicio4{
    public static void main(String[] args) {
        int[] vetor = {5, 2, 9, 1, 7};
        
        int menorValor = encontrarMenorValor(vetor);
        
        System.out.println("Vetores: 5, 2, 9, 1, 7.");

        System.out.println("Menor valor: " + menorValor);
    }
    
    public static int encontrarMenorValor(int[] vetor) {
        if (vetor.length == 0) {
            throw new IllegalArgumentException("O vetor está vazio.");
        }
        
        int menorValor = vetor[0];
        
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menorValor) {
                menorValor = vetor[i];
            }
        }
        
        return menorValor;
    }
}   
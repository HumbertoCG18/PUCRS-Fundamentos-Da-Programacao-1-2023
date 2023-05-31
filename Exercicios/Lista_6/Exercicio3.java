//Autor: Humberto Corrêa Gomes
//Data: 22/05/2023

package Exercicios.Lista_6;

public class Exercicio3{
    public static void main(String[] args) {
        int[] vetor = {5, 2, 9, 1, 7};
        
        int maiorValor = encontrarMaiorValor(vetor);
        
        System.out.println("Vetores: 5, 2, 9, 1, 7.");

        System.out.println("Maior valor: " + maiorValor);
    }
    
    public static int encontrarMaiorValor(int[] vetor) {
        if (vetor.length == 0) {
            throw new IllegalArgumentException("O vetor está vazio.");
        }
        
        int maiorValor = vetor[0];
        
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maiorValor) {
                maiorValor = vetor[i];
            }
        }
        
        return maiorValor;
    }
}

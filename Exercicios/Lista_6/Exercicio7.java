//Autor: Humberto Corrêa Gomes
//Data: 22/05/2023

package Exercicios.Lista_6;

public class Exercicio7{
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7};
        
        int[] vetorAlterado = substituirPosicoesParesImpares(vetor);
        
        System.out.println("Vetor original:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        
        System.out.println("\nVetor alterado:");
        for (int i = 0; i < vetorAlterado.length; i++) {
            System.out.print(vetorAlterado[i] + " ");
        }
    }
    
    public static int[] substituirPosicoesParesImpares(int[] vetor) {
        int[] vetorAlterado = new int[vetor.length];
        
        for (int i = 0; i < vetor.length; i++) {
            vetorAlterado[i] = vetor[i];
        }
        
        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 0) {  // Posição par
                vetorAlterado[i] = -2;
            } else {  // Posição ímpar
                vetorAlterado[i] = -1;
            }
        }
        
        return vetorAlterado;
    }
}


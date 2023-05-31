//Autor: Humberto Corrêa Gomes
//Data: 22/05/2023

package Exercicios.Lista_6;

public class Exercicio6{
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7};
        
        int[] vetorAlterado = trocarPosicoesParesImpares(vetor);
        
        System.out.println("Vetor original:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        
        System.out.println("\nVetor alterado:");
        for (int i = 0; i < vetorAlterado.length; i++) {
            System.out.print(vetorAlterado[i] + " ");
        }
    }
    
    public static int[] trocarPosicoesParesImpares(int[] vetor) {
        int[] vetorAlterado = new int[vetor.length];
        
        for (int i = 0; i < vetor.length; i++) {
            vetorAlterado[i] = vetor[i];
        }
        
        for (int i = 0; i < vetor.length - 1; i += 2) {
            int temp = vetorAlterado[i];
            vetorAlterado[i] = vetorAlterado[i + 1];
            vetorAlterado[i + 1] = temp;
        }
        
        return vetorAlterado;
    }
}

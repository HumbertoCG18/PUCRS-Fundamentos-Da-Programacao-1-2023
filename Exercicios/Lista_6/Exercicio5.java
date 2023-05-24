package Exercicios.Lista_6;

public class Exercicio5{
    public static void main(String[] args) {
        int[] vetor1 = {5, 8, 10};
        int[] vetor2 = {2, 3, 6};
        
        int[] vetor3 = subtrairVetores(vetor1, vetor2);
        
        System.out.println("Resultado da subtração:");
        for (int i = 0; i < vetor3.length; i++) {
            System.out.println(vetor3[i] + " ");
        }
    }
    
    public static int[] subtrairVetores(int[] vetor1, int[] vetor2) {
        if (vetor1.length != vetor2.length) {
            throw new IllegalArgumentException("Os vetores têm tamanhos diferentes.");
        }
        
        int tamanho = vetor1.length;
        int[] vetor3 = new int[tamanho];
        
        for (int i = 0; i < tamanho; i++) {
            vetor3[i] = vetor1[i] - vetor2[i];
        }
        
        return vetor3;
    }
}

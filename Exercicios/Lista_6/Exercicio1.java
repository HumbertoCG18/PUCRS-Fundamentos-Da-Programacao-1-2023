package Exercicios.Lista_6;

public class Exercicio1{
    public static void main(String[] args) {
        int[] vetor1 = {1, 2, 3};
        int[] vetor2 = {4, 5, 6};
        
        int[] resultado = somarVetores(vetor1, vetor2);
        
        System.out.println("Resultado da soma:");
        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i] + " ");
        }
    }
    
    public static int[] somarVetores(int[] vetor1, int[] vetor2) {
        int tamanho = Math.min(vetor1.length, vetor2.length);
        int[] resultado = new int[tamanho];
        
        for (int i = 0; i < tamanho; i++) {
            resultado[i] = vetor1[i] + vetor2[i];
        }
        
        return resultado;
    }
}

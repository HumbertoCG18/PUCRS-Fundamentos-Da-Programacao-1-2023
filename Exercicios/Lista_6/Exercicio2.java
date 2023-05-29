//Autor: Humberto Corrêa Gomes
//Data: 22/05/2023

package Exercicios.Lista_6;

public class Exercicio2{
    public static void main(String[] args) {
        int[] vetor1 = {1, 2, 3};
        int[] vetor2 = {4, 5, 6};
        
        int produtoEscalar = calcularProdutoEscalar(vetor1, vetor2);
        
        System.out.println("Produto escalar: " + produtoEscalar);
    }
    
    public static int calcularProdutoEscalar(int[] vetor1, int[] vetor2) {
        int tamanho = Math.min(vetor1.length, vetor2.length);
        int produtoEscalar = 0;
        
        for (int i = 0; i < tamanho; i++) {
            produtoEscalar += vetor1[i] * vetor2[i];
        }
        
        return produtoEscalar;
    }
}


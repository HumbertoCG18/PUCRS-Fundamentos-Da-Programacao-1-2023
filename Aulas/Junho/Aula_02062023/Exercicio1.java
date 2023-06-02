package Aulas.Junho.Aula_02062023;

public class Exercicio1{
    public static void main(String[] args) {
        int n = 10; // Número de termos da série de Fibonacci
        
        // Criação do vetor para armazenar os termos
        long[] fibonacciSeries = new long[n];
        
        // Geração dos termos da série de Fibonacci
        fibonacciSeries[0] = 0; // Primeiro termo
        fibonacciSeries[1] = 1; // Segundo termo
        
        for (int i = 2; i < n; i++) {
            fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
        }
        
        // Impressão do vetor
        System.out.println("Os 10 primeiros termos da série de Fibonacci são:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciSeries[i] + " ");
        }
    }
}


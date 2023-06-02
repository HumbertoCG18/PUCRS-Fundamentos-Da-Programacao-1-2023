package Aulas.Junho.Aula_02062023;

public class Exercicio2{
    public static void main(String[] args) {
        int[] vetorMDC = new int[11]; // Vetor para armazenar os resultados do MDC
        int numero = 38; // Número inicial
        
        for (int i = 0; i < vetorMDC.length; i++) {
            vetorMDC[i] = calcularMDC(numero, i);
            numero++;
        }
        
        // Imprimir o vetor com os resultados do MDC
        for (int i = 0; i < vetorMDC.length; i++) {
            System.out.println("MDC(" + (38 + i) + ") = " + vetorMDC[i]);
        }
    }
    
    // Método para calcular o MDC de dois números usando o algoritmo de Euclides
    public static int calcularMDC(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

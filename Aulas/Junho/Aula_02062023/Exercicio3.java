package Aulas.Junho.Aula_02062023;

import java.util.Scanner;

public class Exercicio3{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o primeiro número: ");
            int numero1 = scanner.nextInt();
            
            System.out.print("Digite o segundo número: ");
            int numero2 = scanner.nextInt();
            
            int mdc = calcularMDC(numero1, numero2);
            
            System.out.println("O MDC de " + numero1 + " e " + numero2 + " é: " + mdc);
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

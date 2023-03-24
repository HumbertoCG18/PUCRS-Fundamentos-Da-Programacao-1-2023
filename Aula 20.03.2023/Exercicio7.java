// 1.Leia os valores de valor1, valor2 e valor3.
// 2.Escreva os valores lidos.
// 3.Calcule o maior valor entre valor1 e valor2 usando a fórmula: maior = valor1 + valor2 + |valor1 - valor2|/2
// 4.Calcule o maior valor entre o resultado anterior e valor3 usando a mesma fórmula: maior = maior + valor3 + |maior - valor3|/2
// 5.Escreva a mensagem "É o maior" seguida pelo valor do maior encontrado.

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite o valor1: ");
            double valor1 = sc.nextDouble();

            System.out.print("Digite o valor2: ");
            double valor2 = sc.nextDouble();

            System.out.print("Digite o valor3: ");
            double valor3 = sc.nextDouble();

            System.out.println("Valores lidos: " + valor1 + ", " + valor2 + ", " + valor3);

            double maior = valor1 + valor2 + Math.abs(valor1 - valor2) / 2;
            maior = maior + valor3 + Math.abs(maior - valor3) / 2;

            System.out.println("O maior valor é: " + maior + " É o maior");
        }
    }
}

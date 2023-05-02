// 1.Leia um número natural de 3 dígitos.
// 2.Extraia cada dígito do número e armazene em três variáveis distintas.
// 3.Escreva os dígitos na ordem inversa, começando pelo dígito das unidades.

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite um número natural de 3 dígitos: ");
            int num = sc.nextInt();

            int unidade = num % 10;
            int dezena = (num / 10) % 10;
            int centena = num / 100;

            System.out.println("O número digitado de trás para frente é: " + unidade + "" + dezena + "" + centena);
        }
    }
}

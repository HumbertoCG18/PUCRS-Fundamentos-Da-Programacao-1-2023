// 1.Leia as três notas do aluno.
// 2.Calcule a média ponderada, multiplicando cada nota pelo seu respectivo peso e somando o resultado.
// 3.Divida a soma obtida pelo somatório dos pesos (2 + 3 + 5).
// 4.Escreva o resultado na tela.

import java.util.Scanner;

public class Exercicio6 {
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      double nota1, nota2, nota3, mediaPonderada;
      
      System.out.print("Digite a primeira nota: ");
      nota1 = sc.nextDouble();
      
      System.out.print("Digite a segunda nota: ");
      nota2 = sc.nextDouble();
      
      System.out.print("Digite a terceira nota: ");
      nota3 = sc.nextDouble();
      
      mediaPonderada = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;
      
      System.out.println("A média ponderada é: " + mediaPonderada);
      
      sc.close();
   }
}

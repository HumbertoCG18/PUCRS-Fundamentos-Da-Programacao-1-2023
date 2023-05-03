package BibliotecaM_T1.Exercícios.Lista_3;
import java.util.Scanner;
import java.util.Arrays;

public class Exercicio1{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] nums = new int[15];
            int index = 0;
            int max = Integer.MIN_VALUE;

            while (index < 15) {
                System.out.printf("Digite o %dº conjunto de 3 números separados por espaço: ", (index / 3) + 1);
                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();
                int num3 = scanner.nextInt();
                
                if (num1 != num2 && num1 != num3 && num2 != num3) {
                    int[] sorted = {num1, num2, num3};
                    Arrays.sort(sorted);
                    System.out.printf("Os números em ordem decrescente são: %d %d %d\n", sorted[2], sorted[1], sorted[0]);
                    
                    nums[index] = num1;
                    nums[index + 1] = num2;
                    nums[index + 2] = num3;
                    index += 3;
                    
                    if (num1 > max) {
                        max = num1;
                    }
                    if (num2 > max) {
                        max = num2;
                    }
                    if (num3 > max) {
                        max = num3;
                    }
                } else {
                    System.out.println("Os números devem ser diferentes entre si. Tente novamente.");
                }
            }
            
            System.out.printf("O maior número lido foi %d.\n", max);
        }
    }
}

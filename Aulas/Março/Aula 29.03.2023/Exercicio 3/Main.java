import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Digite o terceiro número: ");
        int num3 = scanner.nextInt();
        
        int maior = num1;

        if (num2 > maior) {
            maior = num2;
        }
        
        if (num3 > maior) {
            maior = num3;
        }
        
        System.out.println("O maior valor digitado foi: " + maior);
        
        scanner.close();
    }

}

package BubliotecaM;
import java.util.Scanner;

public class Ler3 {
    public static void main(String args[]){
        int num1 = 0, num2 = 0, num3 = 0;

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Digite um numero qualquer");
                num1 = entrada.nextInt();
            do{
                System.out.println("Digite o segundo número");
                num2 = entrada.nextInt();

                if(num2==num1){
                    System.out.println("Os números não podem ser iguais");
                }

            }while(num1==num2);

            do{
                System.out.println("Digite o terceiro número");
                num3 = entrada.nextInt(); 
                
                if(num3==num1||num3==num2){
                    System.out.println("Os números não podem ser iguais");
                }

            }while(num3==num1||num3==num2);
        }
    } 
}

package BubliotecaM;
import java.util.Arrays;
import java.util.Scanner;

//Ler 3 números distintos, e organizar eles em ordem decrescente. 
public class Ler3 {

    public static int[] ordemDecrescente(int num1, int num2, int num3){
        int[] numeros = { num1, num2, num3 };

        // Ordena os números em ordem decrescente
        Arrays.sort(numeros);
        for (int i = 0; i < numeros.length / 2; i++) {
            int temp = numeros[i];
            numeros[i] = numeros[numeros.length - 1 - i];
            numeros[numeros.length - 1 - i] = temp;
        }
        return numeros;
    }

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

            if(num1 != num2 && num1 != num3 && num2 != num3) {
                if (num1 > num2 && num1 > num3) {
                    if (num2 > num3) {
                        System.out.println(num1 + ", " + num2 + ", " + num3);
                    } else {
                        System.out.println(num1 + ", " + num3 + ", " + num2);
                    }
                } else if (num2 > num1 && num2 > num3) {
                    if (num1 > num3) {
                        System.out.println(num2 + ", " + num1 + ", " + num3);
                    } else {
                        System.out.println(num2 + ", " + num3 + ", " + num1);
                    }
                } else if (num3 > num1 && num3 > num2) {
                    if (num1 > num2) {
                        System.out.println(num3 + ", " + num1 + ", " + num2);
                    } else {
                        System.out.println(num3 + ", " + num2 + ", " + num1);
                    }
                }
            };

        
        }
    } 
}

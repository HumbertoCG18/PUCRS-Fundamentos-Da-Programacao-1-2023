package BibliotecaM_T1;
import java.util.Arrays;
import java.util.Scanner;

//Explicação:

//Criamos três variáveis para armazenar os números digitados pelo usuário: num1, num2 e num3.
//Pedimos ao usuário que digite num1 e, em seguida, usamos um loop do-while para pedir ao usuário que digite num2 até que num2 seja diferente de num1. Em seguida, usamos outro loop do-while para pedir ao usuário que digite num3 até que num3 seja diferente de num1 e num2.
//Criamos três variáveis temporárias: maior, meio e menor. Inicializamos essas variáveis com os valores de num1, num2 e num3, respectivamente.
//Usando condicionais if, verificamos qual é o maior número digitado e colocamos esse valor na variável maior. Em seguida, verificamos qual é o menor número digitado e colocamos esse valor na variável menor. Por fim, colocamos o número restante na variável meio.
//Imprimimos os valores de maior, meio e menor em ordem decrescente.

//Ler 3 números distintos, e organizar eles em ordem decrescente. 
public class Ler3 {

    public static int[] ordemDecrescente(int num1, int num2, int num3){
        int[] numeros = { num1, num2, num3 };
        Arrays.sort(numeros);
        for (int i = 0; i < numeros.length / 2; i++) {
            int temp = numeros[i];
            numeros[i] = numeros[numeros.length - 1 - i];
            numeros[numeros.length - 1 - i] = temp;
        }
        return numeros;
    }

    public static void main(String args[]){
        int num1, num2, num3;

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Digite o primeiro número");
            num1 = entrada.nextInt();
            
            do {
                System.out.println("Digite o segundo número");
                num2 = entrada.nextInt();
                if(num2==num1) {
                    System.out.println("Os números não podem ser iguais");
                }
            } while(num2==num1);

            do {
                System.out.println("Digite o terceiro número");
                num3 = entrada.nextInt(); 
                if(num3==num1 || num3==num2) {
                    System.out.println("Os números não podem ser iguais");
                }
            } while(num3==num1 || num3==num2);

            int[] numeros = ordemDecrescente(num1, num2, num3);
            System.out.println(numeros[0] + ", " + numeros[1] + ", " + numeros[2]);
        }
    } 
}


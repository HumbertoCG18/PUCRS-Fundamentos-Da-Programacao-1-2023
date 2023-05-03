package BibliotecaM_T1.P1;

//O método Defectivo recebe como parâmetro um número inteiro number e percorre todos os números inteiros positivos menores que number para verificar se são divisores de number. A soma de todos os divisores de number é armazenada na variável sum.
//Se a soma dos divisores for menor que number, o número é considerado defectivo e o método retorna true. Caso contrário, o número não é defectivo e o método retorna false.

public class NumDefectivo {
    public static boolean Defectivo(int number) {
        int sum = 0;
        for (int i = 1; i <= number/2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return (sum < number);
    }
}

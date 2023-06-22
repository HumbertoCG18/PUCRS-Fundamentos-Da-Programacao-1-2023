package BibliotecaM.P2;

public class PrimosEmVetor{
    public static void main(String[] args) {
        int[] vetor = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int quantidadePrimos = contarPrimos(vetor);
        System.out.println("Quantidade de números primos: " + quantidadePrimos);
    }

    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        
        // Verifica se o número é divisível por algum inteiro entre 2 e a raiz quadrada do número
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        
        return true;
    }

    public static int contarPrimos(int[] vetor) {
        int quantidadePrimos = 0;
        
        for (int numero : vetor) {
            if (ehPrimo(numero)) {
                quantidadePrimos++;
            }
        }
        
        return quantidadePrimos;
    }
}

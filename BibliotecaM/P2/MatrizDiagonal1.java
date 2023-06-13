package BibliotecaM.P2;

public class MatrizDiagonal1{
    public static int somaDiagonalPrincipal1Laco(int[][] matriz) {
        int soma = 0;
        int tamanho = matriz.length;

        for (int i = 0; i < tamanho; i++) {
            soma += matriz[i][i];
        }

        return soma;
    }

    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int soma = somaDiagonalPrincipal1Laco(matriz);
        System.out.println("Soma dos elementos da diagonal principal (1 laço): " + soma);
    }
}

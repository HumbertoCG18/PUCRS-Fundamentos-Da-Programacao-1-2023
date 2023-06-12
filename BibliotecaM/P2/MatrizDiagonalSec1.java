package BibliotecaM.P2;

public class MatrizDiagonalSec1{
    public static int produtoDiagonalSecundaria1Laco(int[][] matriz) {
        int produto = 1;
        int tamanho = matriz.length;

        for (int i = 0; i < tamanho; i++) {
            produto *= matriz[i][tamanho - 1 - i];
        }

        return produto;
    }

    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int produto = produtoDiagonalSecundaria1Laco(matriz);
        System.out.println("Produto dos elementos da diagonal secundária (1 laço): " + produto);
    }
}

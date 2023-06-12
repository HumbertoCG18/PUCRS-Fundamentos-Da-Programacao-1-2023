package BibliotecaM.P2;

public class MatrizDiagonalSec2{
    public static int produtoDiagonalSecundaria2Lacos(int[][] matriz) {
        int produto = 1;
        int tamanho = matriz.length;

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (i + j == tamanho - 1) {
                    produto *= matriz[i][j];
                }
            }
        }

        return produto;
    }

    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int produto = produtoDiagonalSecundaria2Lacos(matriz);
        System.out.println("Produto dos elementos da diagonal secundária (2 laços): " + produto);
    }
}

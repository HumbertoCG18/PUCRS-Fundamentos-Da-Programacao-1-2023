package BibliotecaM.P2;
public class MatrizDiagonal2 {
    public static int somaDiagonalPrincipal2Lacos(int[][] matriz) {
        int soma = 0;
        int tamanho = matriz.length;

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (i == j) {
                    soma += matriz[i][j];
                }
            }
        }

        return soma;
    }

    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int soma = somaDiagonalPrincipal2Lacos(matriz);
        System.out.println("Soma dos elementos da diagonal principal (2 laços): " + soma);
    }
}

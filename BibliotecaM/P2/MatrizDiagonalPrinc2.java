package BibliotecaM.P2;

public class MatrizDiagonalPrinc2{
    public static int[] diagonalPrincipal2Lacos(int[][] matriz) {
        int tamanho = matriz.length;
        int[] diagonal = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (i == j) {
                    diagonal[i] = matriz[i][j];
                }
            }
        }

        return diagonal;
    }

    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[] diagonal = diagonalPrincipal2Lacos(matriz);
        System.out.print("Elementos da diagonal principal (2 laços): ");
        for (int element : diagonal) {
            System.out.print(element + " ");
        }
    }
}

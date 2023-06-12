package BibliotecaM.P2;

public class MatrizDiagonalPrinc1{
    public static int[] diagonalPrincipal1Laco(int[][] matriz) {
        int tamanho = matriz.length;
        int[] diagonal = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            diagonal[i] = matriz[i][i];
        }

        return diagonal;
    }

    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[] diagonal = diagonalPrincipal1Laco(matriz);
        System.out.print("Elementos da diagonal principal (1 laço): ");
        for (int element : diagonal) {
            System.out.print(element + " ");
        }
    }
}


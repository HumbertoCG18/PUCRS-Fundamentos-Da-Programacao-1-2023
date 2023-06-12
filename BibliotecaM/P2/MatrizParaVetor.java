package BibliotecaM.P2;

public class MatrizParaVetor {
    public static void jogaNoVetor(int[][] matriz, int[] vetor) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        int indice = 0;

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                vetor[indice] = matriz[i][j];
                indice++;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[] vetor = new int[matriz.length * matriz[0].length];

        jogaNoVetor(matriz, vetor);

        System.out.print("Elementos do vetor: ");
        for (int element : vetor) {
            System.out.print(element + " ");
        }
    }
}

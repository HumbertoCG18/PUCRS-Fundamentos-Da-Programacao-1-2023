package BibliotecaM.P2;

public class JogaNaMatriz{
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6};
        int[][] matriz = jogaNaMatriz(vetor, 2, 3);
        
        // Imprime a matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static int[][] jogaNaMatriz(int[] vetor, int linhas, int colunas) {
        int[][] matriz = new int[linhas][colunas];
        int contador = 0;
        
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (contador < vetor.length) {
                    matriz[i][j] = vetor[contador];
                    contador++;
                }
            }
        }
        
        return matriz;
    }
}

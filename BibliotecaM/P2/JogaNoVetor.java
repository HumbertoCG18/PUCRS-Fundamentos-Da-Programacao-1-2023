package BibliotecaM.P2;

public class JogaNoVetor{
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[][] matriz = vetorParaMatriz(vetor, 5);
        
        // Exemplo de uso da matriz resultante
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static int[][] vetorParaMatriz(int[] vetor, int colunas) {
        int linhas = (int) Math.ceil((double) vetor.length / colunas);
        int[][] matriz = new int[linhas][colunas];
        
        int indiceVetor = 0;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (indiceVetor < vetor.length) {
                    matriz[i][j] = vetor[indiceVetor];
                    indiceVetor++;
                } else {
                    matriz[i][j] = 0; // Valor padrão caso o vetor tenha sido preenchido completamente
                }
            }
        }
        
        return matriz;
    }
}


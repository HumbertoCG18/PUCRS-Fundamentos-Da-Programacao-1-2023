package BibliotecaM.P2;

public class OrdenarVetor{
    public static void ordenarVetor(int[] vetor) {
        int tamanho = vetor.length;
        
        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = 0; j < tamanho - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int[] vetor = {5, 2, 8, 1, 9};
        
        System.out.println("Vetor antes da ordenação:");
        imprimirVetor(vetor);
        
        ordenarVetor(vetor);
        
        System.out.println("Vetor após a ordenação:");
        imprimirVetor(vetor);
    }
    
    public static void imprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        
        System.out.println();
    }
}


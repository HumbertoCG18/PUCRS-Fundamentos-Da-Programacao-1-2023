package BibliotecaM.P2;

public class ImpressaoVetor{
    public static void imprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5};
        
        System.out.println("Vetor:");
        imprimirVetor(vetor);
    }
}


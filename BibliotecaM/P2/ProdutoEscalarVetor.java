package BibliotecaM.P2;

public class ProdutoEscalarVetor {
    public class ProdutoEscalar{
    public static double calcularProdutoEscalar(double[] vetor1, double[] vetor2) {
        if (vetor1.length != vetor2.length) {
            throw new IllegalArgumentException("Os vetores devem ter o mesmo tamanho.");
        }
        
        double produtoEscalar = 0;
        
        for (int i = 0; i < vetor1.length; i++) {
            produtoEscalar += vetor1[i] * vetor2[i];
        }
        
        return produtoEscalar;
    }
    
    public static void main(String[] args) {
        double[] vetor1 = {1, 2, 3};
        double[] vetor2 = {4, 5, 6};
        
        double produto = calcularProdutoEscalar(vetor1, vetor2);
        
        System.out.println("O produto escalar dos vetores é: " + produto);
    }
}
}

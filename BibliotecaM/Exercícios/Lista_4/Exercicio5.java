package BibliotecaM.Exercícios.Lista_4;

public class Exercicio5{
    public static void main(String[] args) {
        String palavra = "Java";

        for (int i = 1; i <= palavra.length(); i++) {
            System.out.println(palavra.substring(0, i));
        }

        for (int i = palavra.length() - 1; i >= 1; i--) {
            System.out.println(palavra.substring(0, i));
        }
    }
}

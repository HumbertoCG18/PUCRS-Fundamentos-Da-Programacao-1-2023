import java.util.Scanner;

public class AppBicho {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("\f");
            Bicho um, dois, tres, quatro, cinco;
            
            um = new Bicho("Fufu", 2, 3);
            dois = new Bicho("Conan", 7, 52);
            tres = new Bicho("Spot", 3, 10);
            
            System.out.println("O nome do Bicho 1 é " + um.getNome());
            System.out.println("O nome do Bicho 2 é " + dois.getNome());
            System.out.println("O nome do Bicho 3 é " + tres.getNome());
            
            quatro = um;
            cinco = dois;
            tres = quatro;
            
            System.out.println(um);
            System.out.println(dois);
            System.out.println(tres);
            System.out.println(quatro);
            System.out.println(cinco);
            
        }
    }
}

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite a largura do terreno em metros: ");
            double larguraTerreno = sc.nextDouble();
            
            System.out.print("Digite o comprimento do terreno em metros: ");
            double comprimentoTerreno = sc.nextDouble();
            
            System.out.print("Digite a largura da casa em metros: ");
            double larguraCasa = sc.nextDouble();
            
            System.out.print("Digite o comprimento da casa em metros: ");
            double comprimentoCasa = sc.nextDouble();
            
            double areaTerreno = larguraTerreno * comprimentoTerreno;
            double areaCasa = larguraCasa * comprimentoCasa;
            double areaLivre = areaTerreno - areaCasa;
            
            double porcentagemLivre = areaLivre / areaTerreno * 100;
            
            System.out.println("A área livre do terreno é de " + areaLivre + " metros quadrados");
            System.out.println("Isso representa " + porcentagemLivre + "% da área total do terreno.");
        }
    }

}

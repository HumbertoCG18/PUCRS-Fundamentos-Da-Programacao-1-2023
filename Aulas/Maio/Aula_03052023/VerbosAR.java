package Aulas.Maio.Aula_03052023;
import java.util.*;
///aula de 2 e 4 de maio *** Fundamentos *** Profa.Giraffa


public class VerbosAR{
public static void main(String[] args) 
{
 try (Scanner teclado = new Scanner(System.in)) {
    System.out.println("\n Digite o verbo regular que deseja conjugar");
     String verbo=teclado.nextLine();
     int tam=verbo.length();
     int prefixoT=tam-2;
     String prefixo=verbo.substring(0,prefixoT);
     System.out.println("\n Digite 1 para conjugar no presente, 2-passado e 3-futuro");
    int opcao=teclado.nextInt();
    switch (opcao)
     { 
        
        case 1: {   System.out.println ("eu "+ prefixo+ "o");
                         System.out.println ("tu "+ prefixo+ "as");
                         System.out.println ("ele "+ prefixo+ "a");
                         System.out.println ("vos "+ prefixo+ "ais");
                         System.out.println ("eles "+ prefixo+ "am");
                     }break;
         case 2: {   System.out.println ("eu "+ prefixo+ "ei");
                         System.out.println ("tu "+ prefixo+ "astes");
                         System.out.println ("ele "+ prefixo+ "ou");
                         System.out.println ("vos "+ prefixo+ "astes");
                         System.out.println ("eles "+ prefixo+ "aram");
                     }break;
        case 3: {   System.out.println ("eu "+ prefixo+ "rei");
                         System.out.println ("tu "+ prefixo+ "r�s");
                         System.out.println ("ele "+ prefixo+ "r�");
                         System.out.println ("vos "+ prefixo+ "rais");
                         System.out.println ("eles "+ prefixo+ "r�o");
                     }break;
        default: System.out.println("opcao invalida"); 
        
        }
}
 
 System.out.println("fim...agora coloque  num la�o e deixe  o usario usar varias vezes seu programa.");
}
}

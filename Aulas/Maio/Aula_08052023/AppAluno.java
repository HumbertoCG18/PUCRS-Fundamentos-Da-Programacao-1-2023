package Aulas.Maio.Aula_08052023;
import java.util.*;
/**
 * exemplo Classe Aluno
 *
 * @author (Giraffa)
 * @version (aula 10 de outubro)
 */
public class AppAluno{       
public static void main(String [] args){
        try (Scanner teclado = new Scanner(System.in)) {
                Aluno um= new Aluno ("Eva",18,"Algebra", 9,8,7.5);
                Aluno dois= new Aluno ("Adao",21,"Algebra", 7,8,10);
                //aqui estamos fazendo 2 em 1 criamos a variavel de objeto e ja imediatamente colocamos conteudo (endere�o do objeto criado pelo NEW)
                Aluno quatro, cinco;//variaveis de objeto do tipo Aluno
                System.out.println(um);//ou um.toString()...voces criarem imprimeTudo() um.imprimeTudo();
                System.out.println(dois.toString());//envia uma mensagem objeto.metodo
                // buscar os valores para usar na passagem de parametro ao criar um novo objeto
                System.out.println("\n Digite nome da disciplina:");
                String d=teclado.nextLine();
                System.out.println("\n Digite nome do aluno:");
                String n=teclado.nextLine();
                System.out.println("\n Digite idade do/a aluno/a:");
                int i=teclado.nextInt();
                System.out.println("\n Digite nota1:");
                double n1=teclado.nextDouble();
                System.out.println("\n Digite nota2:");
                double n2=teclado.nextDouble();
                System.out.println("\n Digite nota3:");
                double n3=teclado.nextDouble();
                Aluno tres=new Aluno(n,i,d,n1,n2,n3);//apos obter novos valores para os atrubutos eu crio o objeto tres
                System.out.println(tres);//imprimo o conteudo do objeto
                System.out.println("\n Nome do aluno 1 é: "+ um.getNome());
                System.out.println("\n Nome do aluno 2 é: "+ dois.getNome());
                System.out.println("\n Nome do aluno 3 é: "+ tres.getNome());
                //calcular a media aritmetica de cada aluno ***acessar os dados de cada objeto --metodos ===mensagem objeto.metodo
                double media1=(um.getNota1()+um.getNota2()+um.getNota3())/3;
                double media2=(dois.getNota1()+dois.getNota2()+dois.getNota3())/3;
                double media3=(tres.getNota1()+tres.getNota2()+tres.getNota3())/3;
                System.out.println("\n Media das notas do aluno 1 é: "+ media1);
                System.out.println("\n Media das notas do aluno 2 é: "+ media2);
                System.out.println("\n Media das notas do aluno 3 é: "+ media3);
                //media das medias
                double media= (media1+media2+media3)/3;
                System.out.println("\n Media das medias dos aluno é: "+ media);
                quatro=um;
                cinco=dois;
                tres=quatro;
                System.out.println(um);
                System.out.println(dois);
                System.out.println(tres);
                System.out.println(quatro);
                System.out.println(cinco);
        }
        //exercicio para mostrar que eu estou copiando o conteudo de variaveis
        //como conteudo e um endere�o/referencia termos um determinado objeto cujo endere�o esta em mais de um lugar
        
        
}

}
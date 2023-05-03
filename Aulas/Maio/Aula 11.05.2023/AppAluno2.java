
/**
 * usando a clase Aluno2 na aplicação
 *
 * @author (Giraffa)
 * @version (aula de 11 e 13 maio)
 */
import java.util.*;
public class AppAluno2
{
          
public static void main(String [] args)
{
        Scanner teclado=new Scanner(System.in);
        System.out.println("\f");    
        Aluno2 um= new Aluno2 ("Eva",18,9,8,7.5);
        Aluno2 dois= new Aluno2 ("Adao",21,7,8,10);
        //aqui estamos fazendo 2 em 1 criamos a variavel de objeto e ja imediatamente colocamos conteudo (endereço do objeto criado pelo NEW)
        Aluno2 tres, quatro;//variaveis de objeto do tipo Aluno2
        System.out.println(um);//ou um.toString()...voces criarem imprimeTudo() um.imprimeTudo();
        System.out.println(dois.toString());//envia uma mensagem objeto.metodo
        System.out.println("\n Nome do aluno 1 eh "+ um.getNome());
        System.out.println("\n Nome do aluno 2 eh "+ dois.getNome());
        //calcular a media aritmetica de cada aluno ***acessar os dados de cada objeto --metodos ===mensagem objeto.metodo
        double media1=(um.getNota1()+um.getNota2()+um.getNota3())/3;
        double media2=(dois.getNota1()+dois.getNota2()+ dois.getNota3())/3;
        System.out.println("\n Media das notas do aluno 1 eh "+ media1);
        System.out.println("\n Media das notas do aluno 2 eh "+ media2);
        //media das medias
        double media= (media1+media2)/2;
        System.out.println("\n Media das medias dos alunos eh "+ media);
        quatro=um;
        tres=dois;
        System.out.println(um);
        System.out.println(dois);
        System.out.println(tres);
        System.out.println(quatro);
        //criando objeto Monitor***************************
        Monitor m;//preparando variavel de objeto
        int quant;//guardar onumero de horas
        
        do{
        System.out.println("\n Digite quantidade de horas para monitor/a nao pode ser inferior a 4 e maior que 9");
        quant=teclado.nextInt();
        } while (quant < 4 || quant >10); 
        
        System.out.println("\n Digite nome do monitor/a selecionado");
        String monitor=teclado.next();
        if (monitor.equalsIgnoreCase(um.getNome())) {m=new Monitor (um,quant);}
                                     else {m=new Monitor (dois,quant);}
        
        System.out.println(m);
        
        
        
}

}
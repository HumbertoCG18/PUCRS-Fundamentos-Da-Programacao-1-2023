/**
 * enocntros de 27 e 29/9
 * exemplos de uso ..troque nome dos metdos para deixra claro o que fazem....
 * 
 * no main complete as chamadas  dos metodos que faltam
 */
public class MetodosStringsExercicio
{

    public static int vogais(String palavra)
    {
        int total = 0;
        for(int cont = 0; cont < palavra.length(); cont++)
        {
            char letra = palavra.charAt(cont);
            if(letra == 'a' || letra == 'e' || letra =='i' || letra == 'o' || letra=='u'){
                total++;
            } 
        }
        return total;
    }

    public static boolean verficaInicio(String palavra)
    {
        if(palavra.startsWith("por")){
            return true;
        }else{
            return false;
        }
    }

    public static boolean metodo3(String palavra)
    {
        if(palavra.endsWith("ar")){
            return true;
        }else{
            return false;
        }
    }

    public static int metodo4(String palavra)
    {
        int total = 0;
        for(int cont = 0; cont < palavra.length(); cont++)
        {            
            if(palavra.charAt(cont) == 'i')
            {                
                if(palavra.charAt(cont+1) == 'n')
                {
                    total++;
                } 
            } 
        }
        return total;
    }

    public static void metodo5(String palavra)
    {
        for(int i = 0; i <= (palavra.length()-1);i++)
        {
            for(int j = 0; j <= i;j++)
            {
                System.out.print(palavra.charAt(j));
            }
            System.out.println(" ");
        }
        System.out.println("\n");
        for(int i = 0; i <= (palavra.length()-1);i++)
        {
            for(int j = (palavra.length()-1); j >= i;j--)
            {
                System.out.print(palavra.charAt(j));
            }
            System.out.println(" ");
        }
        System.out.println("\n");
        for(int i = 0; i <= (palavra.length()-1);i++)
        {
            for(int e=(palavra.length()-1); e>i;e--) System.out.print(" ");
            for(int j = i; j >= 0;j--)
            {
                System.out.print(palavra.charAt(j));
            }
            System.out.println(" ");
        }
        System.out.println("\n");
        for(int i = 0; i <= (palavra.length()-1);i++)
        {
            for(int e=0; e<i;e++) System.out.print(" ");
            for(int j = i; j <= (palavra.length()-1);j++)
            {
                System.out.print(palavra.charAt(j));
            }
            System.out.println(" ");
        }
    }   

    public static void metodo6 (String verbo)
    {
        System.out.println("Eu " + verbo + "ei");
        System.out.println("Tu " + verbo + "as");
        System.out.println("Ele/Ela " + verbo + "a");
        System.out.println("Nos " + verbo + "emos");
        System.out.println("Vos " + verbo + "eis");
        System.out.println("Eles/Elas " + verbo + "ao");
    }
    
    
    public static void main(String  args [])
    {
        System.out.println("\f");
        String palavra = "casa";
        System.out.println("metodo 1");
        System.out.println(vogais("palavra"));
        System.out.println("metodo 4");
        System.out.println(metodo4("vencedor"));
    }
}
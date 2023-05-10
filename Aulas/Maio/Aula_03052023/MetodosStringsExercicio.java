package Aulas.Maio.Aula_03052023;
/**
 * semana do String
 * analise os metodos  e coloque nomes mais adequados ao que fazem
 * e coloque em comentarios como eles funcionam
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

    public static boolean verificaFI(String palavra)
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
        //faca as chamadas dos metodos
    }
}
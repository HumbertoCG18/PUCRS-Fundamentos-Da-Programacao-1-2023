package Métodos.Repete;

/*
* *metodos usando estruturas de repetição
* *versao com interação
* *Fundamentos turma 10 & 14
* *aula de 12 de abril de 2023
*
 */


import java.util.*;
public class MetodosRepeteInterativo
{
    public static int quantDiv1 (int valor)
    { int cont=0;
      int ante=1;
      while (ante<= valor)
      {
        if (valor% ante ==0) cont++;
        ante++;
     }
      return cont;
    }
    
     public static int quantDivP (int valor)//quantidade de divisores Proprios
    { int cont=0;
      int ante=1;
      while (ante< valor)
      {
        if (valor% ante ==0) cont++;
        ante++;
     }
      return cont;
    }
    
    
        public static int quantDiv2 (int valor)//usando propriedades
        { int cont=0;
          int ante=0;
          if (valor ==1) {cont= 1;}
              else 
                  { 
                      cont=2;//todo numero e divisivel por ele mesmo e 1 entao ja inicializa o contador com 2
                      ante=2;
                      while (ante < valor)
                      {
                        if (valor% ante ==0) cont++;
                        ante++;
                      }
          
                   }
        return cont;
      }
    
  
      public static int somaDiv (int valor)
        { int soma=0;
          int ante=1;
          while (ante<= valor)
          {
            if (valor% ante ==0) soma=soma+ante;
            ante++;
         }
          return soma;
        }
      
        public static int somaDivP (int valor)
        { int soma=0;
          int ante=1;
          while (ante< valor)
          {
            if (valor% ante ==0) soma=soma+ante;
            ante++;
         }
          return soma;
        }
       
        public static boolean amigos (int a, int b)//dois números sao  amigos se cada um fosse igual à soma dos divisores porprios do outro numero
        { 
            if (somaDivP(a)==b && somaDivP(b) ==a) return true;
               else return false;
             
         }
          
                
        public static void main (String args[]){
            try (Scanner entrada = new Scanner(System.in)) {
              System.out.println("\f");
              System.out.println ("\n Chamada dos metodos \n ********** agora digitando valores");
              int num;
              
              do
              {
              System.out.println ("\n Digite um numero natural maior que zero");
              num=entrada.nextInt();
              } while (num<=0);
              //quantas vezes sera executado este laço?
              
              System.out.println ("\n Quantidade divisores - metodo quantDiv1:   "+ quantDiv1(num));
              System.out.println ("\n Quantidade divisores proprios - metodo quantDivP:   "+ quantDivP(num));
              System.out.println ("\n Quantidade divisores - metodo quantDiv2:   "+ quantDiv2(num));
              
              if (quantDiv1(num)==2) {System.out.println ("\n O numero digitado "+num+ " e primo!");}
                   else {System.out.println ("\n O numero digitado "+num+ " nao e primo!");}
              
              System.out.println ("\n Soma divisores - metodo somaDiv:    "+ somaDiv(num));
  
              System.out.println ("\n Soma divisores proprios- metodo somaDivP:    "+ somaDivP(num));
              
              if (somaDivP(num) == num) {System.out.println ("\n "+ num+ " e um numero perfeito");}//número é perfeito se a soma dos seus divisores for igual ao próprio número
              if (somaDivP(num) < num) {System.out.println ("\n "+ num+ " e um numero defectivo");}//número é defectivo  se a soma dos seus divisores for menor que o próprio número
              if (somaDivP(num) > num) {System.out.println ("\n "+ num+ " e um numero abundante");}//número é abundante   se a soma dos seus divisores for maior  que o próprio número
              
              
              if (amigos(num,220)) {System.out.println ("\n 220 e "+num+ " sao amigos");}
                  else {System.out.println ("\n 220 e "+num+ "  nao sao amigos");}
            }
        }
}
            

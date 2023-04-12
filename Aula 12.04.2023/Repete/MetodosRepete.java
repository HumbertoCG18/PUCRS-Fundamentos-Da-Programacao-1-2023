/*
* *metodos usando estruturas de repetição
* *Fundamentos turma 10 & 14
* *aula de 12 de abril de 2023
*
 */



public class MetodosRepete
{
    public static int quantDiv1 (int valor)
    { int cont=0;//contador
      int ante=1;//gerar os antecessores
      
      while (ante <= valor)
      {
        if (valor% ante ==0) cont++;//cont ++ >> cont=cont+1 sugnifica que valor e divisivel por ante
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
        { int soma=0;//usar acumulador de soma e cuidar de inicializar com elemento neutro da operaçao (adicao) +
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
       
        public static boolean amigos (int a, int b)//dois números sao  amigos se cada um deles e igual à soma dos divisores proprios do outro numero e vice versa
        { 
            if (somaDivP(a)==b && somaDivP(b) ==a) return true;
               else return false;
             
         }
          
                
        public static void main (String args[])
        {
            //sem entrada de dados -- apenas para testar e demonstrar métodos
            System.out.println("\f");
            System.out.println ("\n Chamada dos metodos \n ****************");
            int num=8;//valor fixo
            
            if (num==1) { System.out.println ("\n Quantidade divisores e igual a 1"); } 
                else {System.out.println ("\n Quantidade divisores - metodo quantDiv1:   "+ quantDiv1(num));}//chamada de metodo
                
            System.out.println ("\n Quantidade divisores proprios - metodo quantDivP:   "+ quantDivP(num));//chamada de metodo
            System.out.println ("\n Quantidade divisores - metodo quantDiv2:   "+ quantDiv2(num));//chamada de metodo
            
            if (quantDiv1(num)==2) {System.out.println ("\n num: "+ num + " e primo!");}
                 else {System.out.println ("\n num: "+ num + "nao e primo!");}//aplicacao do metodo para resolver outro problema
            
            System.out.println ("\n Soma divisores - metodo somaDiv:    "+ somaDiv(num));//chamada de metodo
    
            System.out.println ("\n Soma divisores proprios- metodo somaDivP:    "+ somaDivP(num));//chamada de metodo
            
            if (somaDivP(num) == num) {System.out.println ("\n num: "+ num + " um numero perfeito");}//número é perfeito se a soma dos seus divisores for igual ao próprio número
            if (somaDivP(num) < num) {System.out.println ("\n num: "+ num + "e um numero defectivo");}//número é defectivo  se a soma dos seus divisores for menor que o próprio número
            if (somaDivP(num) > num) {System.out.println ("\n num: "+ num + "e um numero abundante");}//número é abundante   se a soma dos seus divisores for maior  que o próprio número
            
            
            if (amigos(284,220)) {System.out.println ("\n 220 e 284 sao amigos");}
                else {System.out.println ("\n nao sao amigos");}
        }
}
            
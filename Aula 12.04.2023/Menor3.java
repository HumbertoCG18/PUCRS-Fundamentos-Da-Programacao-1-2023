public class Menor3{
    public static int  menor1(int a, int b, int c){ //usando operadores logicos
        if ((a<b) && (a <c))  return a;//opcional usar { }
              else{
                if ((b<a) &&(b <c))  {return b;}
                   else {return c;}
                    }
  }
  
  public static int  menor2(int a, int b, int c){ //encadeando
        if (a<b) { if (b<c) {return a;} 
                       else { return c;}
                  }
            else {if (b<c) {return b;} 
                       else {return c;}
    }
}

   public static int  menor3(int a, int b, int c){ //com auxiliar
        int aux=a;//suponho que o 1o valor e o menor
        if ( b<aux) {aux=b;}
        if ( c<aux) {aux=c;}
        return aux;
}
    
   public static void main(String args[]){
        System.out.println("\f");
        int x=3, y=5, z=9;
        //primeiro metodo
        System.out.println ("\n O menor dos valores e: "+ menor1(x,y,z));
        System.out.println ("\n O menor dos valores e: "+ menor1(-2,0,-67));
        //segundo metodo
        System.out.println ("\n O menor dos valores e: "+ menor2(x,y,z));
        System.out.println ("\n O menor dos valores e: "+ menor2(-2,0,-67));
        //terceiro  metodo
        System.out.println ("\n O menor dos valores e: "+ menor3(x,y,z));
        System.out.println ("\n O menor dos valores e: "+ menor3(-2,0,-67));
    }
} 


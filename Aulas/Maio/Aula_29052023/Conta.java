package Aulas.Maio.Aula_29052023;
public class Conta{
    private int numero;
    private double saldo;
    
    Conta(int n){
        numero = n;
        saldo = 0;
    }
    
    public void sacar(double valor){
        if(valor > 0 && valor <= saldo)
           saldo = saldo - valor;
    }
    
    public void depositar(double valor){
        if(valor > 0)
           saldo = saldo + valor;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void setNumero(int num){
         numero=num;
    }
    
    public void setSaldo(int sal){
         saldo=sal;
    }
    public String toString(){
        return "Número da conta: " + numero + "\nSaldo: "+ saldo;
    }
       //       criar um metodo que trasnfere dinheiro de uma conta para outra
       
}

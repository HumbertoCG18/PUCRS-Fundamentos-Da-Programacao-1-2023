package Aulas.Maio.Aula_29052023;
import java.util.Scanner;

public class AplicacaoConta{
    public static void main(String args[]){
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Digite o número da conta:");
            int n = in.nextInt();
            System.out.println("");
            
            Conta c1 = new Conta(n);
            
            while(true){
                int op = menu();
                if(op == 0) break;
                switch(op){
                    case 1: System.out.println("Digite o valor a depositar: ");
                            double valor = in.nextDouble();
                            c1.depositar(valor);
                            break;
                    case 2: System.out.println("Digite o valor a sacar: ");
                            valor = in.nextDouble();
                            c1.sacar(valor);
                            break;
                    case 3: System.out.println("Número da conta: " + c1.getNumero());
                            break;
                    case 4: System.out.println("Saldo: " + c1.getSaldo());
                            break;
                    case 5: System.out.println(c1.toString());
                            break;
                
                        }
                    }
        } 
        
    }

    
    public static int menu(){
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("==========================");
            System.out.println("          Menu de opções");
            System.out.println("==========================");
            System.out.println("(0) Sair");
            System.out.println("(1) Depositar");
            System.out.println("(2) Sacar");
            System.out.println("(3) Verificar número da conta");
            System.out.println("(4) Verificar saldo");
            System.out.println("(5) Relatório da conta");
            //System.out.println("(6) Trasnferir dinheiro entre contas");
            System.out.println("Digite a opção desejada:");
            int op = in.nextInt();
            return op;
        }
    }
}

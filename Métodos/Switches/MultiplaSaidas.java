package Métodos.Switches;

        import java.util.Scanner;//importa a biblioteca para fazer  E/S interativa
        public class MultiplaSaidas{
                public static void diaDaSemana(int valor){
                            switch (valor){
                                        case 1:
                                            //System.out.println("Domingo");return "Domingo" se tivesse colocado String em vez de void
                                            break;
                                        case 2:
                                            System.out.println("Segunda-feira");
                                            break;
                                        case 3:
                                            System.out.println("Terça-feira");
                                            break;
                                        case 4:
                                            System.out.println("Quarta-feira");
                                            break;
                                        case 5:
                                            System.out.println("Quinta-feira");
                                            break;
                                        case 6:
                                            System.out.println("Sexta-feira");
                                            break;
                                         case 7:
                                            System.out.println("Sabado");
                                            break;
                                        default:
                                             System.out.println("Este não é um dia válido!");
                                     }
                        } 
                
            public static void main(String args[]){ //metodo obrigatorio
                try (Scanner entrada = new Scanner(System.in)) {
                    System.out.println("\f");
                    System.out.println("\n Digite dia da Semana= ");
                    int dia=entrada.nextInt();
                    System.out.print("\n O dia lido e: ");
                     diaDaSemana(dia);
                }
            }
        }

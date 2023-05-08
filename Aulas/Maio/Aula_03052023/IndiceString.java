package Aulas.Maio.Aula_03052023;

//aula de   *** Fundamentos *** Profa.Giraffa
public class IndiceString {
public static void main(String[] args) {
String string1 = "www.tiexpert.net";
int posicao;
posicao = string1.indexOf("tiexpert");
if (posicao >= 0) {
System.out.println("A string tiexpert comeca na posicao " + posicao);
} else {
System.out.println("nao há tiexpert na string");
}
posicao = string1.lastIndexOf(".com");
if (posicao >= 0) {
System.out.println("A string .com comeca na posicao " + posicao);
} else {
System.out.println("nao tem .com na string");
}
}
}
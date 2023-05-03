

//aula de   *** Fundamentos *** Profa.Giraffa
public class ExemploSubstring {
public static void main(String[] args) {
String url = "www.fundamentos.org";
String dominio = url.substring(4);
String site = url.substring(url.indexOf('.') + 1, url.lastIndexOf('.'));
System.out.println("analise da string:");
System.out.println("dominio: " + dominio);
System.out.println("Site: " + site);
}
}



//aula de   *** Fundamentos *** Profa.Giraffa
public class InicioFim {
public static void main(String[] args) {
String string1 = "http://www.fundamentos.net";
System.out.println("A string " + string1 + " e:");
// verifica se ha¡ 'http:' no inicio da string
if (string1.startsWith("http:")) {
System.out.println("uma URL");
}
/*
* verifica se ha¡ 'www' no ina­cio da string, mas apenas a partir do
* 8o. caracter, ou seja, apaos o prefixo 'http://', portanto devera¡
* ser compensado 7 caracteres
*/
if (string1.startsWith("www", 7)) {
System.out.println("uma pagina da web");
}
if (string1.endsWith(".br")) {
System.out.println("um site registrado no Brasil");
} else {
System.out.println("nao e um site registrado no Brasil");
}
}
}
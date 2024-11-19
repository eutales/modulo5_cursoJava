package modulo5;

public class ExString {
	public static void main(String[] args) {
		
		String s = new String("Java Iniciante Modulo Um");
		String t = new String("Java Iniciante Modulo Um");
		System.out.println("Tamanho da String = " + s.length());
		System.out.println("Caracter da posição 7 = " + s.charAt(6));
		System.out.println("String em maúscula = " + s.toUpperCase());
		System.out.println("String em minúscula = " + s.toLowerCase());
		System.out.println("Do 3ª ao 13º caractere = " + s.substring(3,13));
		System.out.println("Com espaços = " + "*" + s + "*" );
		System.out.println("Sem espaços = " + s.trim());
		System.out.println("Trocar caractere 'a' por 'u' = " + s.replace("a", "u"));
		
		int a = 1;
		int b = 2;
		System.out.println("valueOf com a sendo 1 e b sendo 2 = " + String.valueOf(a)+String.valueOf(b));
		String [] palavras = s.split(" ");
		
		for (int i = 0; i < palavras.length; i++ ) {
			System.out.println("Palavra " + (i + 1) + ": " + palavras[i]);
		}
		
		if (s.equals(t)) {
			System.out.println("As duas Strings são iguais!");
		}else {
			System.out.println("As duas Strings são diferentes!");
		}
		
	}
	
	

}

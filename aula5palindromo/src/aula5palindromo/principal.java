package aula5palindromo;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// objeto
		Palindromo p1;
		
		// outros
		String palavra;
		Scanner sc = new Scanner(System.in);
		
		// usuario digita a palavra a ser analisada
		System.out.print("Digite uma palavra qualquer: ");
		palavra = sc.next();
		
		// criacao de fato do objeto a partir da palavra coletada
		p1 = new Palindromo(palavra);
		
		p1.setStr(palavra);
		p1.setStrInvertida(palavra);
		
		p1.ehPalindromo();
		p1.quantasVogais();
		
		if (p1.ehPalindromo()==true) {
			System.out.print("A palavra � um pal�ndromo!\n");
		} else if (p1.ehPalindromo()==false) {
			System.out.print("A palavra n�o � um pal�ndromo!\n");
		}
		
		System.out.print("A palavra, ap�s sua invers�o, fica assim: "+p1.strInvertida+".\n");
		
		System.out.print("A palavra possui "+p1.qtdeVogais+" vogais.\n");
		
		
	}

}

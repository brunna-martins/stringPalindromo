package aula5palindromo;

import java.text.Normalizer;

public class Palindromo {
	// definindo atributos
	String str, strInvertida = "";
	boolean palindromo;
	int qtdeVogais;
	
	// getters e setters automáticos
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public String getStrInvertida() {
		return strInvertida;
	}
	public void setStrInvertida(String str) {
		for (int i = (str.length()-1);i>=0;i--) {
			strInvertida += str.charAt(i);
		}
	}
	public boolean isPalindromo() {
		return palindromo;
	}
	public void setPalindromo(boolean palindromo) {
		this.palindromo = palindromo;
	}
	public int getQtdeVogais() {
		return qtdeVogais;
	}
	public void setQtdeVogais(int qtdeVogais) {
		this.qtdeVogais = qtdeVogais;
	}
		
	// construtor alternativo
	public Palindromo(String string) {
		string = str;
	}
	
	public static String removerAcentos(String str) {
	    return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
	}
	
	boolean ehPalindromo() {
		String auxiliar = "";
		str = str.replace(" ","");
		str = str.replace(",","");
		str = str.replace("!","");
		str = str.replace(".","");
		str = str.replace("?","");
		str = str.replace("-","");
		str = str.replace("_","");
		str = str.replace(":","");
		str = str.replace(";","");
		str = str.toLowerCase();
		str = removerAcentos(str);
		
		for (int i = (str.length()-1);i>=0;i--) {
			auxiliar = auxiliar + str.charAt(i);
		}
		if (str.equals(auxiliar)==true) {
			palindromo = true;
			return palindromo;
		} else {
			palindromo = false;
			return palindromo;
		}

	}
	
	int quantasVogais() {
		for (int i = 0;i<=(str.length()-1);i++) {
			if (str.charAt(i)=='a' || str.charAt(i)=='e' || 
				str.charAt(i)=='i' || str.charAt(i)=='o' || 
				str.charAt(i)=='u') {
				qtdeVogais++;
			}
		}
		return qtdeVogais;
	}
	
}

package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Counter {

	public static int contadorPalavras(String palavra) {
		String[] p = palavra.split("\\s+");
		return p.length;
	}
	 
	public static List<String> encontrarPalavras(String frase) {
		List<String> palavras = new ArrayList<>();
		if (frase == null || frase.isEmpty()) {
			return palavras;
		}

		StringTokenizer tokenizer = new StringTokenizer(frase);
		while (tokenizer.hasMoreTokens()) {
			palavras.add(tokenizer.nextToken());
		}

		return palavras;
	}
}

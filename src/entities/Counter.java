package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Counter {
	private String frase;

	public Counter(String frase) {
		this.frase = frase;
	}

	public int contadorPalavras() {
		String[] p = this.frase.split("\\s+");
		return p.length;
	}
	 
	public List<String> encontrarPalavras() {
		List<String> palavras = new ArrayList<>();
		if (this.frase == null || this.frase.isEmpty()) {
			return palavras;
		}

		StringTokenizer tokenizer = new StringTokenizer(this.frase);
		while (tokenizer.hasMoreTokens()) {
			palavras.add(tokenizer.nextToken());
		}

		return palavras;
	}
	
	public int contadorLetras() {
		int count = 0;
		for (int i = 0; i < this.frase.length(); i++) {
			if (Character.isLetter(this.frase.charAt(i))) {
				count++;
			}
		}
		return count;
	}
}

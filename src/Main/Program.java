package Main;

import java.util.Scanner;

import entities.Counter;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.printf("Digite uma frase: ");
		String palavra = sc.nextLine();

		int quantidadeDePalavras = Counter.contadorPalavras(palavra);
		System.out.println("Numero total de palavras nesta frase: " + quantidadeDePalavras);

		System.out.println(Counter.encontrarPalavras(palavra));

      	sc.close();
	}
}

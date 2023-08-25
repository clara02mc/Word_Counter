package Main;

import java.util.Scanner;

import entities.Counter;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Digite uma frase: ");
		String palavra = sc.nextLine();
		
		int Quantidadedepalavras = Counter.ContadordePalavras(palavra);
		System.out.printf("Numero total de palavras nesta frase: " + Quantidadedepalavras);

	
		System.out.println(Counter.encontrarPalavras( palavra));

      sc.close();
	}


	}



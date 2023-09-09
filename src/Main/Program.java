package Main;



import java.util.Scanner;

import entities.Counter;


public class Program {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Digite uma frase: ");
		String frase = sc.nextLine();

		Counter contador = new Counter(frase);

		int quantidadeDePalavras = contador.contadorPalavras();
		System.out.println("Numero total de palavras nesta frase: " + quantidadeDePalavras);
		
		System.out.println(contador.encontrarPalavras());
		System.out.println("Numero total de letras neste texto: " + contador.contadorLetras());
      	
		sc.close();
	}
}
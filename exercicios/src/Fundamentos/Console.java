package Fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {

		System.out.println("Bom dia");
		System.out.println(" Dia");

		System.out.println("Bom");
		System.out.println("dia");

		System.out.printf("Megasena: %d %d %d %d %d %d", 1, 2, 3, 4, 5, 6);
		System.out.printf("Salário: 1f%n", 1234.5678);
		System.out.printf("Nome: %s%n","João");
		
		System.out.println("________________________________________________________________________________________________________________________________");
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual seu Nome? ");
		String nome = entrada.nextLine();
		System.out.println("Qual seu Sobrenome? ");
		String sobrenome = entrada.nextLine();
		
		System.out.println("Que idade você tem? ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos.%n",
				nome, sobrenome, idade);
		
		entrada.close();	
		
		
	}

}

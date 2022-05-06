package br.com.entra21.Aula03.Exercicio04.TemperaturaC;

import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		System.out.println("Converta graus Fahrenheit em Celsius.");
		System.out.println("Sabendo que a formula é: Subtrair a temperatura em 32 e dividir por 1.8");

		Scanner entrada = new Scanner(System.in);
		float TemperaturaF = 30f;
		
		System.out.println("Qual a TemperaturaF?");
		TemperaturaF = entrada.nextFloat();
		
		System.out.println("A temperatura em Fahrenheit é "+(TemperaturaF-32)/1.8"C");
		
		
		
		
		
		
		
		
		
		
		
	}
}
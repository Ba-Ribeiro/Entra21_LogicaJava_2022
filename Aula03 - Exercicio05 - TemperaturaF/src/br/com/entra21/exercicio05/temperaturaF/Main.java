package br.com.entra21.exercicio05.temperaturaF;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Converta graus Celsius em Fahrenheit.");
		System.out.println("Sabendo que a formula para converter é: Multiplicar a temperatura celsius por 1.8 e somar 32 ao resultado.");

		Scanner entrada = new Scanner(System.in);
		float TemperaturaC = 30f;
		
		System.out.println("Qual a TemperaturaC?");
		TemperaturaC = entrada.nextFloat();
		
		System.out.println("A temperatura em Fahrenheit é "+ 32+(TemperaturaC*1.8)+"F");

		
		
				
	}

}


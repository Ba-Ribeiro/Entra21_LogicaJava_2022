package br.com.entra21.aula08.prova02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Calculadora();
	}

	@SuppressWarnings("resource")
	public static void Calculadora() {
		Scanner entrada = new Scanner(System.in);

		float numeroA, numeroB;
		int operacao;

		System.out.println("Qual operação você deseja realizar?\n" + "0 - Encerrar Programa \n" + "1 - Soma \n"
				+ "2 - Subtração \n" + "3 - Divisão \n" + "4 - Multiplicação");
		operacao = entrada.nextInt();

		System.out.println("Informe o primeiro número:");
		numeroA = entrada.nextFloat();
		System.out.println("Informe o segundo número");
		numeroB = entrada.nextFloat();

		switch (operacao) {

		case 0: {
			break;
		}
		default:
			System.out.println("Não tem essa opção no menu.");
			Calculadora();
			break;

		case 1: {
			float soma = numeroA + numeroB;
			System.out.println("O resultado da soma é: " + soma);
			Calculadora();
			break;
		}
		case 2: {
			float subtracao = numeroA - numeroB;
			System.out.println("O resultado da subtração é: " + subtracao);
			Calculadora();
			break;

		}
		case 4: {
			float multiplicacao = numeroA * numeroB;
			System.out.println("O resultado da multiplicação é: " + multiplicacao);
			Calculadora();
			break;

		}
		case 3: {
			float divisao = numeroA / numeroB;
			System.out.println("O resultado da divisão é: " + divisao);
			Calculadora();
			break;

		}

		}
	}
}
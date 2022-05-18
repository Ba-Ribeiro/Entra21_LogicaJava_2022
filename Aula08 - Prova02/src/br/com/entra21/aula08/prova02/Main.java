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

		System.out.println("Qual opera��o voc� deseja realizar?\n" + "0 - Encerrar Programa \n" + "1 - Soma \n"
				+ "2 - Subtra��o \n" + "3 - Divis�o \n" + "4 - Multiplica��o");
		operacao = entrada.nextInt();

		System.out.println("Informe o primeiro n�mero:");
		numeroA = entrada.nextFloat();
		System.out.println("Informe o segundo n�mero");
		numeroB = entrada.nextFloat();

		switch (operacao) {

		case 0: {
			break;
		}
		default:
			System.out.println("N�o tem essa op��o no menu.");
			Calculadora();
			break;

		case 1: {
			float soma = numeroA + numeroB;
			System.out.println("O resultado da soma �: " + soma);
			Calculadora();
			break;
		}
		case 2: {
			float subtracao = numeroA - numeroB;
			System.out.println("O resultado da subtra��o �: " + subtracao);
			Calculadora();
			break;

		}
		case 4: {
			float multiplicacao = numeroA * numeroB;
			System.out.println("O resultado da multiplica��o �: " + multiplicacao);
			Calculadora();
			break;

		}
		case 3: {
			float divisao = numeroA / numeroB;
			System.out.println("O resultado da divis�o �: " + divisao);
			Calculadora();
			break;

		}

		}
	}
}
package br.com.entra21.exercicio.imc;

import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		System.out.println("calcular o IMC");
		
		Scanner entrada = new Scanner(System.in);
		float peso = 70.5f, altura = 2.05f;
		
		System.out.println("Meu peso � " + peso);
		System.out.println("Minha altura � " + altura);
		System.out.println("O meu IMC � " + peso/(altura*altura));


	}

}

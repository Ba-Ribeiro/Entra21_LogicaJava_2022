package br.com.entra21.exercicio.imc;

import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		System.out.println("calcular o IMC");
		
		Scanner entrada = new Scanner(System.in);
		float peso = 70.5f, altura = 2.05f;
		
		System.out.println("Meu peso é " + peso);
		System.out.println("Minha altura é " + altura);
		System.out.println("O meu IMC é " + peso/(altura*altura));


	}

}

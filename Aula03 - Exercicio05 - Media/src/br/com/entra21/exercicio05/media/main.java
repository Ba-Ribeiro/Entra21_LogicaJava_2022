package br.com.entra21.exercicio05.media;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		System.out.println("Capture o nome do aluno e valor de suas 3 notas para informar a m�dia");
		
		String nome;
		double primeiranota,segundanota,terceiranota;
		
		Scanner entrada;
		entrada = new Scanner(System.in);
		
		/*
		 * System.out.println("Qual � o seu nome?"); nome =
		 * entrada.nextLine();
		 * 
		 * System.out.println("Informe a sua primeira Nota:"); primeiranota = entrada.nextByte();
		 * 
		 * System.out.println("Informe a sua segunda Nota:"); segundanota = entrada.nextFloat();
		 * 
		 * System.out.println("Informe a sua terceira Nota:"); terceiranota = entrada.nextFloat();
		 * System.out.println("Media Aritimetica"+((primeiranota+segundanota+terceira)/3)); terceiranota = entrada.nextFloat();
		 * 
		 */

		nome = JOptionPane.showInputDialog("Qual � o seu nome?");
	
		primeiranota = Byte.parseByte(
				JOptionPane.showInputDialog("Informe a sua primeira nota:")
				);
		segundanota = Byte.parseByte(
				JOptionPane.showInputDialog("Informe a sua segunda nota:")
				);
		terceiranota = Byte.parseByte(
				JOptionPane.showInputDialog("Informe a sua terceira nota:")
				);
		JOptionPane.showMessageDialog(null, "Media Aritimetica �: "+((primeiranota+segundanota+terceiranota)/3));

	}

}

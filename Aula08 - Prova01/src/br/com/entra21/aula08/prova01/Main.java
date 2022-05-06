package br.com.entra21.aula08.prova01;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String nome;
		int mes,dia;	
		nome = JOptionPane.showInputDialog("Digite seu nome:");
		dia = Integer.parseInt(JOptionPane.showInputDialog("\nDigite o Dia:\n"));
		mes = Integer.parseInt(JOptionPane.showInputDialog("\nDigite o Mês:\n"));
		
	/*
	 * System.out.println("Qual é o seu nome?") = nome = entrada.nextLine();
	 * System.out.println("Qual o Dia e o Mês que você nasceu?") =  Dia,Mês = entrada.nextbyte();
	 *  
	 */
		
		if(mes == 3 && dia >= 21 && dia <=31 && mes<=12  || (mes == 4 && dia<= 20 && mes<=12))
			JOptionPane.showMessageDialog(null,nome +"Seu Signo é: Aquario");
		if(mes == 2 && dia >= 19 && dia <=28 && mes <=12 || mes == 3 && dia <= 20 && dia <=31) 
			JOptionPane.showMessageDialog(null,"Seu signo é: Peixe");
		if(mes == 5  && dia >= 21 && dia <=31 && mes <= 12 || (mes== 6 && dia<=20)) 
			JOptionPane.showMessageDialog(null,"Seu Signo é: Gêmeos");
		if(mes == 3  && dia >= 21 && dia <=31 && mes<=12 || (mes== 4 && dia<=20 && mes <=12))
			JOptionPane.showMessageDialog(null,"Seu Signo é: Aries");
		else
		if((mes == 4  && dia >= 21) && mes <=12 || (mes== 5 && dia<=20 && dia <=31))
			JOptionPane.showMessageDialog(null,"Seu Signo é: Touro");
		else
		if((mes == 5  && dia >= 21) && dia <=31 && mes<=12 || (mes== 6 && dia <=20))
			JOptionPane.showMessageDialog(null,"Seu Signo é: Gêmeos");
		else
		if((mes == 6  && dia >= 21) || (mes== 7 && dia<=22 && dia <=31 && mes<=12))
			JOptionPane.showMessageDialog(null,"Seu Signo é: Câncer");
		else
		if((mes == 7  && dia >= 23) || (mes== 8 && dia<=22 && dia <=31 && mes<=12))
			JOptionPane.showMessageDialog(null,"Seu Signo é: Leão");
		else
		if((mes == 8  && dia >= 23) && dia <=31 && mes<=12 || (mes== 9 && dia<=22))
			JOptionPane.showMessageDialog(null,"Seu Signo é: Virgem");
		else
		if((mes == 9  && dia >= 23) || (mes== 10 && dia<=22 && dia <=31 && mes<=12))
			JOptionPane.showMessageDialog(null,"Seu Signo é: Libra");
		else
		if((mes == 10  && dia >= 23) && dia <=31 && mes<=12 || (mes== 11 && dia<=21))
			JOptionPane.showMessageDialog(null,"Seu Signo é: Escorpião");
		else
		if((mes == 11  && dia >= 22) || (mes== 12 && dia<=21 && dia <=31 && mes<=12))
			JOptionPane.showMessageDialog(null,"Seu Signo é: Sagitário");
		else
		if((mes == 12  && dia >= 22) && dia <=31 && mes<=12 || (mes== 1 && dia<=19))
			JOptionPane.showMessageDialog(null,"Seu Signo é: Capricórnio");
		else
		if(mes == 2 && dia > 29)
			JOptionPane.showMessageDialog(null,"Esse mês vai até dia 29!");
		else
		if(dia>=31)
			JOptionPane.showMessageDialog(null,"ESSE DIA NÃO EXISTE!!");
		else
		if(mes>=12)
			JOptionPane.showMessageDialog(null,"ESSE MÊS NÃO EXISTE!!");
		
	}		
			
}
		
		
		

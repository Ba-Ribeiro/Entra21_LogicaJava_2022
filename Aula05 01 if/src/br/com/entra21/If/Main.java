package br.com.entra21.If;

public class Main {

	public static void main(String[] args) {
		System.out.println("Aprendendo sobre If");
		
		if(false) {
			System.out.println("Vai faazer isso quando der true");
			System.out.println(" Somente true");
		}
	
		System.out.println("Aqui vai acontecer naturalmente pq o codigo segue sempre em frente");
		
		if(false)  {
			 //nunca passaria aqui pois apenas quando resulta em true passa por esse bloco
		}
		byte idade = 17;
		if(idade>=18) {// � maior de idade?
			//sim
			System.out.println("� maior de idade");
		}
		
		if( (idade>=13) && (idade<18) )  {//� adolescente (13~17)?
			System.out.println("� adolescente");
		}
	}
}
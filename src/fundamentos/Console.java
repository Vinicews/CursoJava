package fundamentos;


import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double numero;
		System.out.println("Digite um numero: \n");
		numero = entrada.nextDouble();
		
		System.out.println("o numero é " + numero);
		
		
		
		entrada.close();
		
		
	}
	
	
	
	
	
	
	
	
	
	
}

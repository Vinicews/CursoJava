package fundamentos;

import java.util.Scanner;

public class DesafioContaBancaria {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String nome = "Vinícius Martins";
		String tipoConta = "Corrente";
		double saldoAtual = 2500.00;

		System.out.printf("Nome: %s \nConta: %s \nSaldo: %f\n\n"
				, nome, tipoConta, saldoAtual);
		System.out.println("Menu \n1 - Consultar Saldo \n2 - Depósito" 
				+ " \n3 - Saque \n4 - Sair\n\n");

		int opcaoDigitada = 0;
		double deposito = 0;
		double saque = 0;

		while (opcaoDigitada < 4 || opcaoDigitada > 4 || saldoAtual < 0 ) {
			System.out.print("\nSelecione uma opção: ");
			opcaoDigitada = entrada.nextInt();

			
			if (opcaoDigitada > 4) {
				System.out.println("Digite uma opção válida.");
				opcaoDigitada++;
				
				
			}
			
			if (opcaoDigitada == 1) {
				System.out.println("O saldo atual é: " + saldoAtual);
			} else if (opcaoDigitada == 2) {
				System.out.print("Digite o valor a ser depositado: ");
				deposito = entrada.nextDouble();
				saldoAtual += deposito;
				System.out.println("O seu saldo atual é: " + saldoAtual);
				
			} else if (opcaoDigitada == 3) {
				System.out.print("Digite o valor a ser sacado: ");
				saque = entrada.nextDouble();
				saldoAtual -= saque;
				System.out.println("O seu saldo atual é: " + saldoAtual);
				
			} 
			
			if (opcaoDigitada == 4) {
				System.out.println("\nVocê saiu do sistema.");
				
			}
		}
				
		entrada.close();
		
	}
	
}
				
				
		
			
			
			
			

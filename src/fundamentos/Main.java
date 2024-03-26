package fundamentos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Calculadora c = new Calculadora();

		System.out.print("Digite o numero 1:");
		c.numero1 = input.nextDouble();

		System.out.print("Operação: ");
		c.operador = input.next();

		System.out.print("Digite o numero 2:");

		c.numero2 = input.nextDouble();

		System.out.println("Resultado: " + c.calcular(c.numero1, c.numero2));

		input.close();

	}

}

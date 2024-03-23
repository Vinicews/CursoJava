package arrays;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int qtdNotas;
		System.out.print("Quantas notas você quer informar? ");
		qtdNotas = entrada.nextInt();

		double[] notas = new double[qtdNotas];
		// System.out.println(Arrays.toString(qtdNotasDigitadas));

		for (int i = 0; i < notas.length; i++) {
			System.out.print("Digite a nota " + (i + 1) + ": ");
			notas[i] = entrada.nextDouble();

		}
		double total = 0;
		for (double nota : notas) {
			total += nota;

		}
		System.out.println("A média é: " + (total / notas.length));

		entrada.close();

		// System.out.println(Arrays.toString(qtdNotasDigitadas));

	}
}

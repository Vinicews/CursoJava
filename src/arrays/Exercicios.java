package arrays;

import java.util.Arrays;

public class Exercicios {

	public static void main(String[] args) {

		double[] notasAlunoA = new double[4];
		System.out.println(Arrays.toString(notasAlunoA));
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;

		System.out.println(Arrays.toString(notasAlunoA));
		System.out.println(notasAlunoA[0]);
		System.out.println(notasAlunoA[notasAlunoA.length - 1]);
		
		
		double total=0;
		for(int i = 0; i < notasAlunoA.length; i++) {
			total += notasAlunoA[i];
		}
		
		System.out.println(total / notasAlunoA.length);
		
		//outa forma de declarar um array
		
		double notaArmazenada = 5.5;
		double [] notasAlunoB = {6.9, 8.9, notaArmazenada, 10};
		//System.out.println(notasAlunoB);
		
		double total2 = 0;
		for(int c= 0; c < notasAlunoB.length; c ++) {
			total2 += notasAlunoB[c];
			System.out.println(total2 / notasAlunoB.length);
		}
	

	}

}

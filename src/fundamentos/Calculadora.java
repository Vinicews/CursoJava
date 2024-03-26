package fundamentos;

public class Calculadora {

	double numero1;
	double numero2;
	String operador = "+ - * /";

	double calcular(double numero1, double numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;

		double calc = 0;
		if (operador.equals("+")) {
			calc = numero1 + numero2;
		} else if (operador.equals("-")) {
			calc = numero1 - numero2;
		} else if (operador.equals("*")) {
			calc = numero1 * numero2;
		} else if (operador.equals("/")) {
			calc = numero1 / numero2;
		}
		return calc;
	}

	
	
	
}

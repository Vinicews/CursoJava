package fundamentos;

public class OperadorTernario {
	
	public static void main(String[] args) {
		
		double media = 3.9;
		String resultadoParcial = media >= 5.0 ? "recuperação" : "reprovado";
		String resultadoFinal = media >= 7.0 ? "Aprovado" : resultadoParcial;
		
		System.out.println(resultadoFinal);
	}

}

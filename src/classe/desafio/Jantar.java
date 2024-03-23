package classe.desafio;

public class Jantar {
	
	public static void main(String[] args) {
		
		
		Comida c1 = new Comida("Lasanha", 0.500);
		Comida c2 = new Comida("Strogonoff", 0.300);
		//c1.nome="Arroz";
		//c1.peso= 0.300;
		
		Pessoa p1 = new Pessoa("Vinicius", 90.00);
		//p1.nome="Vinicius";
		
		
		System.out.println(p1.apresentar());
		
		p1.comer(c1);
		System.out.println(p1.apresentar());
		
		
		p1.comer(c2);
		System.out.println(p1.apresentar());
		
		
	
	}

}

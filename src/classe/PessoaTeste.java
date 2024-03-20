package classe;

public class PessoaTeste {
	
	
	public static void main(String[] args) {
		

		Pessoa p1 = new Pessoa();
		p1.nome= "Vinicius";
		p1.email="emailteste@gmail.com";
		p1.idade=29;
		p1.cpf="00000000000";
				
	
		
		
		
		
		Pessoa p2 = new Pessoa();
		p2.nome= "Ingrid";
		p2.email="emailteste2@gmail.com";
		p2.idade=25;
		p2.cpf="00000000000";
		
		
		System.out.println("O nome é:  " + p1.nome);
	}

}	


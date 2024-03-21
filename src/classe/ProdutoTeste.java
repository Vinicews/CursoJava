package classe;


public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 4.500, 0.10);
		//p1.preco = 4500.00;
		//p1.desconto = 0.10;
		double precoFinal1 = p1.precoComDesconto(0.10);		
		
		var p2 = new Produto();
		p2.nome="Caixa de som";
		p2.preco = 50.00;
		p2.desconto = 0.10;
		double precoFinal2 = p2.precoComDesconto();		
		
		System.out.println(p1.nome);
		System.out.println("O preço com desconto é: " + precoFinal1 );
		System.out.println(p2.nome);
		System.out.println("O preço com desconto é: " + precoFinal2 );
		
		
		


   }
}

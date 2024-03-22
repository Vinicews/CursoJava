package classe;

public class ProdutoTeste {

	public static void main(String[] args) {

		Produto p1 = new Produto();
		p1.nome = "notebook";
		p1.preco=4500.00;
		
		Produto.desconto = 0.50;
		

		var p2 = new Produto();
		p2.nome = "Caixa de som";
		p2.preco = 50.00;
		
		
        double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();

		System.out.println(p1.nome + "\n" + p1.preco + "\n" + precoFinal1);
		System.out.println("O preço com desconto é: ");
		System.out.println(p2.nome);
		System.out.println("O preço com desconto é: " + precoFinal2);

	}
}

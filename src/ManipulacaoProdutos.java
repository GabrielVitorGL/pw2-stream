import java.util.Arrays;
import java.util.List;
import java.util.Optional;
public class ManipulacaoProdutos {
      public static void main(String[] args) {
		Produto p1 = new Produto();
		p1.setId(1);
		p1.setNome("Água");
		p1.setCategoria(CategoriaEnum.BEBIDA);
		p1.setPreco(4);
		Produto p2 = new Produto();
		p2.setId(2);
		p2.setNome("Coca Cola");
		p2.setCategoria(CategoriaEnum.BEBIDA);
		p2.setPreco(5);
		Produto p3 = new Produto();
		p3.setId(3);
		p3.setNome("Bolo de morango 5kg");
		p3.setCategoria(CategoriaEnum.PADARIA);
		p3.setPreco(60);
		Produto p4 = new Produto();
		p4.setId(4);
		p4.setNome("Banana");
		p4.setCategoria(CategoriaEnum.HORTIFRUTI);
		p4.setPreco(2);
		Produto p5 = new Produto();
		p5.setId(5);
		p5.setNome("Pasta de Dente");
		p5.setCategoria(CategoriaEnum.HIGIENE);
		p5.setPreco(6);
		
		List<Produto> produtos = Arrays.asList(new Produto[]{p1,p2,p3,p4,p5});

		// Exibir produtos com preço acima de 50
		System.out.println("Produtos com preço acima de 50: \n");
		for (int i = 0; i < produtos.size(); i++) {
			if (produtos.get(i).getPreco() > 50) {
				System.out.println("- " + produtos.get(i).getNome());
			}
		}
		
		// Exibir todas as bebidas
		System.out.println("_________________________\nBebidas: \n");
		for (int i = 0; i < produtos.size(); i++) {
			if (produtos.get(i).getCategoria() == CategoriaEnum.BEBIDA) {
				System.out.println("- " + produtos.get(i).getNome());
			}
		}
		
		// Quantidade de produtos da categoria padaria
		int numProdutosPadaria = 0;
		for (int i = 0; i < produtos.size(); i++) {
			if (produtos.get(i).getCategoria() == CategoriaEnum.PADARIA) {
				numProdutosPadaria++;
			}
		}
		System.out.println("_________________________\nQuantidade de produtos da categoria padaria: " + numProdutosPadaria);
	}
}

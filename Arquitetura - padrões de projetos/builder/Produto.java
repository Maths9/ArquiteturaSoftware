import Categoria;
import Cor;
import Produto;
import Tamanho;

public class ProdutoControl {
	private Produto produto = new Produto();
	
	public Produto recuperarIdDeTodasPecas(Produto produto) {
		return produto.recuperarIdDeTodasPecas(produto);
	}
	
	public void cadastrarProduto(Produto p) {
		produto.cadastrarProduto(p);
	}

	public void removerProduto(Produto p) {
		produto.removerProduto(p);
	}

	public void editarProduto(Produto p) {
		produto.editarProduto(p);
	}

	public Produto getProduto(Produto p) {
		return produto.getProduto(p);
	}

	public Produto getProdutos() {
		return produto.getProdutos();
	}

	public void adicionarCor(Cor c) {
		produto.adicionarCor(c);
	}

	public void removerCor(Cor c) {
		produto.removerCor(c);
	}

	public Cor getCores() {
		return produto.getCores();
	}

	public void adicionarTamanho(Tamanho t) {
		produto.adicionarTamanho(t);
	}

	public void removerTamanho(Tamanho t) {
		produto.removerTamanho(t);
	}

	public Tamanho getTamanhos() {
		return produto.getTamanhos();
	}

	public void adicionarCategoria(Categoria c) {
		produto.adicionarCategoria(c);
	}

	public void removerCategoria(Categoria c) {
		produto.removerCategoria(c);
	}

	public Categoria getCategorias() {
		return produto.getCategorias();
	}
}
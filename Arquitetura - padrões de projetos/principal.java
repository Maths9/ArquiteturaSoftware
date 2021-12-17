import Produto;
import Cliente;
import funcionario;
import venda;

public class Principal {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        cliente.getCodigo(12);
        cliente.getNome("lopes");
        cliente.getTelefone("4002-8922");

       Funcionario funcionario = newfuncionario();

       funcionario.getCodigo(7);
       funcionario.getNome("gabriel");

        Produto produto1 = new Produto();

        produto1.getCategoria("Camisas");
        produto1.getCor("branco");
        produto1.getTamanho("M");
        produto1.getValor(new BigDecimal(30.00));

        Produto produto2 = new Produto();

        produto1.getCategoria("calcas");
        produto1.getCor("preto");
        produto1.getTamanho("G");
        produto1.getValor(new BigDecimal(100.00));

        Produto produto3 = new Produto();

        produto1.getCategoria("Short");
        produto1.getCor("cinza");
        produto1.getTamanho("M");
        produto1.getValor(new BigDecimal(60.00));

        Venda venda = new venda();

        venda.getNumerovenda("9");
        venda.getCliente(cliente);
        venda.getfuncionario(funcionario);
        venda.getprodutos(new ArrayList<>());
        venda.getprodutos().add(produto1);
        venda.getprodutos().add(produto2);
        venda.getprodutos().add(produto3);

        venda.informacoes();

    }

}
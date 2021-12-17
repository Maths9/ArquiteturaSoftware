import Cliente;
import Pagamento;
import Venda;
import Model.Venda;

public class VendaControl {

	private Venda venda = new Venda();
	
	public Venda getNumVenda() {
		return venda.getNumVenda();
	}
	
	public Venda getVendas(){
		return venda.getVendas();
	}
	
	public Venda getProdutosVenda(Venda v) {
		return venda.getProdutosVenda(v);
	}
	
	
	public Venda getComprasDoCliente(Cliente cliente) {
		return venda.getComprasDoCliente(cliente);
	}
	
	public void efetuarVendaAVista(Venda v, Pagamento p) {
		venda.efetuarVendaAVista(v, p);
	}
	
	public void efetuarVendaCartao(Venda v, Pagamento p) {
		venda.efetuarVendaCartao(v, p);
	}
	
	
	
}
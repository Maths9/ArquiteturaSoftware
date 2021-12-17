
public class cliente {

	private cliente clientecliente = new cliente();
	
	public void adicionarcliente(cliente ) {				
		clientecliente.adicionarcliente();
	}

	public void removercliente(cliente ) {
		clientecliente.removercliente();
	}

	public void editarcliente(cliente ) {
		clientecliente.editarcliente();
	}

	public cliente getcliente(cliente ) {
		return clientecliente.getcliente();
	}
	
	public cliente getclientePorCPF(cliente ) {
		return clientecliente.getclientePorCPF();
	}

    public cliente getclientePorCodigo(cliente ) {
		return clientecliente.getclientePorCodigo();
	}
    
    public cliente getclientePorTelefone(cliente ) {
		return clientecliente.getclientePorTelefone();
	}

	public cliente getclientes() {
		return clientecliente.getclientes();
	}

	public cliente recuperarCPFDeTodosclientes(cliente clientecliente) {
		return clientecliente.recuperarCPFDeTodosclientes(clientecliente);
	}
}
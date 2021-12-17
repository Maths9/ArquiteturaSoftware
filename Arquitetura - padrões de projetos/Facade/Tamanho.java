import java.util.ArrayList;

public class Tamanho {

	private int id;
	private String tamanho;
	private ArrayList<Tamanho> tamanhos = new ArrayList<>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public ArrayList<Tamanho> getTamanhos() {
		return tamanhos;
	}
	public void setTamanhos(ArrayList<Tamanho> tamanhos) {
		this.tamanhos = tamanhos;
	}
	
}
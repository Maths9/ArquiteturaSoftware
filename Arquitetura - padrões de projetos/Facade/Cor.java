import java.util.ArrayList;

public class Cor {

	private int id;
	private String nomeCor;
	private ArrayList<Cor> cores = new ArrayList<>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeCor() {
		return nomeCor;
	}
	public void setNomeCor(String nomeCor) {
		this.nomeCor = nomeCor;
	}
	public ArrayList<Cor> getCores() {
		return cores;
	}
	public void setCores(ArrayList<Cor> cores) {
		this.cores = cores;
	}
	
}
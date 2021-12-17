import java.util.ArrayList;

public class Bandeira {

	private int id;
	private String nomeBandeira;
	private ArrayList<Bandeira> bandeiras = new ArrayList<>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeBandeira() {
		return nomeBandeira;
	}
	public void setNomeBandeira(String nomeBandeira) {
		this.nomeBandeira = nomeBandeira;
	}
	public ArrayList<Bandeira> getBandeiras() {
		return bandeiras;
	}
	public void setBandeiras(ArrayList<Bandeira> bandeiras) {
		this.bandeiras = bandeiras;
	}
	
}
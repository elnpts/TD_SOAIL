package RestTest.Service;

public class Etudiant {
	private int id;
	private String nom;
	private String prenom;
	private Binome binome;
	private Stage stage;
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getPrenom() {
		return prenom;
	}
	public Binome getBinome() {
		return binome;
	}
	public void setBinome(Binome binome) {
		this.binome = binome;
	}
}

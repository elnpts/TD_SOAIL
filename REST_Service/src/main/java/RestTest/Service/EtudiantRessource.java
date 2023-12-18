package RestTest.Service;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("etudiant")
public class EtudiantRessource {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Etudiant getEtudiant() {
		Etudiant etudiant = new Etudiant();
		etudiant.setNom("N");
		etudiant.setPrenom("G");
		etudiant.setId(01);
		return etudiant;
	}
    @GET
    @Path("/{idEtudiant}")
    @Produces(MediaType.APPLICATION_JSON)
    public Etudiant getEtudaint(@PathParam("idEtudiant") int id){
    	Etudiant etudiant= new Etudiant();
    	etudiant.setPrenom("A");
    	etudiant.setNom("B");
    	return etudiant;
    }
    @POST
    @Path("/{idEtudiant}")
    @Produces(MediaType.APPLICATION_JSON)
    public void addEtudiant(Etudiant etudNouv) {
    	System.out.println("Ajout de l'étudiant "+etudNouv.getNom()+" "+etudNouv.getPrenom()+" Réussie! ");
    	System.out.println("Son binôme est "+etudNouv.getBinome().getPrenom()+" "+etudNouv.getBinome().getNom());
    }
}

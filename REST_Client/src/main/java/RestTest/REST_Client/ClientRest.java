package RestTest.REST_Client;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Form;

public class ClientRest {
    public static void main(String[] args) {
        // Instantiation du client
        Client client = ClientBuilder.newClient();

        // Test de la méthode addPeopleInNeed avec une requête POST
        Response responseAddPeopleInNeed = client.target("http://localhost:8080/REST_Service/webapi/user-manager/add-people-in-need")
                .request()
                .post(Entity.form(
                        new jakarta.ws.rs.core.Form()
                                .param("username", "JohnDoe")
                                .param("email", "john.doe@example.com")
                                .param("password", "password123")
                                .param("role", "inNeed")
                                .param("address", "123 Main St")
                                .param("needs", "Food, Shelter")
                ));

        // Lecture de la réponse de la méthode addPeopleInNeed
        System.out.println("Response from addPeopleInNeed: " + responseAddPeopleInNeed.readEntity(String.class));

        // Ajoutez d'autres tests pour les autres méthodes au besoin

        // Fermeture du client
        client.close();
    }
}

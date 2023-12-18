package Service_web;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import fr.insa.soap.wsdltojava.UserManagerService;

public class WebServiceClient {

    private static final String NAMESPACE_URI = "http://Service_web/";
    private static final String SERVICE_NAME = "user-manager";

    public static void main(String[] args) throws MalformedURLException {
        // Test pour UserManagerService
        testUserManagerService();

        // Ajoutez d'autres tests pour d'autres services web si nécessaire
    }

    private static void testUserManagerService() throws MalformedURLException {
        URL wsdlURL = new URL("http://localhost:8089/?wsdl");
        QName serviceName = new QName(NAMESPACE_URI, SERVICE_NAME);
        Service service = Service.create(wsdlURL, serviceName);

        // Création du proxy pour l'appel du service
        UserManagerService port = service.getPort(UserManagerService.class);


        // Test des méthodes add-people-in-need, add-volunteers, add-validators
        System.out.println(port.addPeopleInNeed("John", "john@example.com", "password", "InNeed", "Address", "Basic needs"));
        System.out.println(port.addVolunteers("Volunteer1", "volunteer1@example.com", "password", "Volunteer", "Skills", true));
        System.out.println(port.addValidators("Validator1", "validator1@example.com", "password", "Validator", 3));
    }
}

package Service_web;

import java.net.MalformedURLException;
import javax.xml.ws.Endpoint;

public class Analyser_test {
    public static String host = "localhost";
    public static short port = 8089;

    public void demarrerService() {
        // Initialise la base de données en mémoire
        InMemoryDatabase.initDatabase();

        String url = "http://" + host + ":" + port + "/";
        Endpoint.publish(url, new UserManagerService());
    }

    public static void main(String[] args) throws MalformedURLException {
        new Analyser_test().demarrerService();
        System.out.println("Service launched");
    }
}




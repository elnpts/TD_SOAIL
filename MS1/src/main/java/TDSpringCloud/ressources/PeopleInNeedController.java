package TDSpringCloud.ressources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import Model.*;

@SpringBootApplication
@RestController
@RequestMapping("/people-in-need")
public class PeopleInNeedController {

    private final List<PersonInNeed> peopleInNeedList = new ArrayList<>();

    
    @GetMapping("/hello")
    public String sayHello() {
        return "Communication Establish with people-in-need!";
    }
    // Endpoint pour ajouter une PersonInNeed
    @PostMapping("/add")
    public ResponseEntity<String> addPersonInNeed(@RequestBody PersonInNeed personInNeed) {
        peopleInNeedList.add(personInNeed);
        return new ResponseEntity<>("PersonInNeed ajouté avec succès!", HttpStatus.CREATED);
    }

    // Endpoint pour récupérer toutes les PersonInNeed
    @GetMapping("/all")
    public ResponseEntity<List<PersonInNeed>> getAllPeopleInNeed() {
        return new ResponseEntity<>(peopleInNeedList, HttpStatus.OK);
    }

    // Endpoint pour récupérer une PersonInNeed par son ID
    @GetMapping("/{id}")
    public ResponseEntity<PersonInNeed> getPersonInNeedById(@PathVariable Long id) {
        for (PersonInNeed personInNeed : peopleInNeedList) {
            if (personInNeed.getId().equals(id)) {
                return new ResponseEntity<>(personInNeed, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // Endpoint pour supprimer une PersonInNeed par son ID
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePersonInNeedById(@PathVariable Long id) {
        peopleInNeedList.removeIf(personInNeed -> personInNeed.getId().equals(id));
        return new ResponseEntity<>("PersonInNeed supprimé avec succès!", HttpStatus.OK);
    }
}

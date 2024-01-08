package TDSpringCloud.ressources;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import model.ValidatorService;
import model.ValidatorService.Validator;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/validators")
public class ValidatorController {

	private final List<Validator> validatorList = new ArrayList<>();

	
    private RestTemplate restTemplate = new RestTemplate();

    public void Microservice2Controller(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/people-in-need")
    public String invokeMicroservice1() {
        // Invoke Microservice1 using RestTemplate
        return restTemplate.getForObject("http://localhost:8761" + "/people-in-need/hello", String.class);
    }
    
    // Endpoint pour ajouter un Validator
    @PostMapping("/add")
    public ResponseEntity<String> addValidator(@RequestBody Validator validator) {
        validatorList.add(validator);
        return new ResponseEntity<>("Validator ajouté avec succès!", HttpStatus.CREATED);
    }

    // Endpoint pour récupérer tous les Validators
    @GetMapping("/all")
    public ResponseEntity<List<Validator>> getAllValidators() {
        return new ResponseEntity<>(validatorList, HttpStatus.OK);
    }

    // Endpoint pour récupérer un Validator par son username
    @GetMapping("/{username}")
    public ResponseEntity<Validator> getValidatorByUsername(@PathVariable String username) {
        for (Validator validator : validatorList) {
            if (validator.getUsername().equals(username)) {
                return new ResponseEntity<>(validator, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // Endpoint pour supprimer un Validator par son username
    @DeleteMapping("/{username}")
    public ResponseEntity<String> deleteValidatorByUsername(@PathVariable String username) {
        validatorList.removeIf(validator -> validator.getUsername().equals(username));
        return new ResponseEntity<>("Validator supprimé avec succès!", HttpStatus.OK);
    }
}
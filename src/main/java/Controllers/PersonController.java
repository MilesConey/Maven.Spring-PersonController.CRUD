package Controllers;

import io.zipcoder.crudapp.Person;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpMethod.*;

@RestController
public class PersonController {
    @PostMapping (value = "/people")
    Person createPerson(Person p){
        return p;
    }
    @GetMapping(value = "/people/{id}")
    Person getPerson(@PathVariable("id") int id){

        return null;
    }
    @GetMapping(value = "/people")
    List<Person> getPersonList(){

        return null;
    }
    @PutMapping(value = "/people/{id}")
    Person updatePerson(Person p){

        return p;
    }

    @DeleteMapping(value = "/people/{id}")
    void DeletePerson(@PathVariable("id") Long id){

    }
}

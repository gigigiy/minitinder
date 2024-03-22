package kg.java.minitinder.controllers;

import kg.java.minitinder.models.Person;
import kg.java.minitinder.services.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/person")
public class PersonController {
    private  final PersonService personService;




    @GetMapping("/find/by/id{id}")
    Person findById(@PathVariable Long id){
        return personService.findById(id);
    }

    @GetMapping("/find/all")
    List<Person> findAll(){
        return personService.findAll();

    }
}
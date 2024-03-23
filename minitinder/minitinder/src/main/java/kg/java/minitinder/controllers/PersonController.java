package kg.java.minitinder.controllers;

import kg.java.minitinder.models.Person;
import kg.java.minitinder.models.dto.AccountCreateRequest;
import kg.java.minitinder.services.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/person")
public class PersonController {
    private  final PersonService personService;

    @PostMapping("/create")
    ResponseEntity<?> create(@RequestBody AccountCreateRequest request){
        try{
            return new ResponseEntity<>(personService.create(request), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.I_AM_A_TEAPOT);
        }
    }



}
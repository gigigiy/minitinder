package kg.java.minitinder.services;

import kg.java.minitinder.models.Person;
import kg.java.minitinder.models.dto.AccountCreateRequest;
import kg.java.minitinder.models.dto.Response;


import java.util.List;

public interface PersonService {
    Person save(Person person);
    Person findById(Long id);


    List<Person> findAll();
    Person  findByName(String name);

        Response create(AccountCreateRequest request);
}

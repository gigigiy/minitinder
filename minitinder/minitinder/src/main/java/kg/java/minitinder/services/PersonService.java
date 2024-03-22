package kg.java.minitinder.services;

import kg.java.minitinder.models.Person;

import java.util.List;

public interface PersonService {
    Person save(Person person);
    Person findById(Long id);


    List<Person> findAll();
}

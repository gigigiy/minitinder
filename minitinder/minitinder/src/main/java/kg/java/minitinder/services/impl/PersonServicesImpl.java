package kg.java.minitinder.services.impl;

import kg.java.minitinder.dao.PersonRepository;
import kg.java.minitinder.models.Person;
import kg.java.minitinder.services.PersonService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Component
public class PersonServicesImpl implements PersonService {

    private final PersonRepository repository;

    public PersonServicesImpl(PersonRepository repository) {
        this.repository = repository;
    }

    @Override
    public Person save(Person person) {
        person.setId(1L);
        return person;
    }

    @Override
    public Person findById(Long id) {
        return null;
    }

    @Override
    public List<Person> findAll() {
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            people.add(findById(Long.valueOf(i)));
        }
        return people;
    }

}

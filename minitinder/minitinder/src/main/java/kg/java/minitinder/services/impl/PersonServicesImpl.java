package kg.java.minitinder.services.impl;

import kg.java.minitinder.dao.PersonRepository;
import kg.java.minitinder.models.Person;
import kg.java.minitinder.models.dto.AccountCreateRequest;
import kg.java.minitinder.models.dto.Response;
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
        return repository.save(person);
    }

    @Override
    public Person findById(Long id) {
        return repository.findById(id).orElseThrow(() ->  new RuntimeException("по id" + id + "не найден обьект"));
    }

    @Override
    public List<Person> findAll() {
        return null;
    }

    @Override
    public Person findByName(String name) {
        return repository.findByFirstName(name);
    }

    @Override
    public Response create(AccountCreateRequest request) {
        return null;
    }


}

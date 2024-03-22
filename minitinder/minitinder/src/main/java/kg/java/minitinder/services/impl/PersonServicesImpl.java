package kg.java.minitinder.services.impl;

import kg.java.minitinder.models.Order;
import kg.java.minitinder.models.Person;
import kg.java.minitinder.services.PersonService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@Component
public class PersonServicesImpl implements PersonService {
    @Override
    public Person save(Person person) {
        person.setId(1L);
        return person;
    }

    @Override
    public Person findById(Long id) {
        Order order = new Order(1L, "Accepted");
        return new Person(id, "Test", "test", 23, Arrays.asList(order));
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

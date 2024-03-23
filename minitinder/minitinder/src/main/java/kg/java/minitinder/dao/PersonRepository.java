package kg.java.minitinder.dao;

import kg.java.minitinder.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {
  Person findByFirstName(String firstName);

  @Query(value = "select  p from Person p where p.lastName=:lastName" ,nativeQuery = false)
  Person findByLastName(String lastName);

  @Query(value = "select from tb_person p where p.age = :age",nativeQuery = true)
  Person findByAge(int age);
}

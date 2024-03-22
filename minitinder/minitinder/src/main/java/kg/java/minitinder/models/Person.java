package kg.java.minitinder.models;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Person {

    Long id;
    String fisrtName;
    String lastName;
    int age;
    List<Order> order;


    public Person(String fisrtName, String lastName, int age) {
        this.fisrtName = fisrtName;
        this.lastName = lastName;
        this.age = age;
    }
}

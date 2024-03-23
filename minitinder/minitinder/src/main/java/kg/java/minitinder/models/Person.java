package kg.java.minitinder.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "tb_person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    String fisrtName;
    String lastName;
    int age;
    String info;
    @OneToOne
    @JoinColumn(name = "account_id")
    Account account;




}

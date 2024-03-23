package kg.java.minitinder.models;

import jakarta.persistence.*;
import kg.java.minitinder.models.enums.AccountStatus;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "tb_account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    String login;
    String password;
    int count;
    @Enumerated(EnumType.STRING)
    AccountStatus status;
}

package kg.java.minitinder.models;


import jakarta.persistence.*;
import kg.java.minitinder.models.enums.OrderStatus;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name="tb_order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    OrderStatus status;
    String comment;
    @ManyToOne
    @JoinColumn(name = "master_id")
    Person master;
    @ManyToOne
    @JoinColumn(name = "slave_id")
    Person slave;

}

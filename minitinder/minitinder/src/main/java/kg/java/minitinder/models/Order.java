package kg.java.minitinder.models;


import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Order {

    Long id;
    String status;

}

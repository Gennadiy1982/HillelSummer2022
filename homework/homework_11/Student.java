package homework_11;

import lombok.*;
import lombok.experimental.Accessors;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(chain = true)
public class Student {

    private int id;
    @ToString.Exclude
    private String name;

    private int age;
}

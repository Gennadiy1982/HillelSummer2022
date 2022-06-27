package main.java.com.hillel;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Employer {
    private int id;
    private String name;
    private int age;
}

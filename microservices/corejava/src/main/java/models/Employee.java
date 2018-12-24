package models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Employee {
    private int id;
    private String name;
    private Address address;
}

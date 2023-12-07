package dev.majidhajric.core.port.in;

import lombok.Data;

@Data
public class PetQuery {

    private String breed;

    private String color;

    private Integer age;
}

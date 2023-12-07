package dev.majidhajric.core.model;

import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter(AccessLevel.PRIVATE)
@ToString
@EqualsAndHashCode(callSuper = false, of = "id")
public class Pet {
    private UUID id;
    private String name;
    private String breed;
    private PetGender gender;
    private LocalDate birthDate;
    private String color;
}

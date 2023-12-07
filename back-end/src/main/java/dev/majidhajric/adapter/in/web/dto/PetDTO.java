package dev.majidhajric.adapter.in.web.dto;

import dev.majidhajric.core.model.Pet;
import dev.majidhajric.core.model.PetGender;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@ToString
public class PetDTO {

    public PetDTO(Pet pet) {
        this.id = pet.getId();
        this.name = pet.getName();
        this.breed = pet.getBreed();
        this.color = pet.getColor();
        this.age = LocalDate.now().getYear() - pet.getBirthDate().getYear();
        this.gender = pet.getGender();
    }

    private final UUID id;
    private final String name;
    private final String breed;
    private final PetGender gender;
    private final Integer age;
    private final String color;
}

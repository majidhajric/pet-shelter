package dev.majidhajric.adapter.out.persistence.entity;

import dev.majidhajric.core.model.Pet;
import dev.majidhajric.core.model.PetGender;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;


@Entity
@Data
public class PetEntity {

    @Id
    private UUID id;
    private String name;
    private String breed;
    private PetGender gender;
    private LocalDate birthDate;
    private String color;

    public PetEntity(Pet pet) {
        this.id = pet.getId();
        this.name = pet.getName();
        this.breed = pet.getBreed();
        this.gender = pet.getGender();
        this.birthDate = pet.getBirthDate();
        this.color = pet.getColor();
    }
}

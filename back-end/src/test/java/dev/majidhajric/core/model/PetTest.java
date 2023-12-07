package dev.majidhajric.core.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class PetTest {

    @Test
    void testGettersAndSetters() {
        LocalDate now = LocalDate.of(2019, 1, 1);
        Pet pet = new Pet(UUID.fromString("123e4567-e89b-12d3-a456-426614174000"), "Majid", "German Shepherd", PetGender.MALE, now, "Black");
        assertEquals("Majid", pet.getName());
        assertEquals("German Shepherd", pet.getBreed());
        assertEquals(PetGender.MALE, pet.getGender());
        assertEquals(now, pet.getBirthDate());
        assertEquals("Black", pet.getColor());
    }

}
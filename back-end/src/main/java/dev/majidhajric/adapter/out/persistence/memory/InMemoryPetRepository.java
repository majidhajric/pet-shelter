package dev.majidhajric.adapter.out.persistence.memory;

import dev.majidhajric.core.model.Pet;
import dev.majidhajric.core.model.PetGender;
import dev.majidhajric.core.port.out.PetRepository;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

@Component
public class InMemoryPetRepository implements PetRepository {

    private final List<Pet> pets = Collections.synchronizedList(List.of(
            new Pet(UUID.randomUUID(), "Dođi", "German Shepherd", PetGender.MALE, LocalDate.of(2019, 1, 1), "Black")
    ));

    @Override
    public Collection<Pet> findAll() {
        return pets;
    }

    @Override
    public Pet save(Pet pet) {
        pets.add(pet);
        return pet;
    }

    @Override
    public Collection<Pet> findAllByBreedAndColorAndAge(String breed, String color, Integer age) {
        return pets;
    }
}

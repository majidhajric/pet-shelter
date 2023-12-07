package dev.majidhajric.core.port.out;

import dev.majidhajric.core.model.Pet;

import java.util.Collection;

public interface PetRepository {
    Collection<Pet> findAll();

    Pet save(Pet pet);

    Collection<Pet> findAllByBreedAndColorAndAge(String breed, String color, Integer age);
}

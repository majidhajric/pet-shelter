package dev.majidhajric.core.service;

import dev.majidhajric.core.model.Pet;
import dev.majidhajric.core.port.in.PetQuery;
import dev.majidhajric.core.port.out.PetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@RequiredArgsConstructor
@Service
public class PetService {

    private final PetRepository petRepository;

    public Collection<Pet> getAllPets() {
        return petRepository.findAll();
    }

    public Collection<Pet> searchPets(PetQuery query) {
        return petRepository.findAllByBreedAndColorAndAge(query.getBreed(), query.getColor(), query.getAge());
    }
}

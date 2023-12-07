package dev.majidhajric.core.service;

import dev.majidhajric.core.model.Pet;
import dev.majidhajric.core.model.PetGender;
import dev.majidhajric.core.port.out.PetRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class PetServiceTest {


    private Pet pet = new Pet(UUID.randomUUID(), "Majid", "German Shepherd", PetGender.MALE, LocalDate.of(2019, 1, 1), "Black");

    @InjectMocks
    private PetService petService;

    @Mock
    private PetRepository petRepository;

    @Test
    void getAllPets() {
        given(petRepository.findAll()).willReturn(List.of(pet));
        assertEquals(1, petService.getAllPets().size());
        assertEquals("Majid", petService.getAllPets().stream().findFirst().get().getName());
    }

    @Test
    void searchPets() {
    }
}
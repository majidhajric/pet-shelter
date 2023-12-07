package dev.majidhajric.adapter.in.web.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.majidhajric.core.model.Pet;
import dev.majidhajric.core.model.PetGender;
import dev.majidhajric.core.service.PetService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class PetControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PetService petService;

    @Test
    public void givenListOfPets_whenGetAllPets_thenReturnPetsList() throws Exception {
        final List<Pet> pets = List.of(
                new Pet(UUID.randomUUID(), "Majid", "Human", PetGender.MALE, LocalDate.of(1984, 1, 1), "White"),
                new Pet(UUID.randomUUID(), "Majid", "German Shepherd", PetGender.MALE, LocalDate.of(2019, 1, 1), "Black")
        );

        given(petService.getAllPets()).willReturn(pets);

        mockMvc.perform(get("/api/v1/pets"))
                .andExpect(status().isOk())
                .andReturn();
    }
}
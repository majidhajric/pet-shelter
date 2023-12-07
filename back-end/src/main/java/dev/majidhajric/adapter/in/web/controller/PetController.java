package dev.majidhajric.adapter.in.web.controller;

import dev.majidhajric.adapter.in.web.dto.PetDTO;
import dev.majidhajric.core.port.in.PetQuery;
import dev.majidhajric.core.service.PetService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/pets")
public class PetController {

    private final PetService petService;


    @GetMapping
    public Collection<PetDTO> getAllPets() {
        return petService.getAllPets().stream().map(PetDTO::new).toList();
    }

    @GetMapping("/search")
    public Collection<PetDTO> searchPets(PetQuery query) {
        return petService.searchPets(query).stream().map(PetDTO::new).toList();
    }
}

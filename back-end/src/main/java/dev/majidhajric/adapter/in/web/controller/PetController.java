package dev.majidhajric.adapter.in.web.controller;

import dev.majidhajric.adapter.in.web.dto.PetDTO;
import dev.majidhajric.core.port.in.PetQuery;
import dev.majidhajric.core.service.PetService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RequiredArgsConstructor
@RestController
public class PetController {

    private final PetService petService;


    @GetMapping("/pets")
    public Collection<PetDTO> getAllPets() {
        return petService.getAllPets().stream().map(PetDTO::new).toList();
    }

    @GetMapping("/pets/search")
    public Collection<PetDTO> searchPets(PetQuery query) {
        return petService.searchPets(query).stream().map(PetDTO::new).toList();
    }
}

package testapps.springframework.txnspringdi31.controllers;

import org.springframework.stereotype.Controller;
import some.other.example.pakkage.services.PetService;

@Controller
public class PetController {
    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    public String whichPetIsTheBest() {
        return "PetController >>>> " + petService.getPetType();
    }

}

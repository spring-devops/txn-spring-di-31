package testapps.springframework.txnspringdi31.controllers.pets;

import org.springframework.stereotype.Controller;
import testapps.springframework.txnspringdi31.services.petsexample.PetService;

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

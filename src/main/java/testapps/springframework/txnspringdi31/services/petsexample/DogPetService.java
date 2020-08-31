package testapps.springframework.txnspringdi31.services.petsexample;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("PD")
@Service("dogs")
@Primary
public class DogPetService implements PetService {
    @Override
    public String getPetType() {
        return "DogPetService --> Dogs Rule!";
    }
}

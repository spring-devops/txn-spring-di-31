package testapps.springframework.txnspringdi31.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("PD")
@Primary
@Service("dogs")
public class DogPetService implements PetService{
    @Override
    public String getPetType() {
        return "DogPetService --> Dogs Rule!";
    }
}

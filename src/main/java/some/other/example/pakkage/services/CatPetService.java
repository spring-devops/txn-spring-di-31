package some.other.example.pakkage.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"PC", "default"})
@Service("cats")
public class CatPetService implements PetService{
    @Override
    public String getPetType() {
        return "CatPetService ---> Cats Rock!";
    }
}

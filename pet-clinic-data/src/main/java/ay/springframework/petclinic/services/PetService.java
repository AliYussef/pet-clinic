package ay.springframework.petclinic.services;

import ay.springframework.petclinic.model.Pet;

import java.util.Set;
/**
 * @author aliyussef
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}

package ay.springframework.petclinic.services.map;

import ay.springframework.petclinic.model.Pet;
import ay.springframework.petclinic.services.CrudService;

import java.util.Set;

/**
 * Created by aliyussef on 25/02/2021
 */
public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}

package ay.springframework.petclinic.services.map;

import ay.springframework.petclinic.model.Owner;
import ay.springframework.petclinic.services.CrudService;

import java.util.Set;

/**
 * Created by aliyussef on 25/02/2021
 */
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}

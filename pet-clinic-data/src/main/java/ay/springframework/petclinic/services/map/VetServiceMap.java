package ay.springframework.petclinic.services.map;

import ay.springframework.petclinic.model.Vet;
import ay.springframework.petclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by aliyussef on 25/02/2021
 */
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}

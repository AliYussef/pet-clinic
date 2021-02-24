package ay.springframework.petclinic.services;

import ay.springframework.petclinic.model.Vet;

import java.util.Set;

/**
 * @author aliyussef
 */
public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}

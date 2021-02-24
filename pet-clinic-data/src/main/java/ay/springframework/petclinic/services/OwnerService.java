package ay.springframework.petclinic.services;

import ay.springframework.petclinic.model.Owner;

import java.util.Set;
/**
 * @author aliyussef
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}

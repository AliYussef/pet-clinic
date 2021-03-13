package ay.springframework.petclinic.services;

import ay.springframework.petclinic.model.Owner;

import java.util.List;

/**
 * @author aliyussef
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
}

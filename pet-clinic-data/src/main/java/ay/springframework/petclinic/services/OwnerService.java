package ay.springframework.petclinic.services;

import ay.springframework.petclinic.model.Owner;

/**
 * @author aliyussef
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}

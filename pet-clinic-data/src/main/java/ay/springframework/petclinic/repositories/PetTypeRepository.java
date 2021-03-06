package ay.springframework.petclinic.repositories;

import ay.springframework.petclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by aliyussef on 06/03/2021
 */
@Repository
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}

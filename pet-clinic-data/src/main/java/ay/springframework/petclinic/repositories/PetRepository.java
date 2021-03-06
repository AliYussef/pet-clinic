package ay.springframework.petclinic.repositories;

import ay.springframework.petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by aliyussef on 06/03/2021
 */
@Repository
public interface PetRepository extends CrudRepository<Pet, Long> {
}

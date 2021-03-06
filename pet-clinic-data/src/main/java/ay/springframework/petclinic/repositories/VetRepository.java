package ay.springframework.petclinic.repositories;

import ay.springframework.petclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by aliyussef on 06/03/2021
 */
@Repository
public interface VetRepository extends CrudRepository<Vet, Long> {
}

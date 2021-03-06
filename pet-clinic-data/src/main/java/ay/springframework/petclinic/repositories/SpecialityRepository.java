package ay.springframework.petclinic.repositories;

import ay.springframework.petclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by aliyussef on 06/03/2021
 */
@Repository
public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}

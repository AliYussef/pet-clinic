package ay.springframework.petclinic.model;

import javax.persistence.*;
import java.util.Set;

/**
 * @author aliyussef
 */
@Entity
@Table(name = "vets")
public class Vet extends Person {

    //by default many to many is lazy, that means when fetching the vets the speciality will be null.
    // so doing eager fetch will ensure it load everything without explicitly asking for the speciality
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "vet_specialities", joinColumns = @JoinColumn(name = "vet_id"),
            inverseJoinColumns = @JoinColumn(name = "speciality_id"))
    private Set<Speciality> specialities;

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}

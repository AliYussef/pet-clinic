package ay.springframework.petclinic.model;

import java.util.Set;

/**
 * @author aliyussef
 */
public class Owner extends Person {

    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}

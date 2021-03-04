package ay.springframework.petclinic.model;

/**
 * Created by aliyussef on 04/03/2021
 */
public class Speciality extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

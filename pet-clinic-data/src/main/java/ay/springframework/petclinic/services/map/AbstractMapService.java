package ay.springframework.petclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by aliyussef on 25/02/2021
 * One way of saving data is using map
 */
public abstract class AbstractMapService<T, ID> {

    protected Map<ID, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(ID id, T object) {
        map.put(id, object);

        return object;
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }
}

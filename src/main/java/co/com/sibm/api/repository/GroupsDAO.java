package co.com.sibm.api.repository;

import co.com.sibm.api.model.Group;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author usuario
 */
public interface GroupsDAO extends CrudRepository<Group, Long>{
    
    //Group update(Group model);
}

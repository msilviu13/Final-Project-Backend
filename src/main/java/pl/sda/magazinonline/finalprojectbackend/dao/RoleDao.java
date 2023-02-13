package pl.sda.magazinonline.finalprojectbackend.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.sda.magazinonline.finalprojectbackend.entity.Role;

@Repository
public interface RoleDao extends CrudRepository<Role, String> {

}
